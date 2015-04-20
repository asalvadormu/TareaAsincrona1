package com.samuan.assignament3;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity implements RespuestaAsincrona{

    Tarea1 tarea1;
    Tarea2 tarea2;

    private EditText texto;
    public ImageView imagen;
    private ImageView imagen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TAG", "inicio");
        texto=(EditText) findViewById(R.id.editText);
        imagen=(ImageView) findViewById(R.id.imageView);
        imagen2=(ImageView) findViewById(R.id.imageView2);



        Log.i("TAG","final");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onclick(View v){

        tarea1= new Tarea1(getApplicationContext()); //aqui para hacer un nuevo objeto y solo ejecutar la tarea asincrona una vez.
        tarea1.delegate=this;
        tarea2= new Tarea2(getApplicationContext());
        tarea2.delegate=this;

        //captura texto de la direccion de la imange
        //generar tarea 1 para descarga de imagen
        String direc = String.valueOf(texto.getText());
        Log.i("ASIG3","click "+direc);

        tarea1.execute(direc);
    }

    @Override
    public void procesarFin(int cual,Uri salida) {
        Log.i("TAG","procesado fin: cual: "+cual+" salida: "+salida);
        if(cual==1){
            imagen.setImageURI(salida); //mostrar en pantalla en color
            tarea2.execute(salida.toString());
        }else{
            imagen2.setImageURI(salida); //imagen en gris
        }
    }
}
