package com.samuan.assignament3;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by SAMUAN on 16/04/2015.
 */
public class Tarea2 extends AsyncTask<String,Integer,Uri>{

    private Context context;
    public RespuestaAsincrona delegate=null;

    public Tarea2(Context context){
        this.context=context;
    }

    @Override
    protected Uri doInBackground(String[] params) {
        Uri myUri = Uri.parse(params[0]);
        Uri direccionImagen=Utils.grayScaleFilter(context, myUri);
        return direccionImagen;
    }

    @Override
    protected void  onPreExecute(){}

    @Override
    protected void onProgressUpdate(Integer... progress) {

    }

    @Override
    protected void onPostExecute(Uri result) {
        delegate.procesarFin(2,result);
        Log.i("ALGO", "EL RESULTADO de 2 " + result);
    }
}
