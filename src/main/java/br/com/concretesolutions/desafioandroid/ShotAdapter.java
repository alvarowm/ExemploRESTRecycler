package br.com.concretesolutions.desafioandroid;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import br.com.concretesolutions.desafioandroid.defs.IShotOnClickListener;
import br.com.concretesolutions.desafioandroid.models.Shot;
import br.com.concretesolutions.desafioandroid.models.Shots;

/**
 * Created by alvaro on 25/09/2015.
 */
public class ShotAdapter extends RecyclerView.Adapter<ShotsViewHolder> {

    private Shots shots;
    private Context context;
    private IShotOnClickListener listener;

public ShotAdapter (Context context, Shots shots,IShotOnClickListener listener){
    this.context = context;
    this.shots = shots;
    this.listener = listener;
}

    @Override
    public ShotsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_shot, parent, false);
        ShotsViewHolder holder = new ShotsViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ShotsViewHolder holder, final int position) {
        Shot s = shots.getShots().get(position);
        holder.progressBar.getIndeterminateDrawable().setColorFilter(Color.BLACK, android.graphics.PorterDuff.Mode.MULTIPLY);
        holder.txtDetail.setText(s.getTitle());
        holder.txtShots.setText(String.valueOf(s.getLikesCount()));
        holder.id = s.getId();
        Picasso.with(context).load(s.getImageUrl()).fit().into(holder.imgShot, new Callback() {
            @Override
            public void onSuccess() {

                holder.progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onError() {
                holder.progressBar.setVisibility(View.GONE);
            }
        });

        if (listener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClickShot(holder.itemView, holder.id);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return this.shots != null ? this.shots.getShots().size() : 0;
    }


}

