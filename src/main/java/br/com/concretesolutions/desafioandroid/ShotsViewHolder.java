package br.com.concretesolutions.desafioandroid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by alvaro on 25/09/2015.
 */
public class ShotsViewHolder extends RecyclerView.ViewHolder{
    public ImageView imgShot;
    public ProgressBar progressBar;
    public TextView txtDetail;
    public TextView txtShots;
    public int id;

    public ShotsViewHolder(View itemView) {
        super(itemView);
        //Views
        this.imgShot = (ImageView) itemView.findViewById(R.id.imgShot);
        this.progressBar = (ProgressBar) itemView.findViewById(R.id.progress);
        this.txtDetail = (TextView) itemView.findViewById(R.id.txtDetail);
        this.txtShots = (TextView) itemView.findViewById(R.id.txtShots);
    }
}
