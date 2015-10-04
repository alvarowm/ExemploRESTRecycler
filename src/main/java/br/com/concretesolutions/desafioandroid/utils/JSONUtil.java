package br.com.concretesolutions.desafioandroid.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.concretesolutions.desafioandroid.models.Shot;
import br.com.concretesolutions.desafioandroid.models.Shots;

/**
 * Created by alvaro on 26/09/2015.
 */
public class JSONUtil {

    public Shots parseJSONShots (String resposta){
        Gson gson = new GsonBuilder().create();
        Shots shots = gson.fromJson(resposta, Shots.class);
        return shots;
    }

    public Shot parseJSONShot (String resposta){
        Gson gson = new GsonBuilder().create();
        Shot shot = gson.fromJson(resposta, Shot.class);
        return shot;
    }



}
