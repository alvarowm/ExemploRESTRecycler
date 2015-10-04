package br.com.concretesolutions.desafioandroid.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by alvaro on 26/09/2015.
 */
public class NetUtil {

    public boolean seOnLine(Context context) {
        if (context == null)
            return false;
        ConnectivityManager connec = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (ConnectivityManager.isNetworkTypeValid(ConnectivityManager.TYPE_WIFI) && connec.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED)
            return true;
        if (ConnectivityManager.isNetworkTypeValid(ConnectivityManager.TYPE_MOBILE) && connec.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED)
            return true;

        return false;
    }

    public String doGet (Context context,String url) throws IOException {
        java.net.URL u = new URL(url);

        HttpURLConnection conn = null;
        String s = null;
        try {
            conn = (HttpURLConnection) u.openConnection();
            conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            conn.setRequestProperty( "Accept", "*/*" );
            conn.setRequestMethod("GET");
            conn.connect();
            InputStream in = null;
            int status = conn.getResponseCode();
            in = conn.getInputStream();
            return  StringUtil.getStringFromInputStream(in);

        } catch (IOException e) {
            throw e;
        } finally {
            if (conn != null) {
                conn.disconnect();
            }

        }
    }
}
