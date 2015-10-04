package br.com.concretesolutions.desafioandroid.rest;

import android.content.Context;


import org.json.JSONException;

import java.io.IOException;

import br.com.concretesolutions.desafioandroid.defs.IShotsRESTService;
import br.com.concretesolutions.desafioandroid.models.Shot;
import br.com.concretesolutions.desafioandroid.models.Shots;
import br.com.concretesolutions.desafioandroid.utils.JSONUtil;
import br.com.concretesolutions.desafioandroid.utils.NetUtil;

/**
 * Created by alvaro on 25/09/2015.
 */
public class ShotsRESTService implements IShotsRESTService {
    public static String resposta = null;


    private ShotsRESTService(){
        //faz nada
    }
    public static ShotsRESTService getInstance (){
        return new ShotsRESTService();
    }

    public Shots getShots(Context context,int page) throws IOException, JSONException {

        String url = URL_SHOTS.replace("{pagina}", String.valueOf(page));
        NetUtil netu = new NetUtil();
        String resposta = netu.doGet(context,url);
        JSONUtil ju = new JSONUtil();
        return  ju.parseJSONShots(resposta);
        }

    public Shot getShotDetails (Context context, int id) throws IOException {
        String url = URL_SHOT_DETAILS.replace("{id}", String.valueOf(id));
        NetUtil netu = new NetUtil();
        String resposta = netu.doGet(context,url);
        JSONUtil ju = new JSONUtil();
        return  ju.parseJSONShot(resposta);
    }


}