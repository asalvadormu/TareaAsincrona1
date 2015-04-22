package com.samuan.assignament3;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import java.net.MalformedURLException;

/**
 * Created by SAMUAN on 15/04/2015.
 */
public class Tarea1 extends AsyncTask<String, Integer, Uri>{

    public RespuestaAsincrona delegate=null;
    public Context context;
    //cambiar a carga en constructor

    public Tarea1(Context context){
        this.context=context;
    }

    @Override
    protected Uri doInBackground(String[] params) {
        Uri myUri = Uri.parse(params[0]);
        Uri direccionImagen=Utils.downloadImage( context , myUri );
        return direccionImagen;
    }

    @Override
    protected void onProgressUpdate(Integer... progress) {
    }

    @Override
    protected void onPostExecute(Uri result) {
        Log.i("ALGO", "EL RESULTADO " + result);
        delegate.procesarFin(1,result);
    }


}
