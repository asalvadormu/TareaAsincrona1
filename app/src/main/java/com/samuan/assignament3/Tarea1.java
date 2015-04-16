package com.samuan.assignament3;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by SAMUAN on 15/04/2015.
 */
public class Tarea1 extends AsyncTask<String, Integer, String>{

    /**
     this not problem just take and store somewhere parameter from onPostExecute
     of authTask and when authTask finished pass it to imageTask**/

    /**if(authTask .getStatus() == AsyncTask.Status.PENDING){
     // My AsyncTask has not started yet
     }

     if(authTask .getStatus() == AsyncTask.Status.RUNNING){
     // My AsyncTask is currently doing work in doInBackground()
     }

     if(authTask .getStatus() == AsyncTask.Status.FINISHED){
     // START NEW TASK HERE
     }**/


    /**authTask.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR);
     // Image task will only be done AFTER textViewTask is done
     imageTask.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR);
     And for newer versions a simple

     ...
     // ICS+ and pre honeycomb (I think)
     authTask.execute();
     // Image task will only be done AFTER textViewTask is done
     imageTask.execute();
     ...**/

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
        a=a+1/2+20;

        return "terminado "+a;
    }

    @Override
    protected void onProgressUpdate(Integer... progress) {

    }

    @Override
    protected void onPostExecute(String result) {
        Log.i("ALGO", "EL RESULTADO " + result);
    }


}
