package br.com.concretesolutions.desafioandroid;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private ShareActionProvider mShareActionProvider;
    private String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String avatar = intent.getStringExtra("avatar");
        int likes = intent.getIntExtra("likes", 0);
        this.url = intent.getStringExtra("url");

        ImageView imgView = (ImageView) findViewById(R.id.imgShotDetail);
        TextView txtNome = (TextView) findViewById(R.id.txtNomeDetail);
        TextView txtLikes = (TextView) findViewById(R.id.txtDetailLikes);
        final ProgressBar pb =  (ProgressBar)findViewById(R.id.progressDetail);

        Picasso.with(getBaseContext()).load(avatar).fit().into(imgView, new Callback() {
            @Override
            public void onSuccess() {
                pb.setVisibility(View.GONE);
            }

            @Override
            public void onError() {
                pb.setVisibility(View.GONE);;
            }
        });

        txtNome.setText(nome);
        txtLikes.setText(String.valueOf(likes));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        MenuItem item = menu.findItem(R.id.sharedetail);

        mShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
        mShareActionProvider.setShareIntent(createShareIntent());

        return true;
    }

    public Intent createShareIntent() {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setAction(Intent.ACTION_SEND).putExtra(Intent.EXTRA_TEXT, url)
                .setType("text/plain");
        return share;
    }



}
