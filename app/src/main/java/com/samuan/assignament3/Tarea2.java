package com.samuan.assignament3;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by SAMUAN on 16/04/2015.
 */
public class Tarea2 extends AsyncTask<String,Integer,String>{

    @Override
    protected String doInBackground(String[] params) {
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "terminado2 "+params[0];
    }

    @Override
    protected void  onPreExecute(){}

    @Override
    protected void onProgressUpdate(Integer... progress) {

    }

    @Override
    protected void onPostExecute(String result) {
        Log.i("ALGO", "EL RESULTADO de 2 " + result);
    }
}
