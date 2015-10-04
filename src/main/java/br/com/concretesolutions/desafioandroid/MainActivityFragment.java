package br.com.concretesolutions.desafioandroid;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import br.com.concretesolutions.desafioandroid.defs.IShotOnClickListener;
import br.com.concretesolutions.desafioandroid.models.Shot;
import br.com.concretesolutions.desafioandroid.models.Shots;
import br.com.concretesolutions.desafioandroid.rest.ShotsRESTService;
import br.com.concretesolutions.desafioandroid.utils.NetUtil;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    protected RecyclerView recycler;
    private Shots shots;
    private int ultimoVisivel, totalItens;
    private LinearLayoutManager linearLayoutManager;
    static MainActivityFragment parent;
    private SwipeRefreshLayout swipe;
    private boolean seCarregando;
    private int pagina = 1;

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Foi colocado apenas um fragment para se conseguir um meio simples e controlar o estado
        setRetainInstance(true);
        parent = this;
    }

    @Override
    public void onActivityCreated (@Nullable Bundle savedInstanState){
        super.onActivityCreated(savedInstanState);
        buscaShots(1);
    }

    private void buscaShots(int pagina){
        NetUtil netUtil = new NetUtil();
        if (netUtil.seOnLine(getContext())){
            Integer [] params = new Integer [1] ;
            params[0] = pagina;
            new GetShotsTask().execute(params);
        } else
             Toast.makeText(getContext(),"Não posso exibir Shots! =( \n Verifique sua conexão com a Internet.", Toast.LENGTH_LONG).show();
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        recycler = (RecyclerView) view.findViewById(R.id.recycler);
        this.linearLayoutManager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(linearLayoutManager);
        recycler.setItemAnimator(new DefaultItemAnimator());
        recycler.setHasFixedSize(true);
        swipe = (SwipeRefreshLayout)view.findViewById(R.id.swipe);
        swipe.setOnRefreshListener(onRefreshListener());
        swipe.setColorSchemeResources(
                R.color.r1,
                R.color.r2,
                R.color.r3
        );

        recycler.setOnScrollListener(new RecyclerView.OnScrollListener(){
            @Override
            public void onScrolled(RecyclerView recyclerView,
                                   int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                totalItens = linearLayoutManager.getItemCount();
                ultimoVisivel = linearLayoutManager
                        .findLastVisibleItemPosition();
                //2 itens visíveis no máxixmo
                if (!seCarregando
                        && totalItens <= (ultimoVisivel + 2)) {
                    seCarregando = true;
                    buscaShots(++parent.pagina);
                }
            }
        });

        //recupera o contador de página
        if (savedInstanceState != null){
            this.pagina = savedInstanceState.getInt("contador");
        }

        return view;
    }

    private  SwipeRefreshLayout.OnRefreshListener onRefreshListener(){
        return new SwipeRefreshLayout.OnRefreshListener(){

            @Override
            public void onRefresh() {
                parent.pagina = 1;
                buscaShots(1);
            }
        };
    }

    private class GetShotsTask extends AsyncTask<Integer,Void, Shots>{
          @Override
        protected Shots doInBackground(Integer... params) {
              try {
                  return  ShotsRESTService.getInstance().getShots(getContext(),params[0]);
              }catch (Exception e){
                  return null;
              }
        }

        @Override
        protected void onPostExecute (Shots shots){
            if (shots != null){
                MainActivityFragment.this.shots = shots;
                recycler.setAdapter(new ShotAdapter(getContext(),shots, onClick()));
                swipe.setRefreshing(false);
                seCarregando = false;
            }
        }
    }

    private class GetShotDetailsTask extends AsyncTask<Integer,Void, Shot>{
        @Override
        protected Shot doInBackground(Integer... params) {
            try {

                return  ShotsRESTService.getInstance().getShotDetails(getContext(), params[0]);
            }catch (Exception e){
                return null;
            }
        }

        @Override
        protected void onPostExecute (Shot shot){
            if (shot != null){
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra("nome",shot.getPlayer().getName());
                intent.putExtra("avatar",shot.getPlayer().getAvatarUrl());
                intent.putExtra("likes", shot.getLikesCount());
                intent.putExtra("url",shot.getUrl());
                startActivity(intent);
            }
        }
    }

    private IShotOnClickListener onClick(){
        return new IShotOnClickListener() {
            @Override
            public void onClickShot(View view, int id) {
                NetUtil netUtil = new NetUtil();
                if (netUtil.seOnLine(getContext())){
                    Integer [] params = new Integer [1] ;
                    params[0] = id;
                    new GetShotDetailsTask().execute(params);
                } else
                    Toast.makeText(getContext(),"Sem conxão! \n Bola fora! =( \n ", Toast.LENGTH_LONG).show();
            }
        };
    }

    @Override
    public void onSaveInstanceState(Bundle bundle){
        super.onSaveInstanceState(bundle);
        bundle.putInt("contador", this.pagina);
    }

}
