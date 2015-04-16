package com.samuan.assignament3;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by SAMUAN on 15/04/2015.
 */
public class Tarea1 extends AsyncTask<String, Integer, String>{

    public RespuestaAsincrona delegate=null;

    @Override
    protected String doInBackground(String[] params) {

        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        int a=5;
        a=a+1/2;

        return "terminado"+a;
    }

    @Override
    protected void onProgressUpdate(Integer... progress) {

    }

    @Override
    protected void onPostExecute(String result) {
        Log.i("ALGO", "EL RESULTADO " + result);
        delegate.procesarFin(result);
    }


}
