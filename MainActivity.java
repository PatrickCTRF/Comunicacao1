package com.example.patrick.comunicacao1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static EditText editTextAddress, editTextPort;
    public static TextView response;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle savedInstanceState2 = savedInstanceState;
        setContentView(R.layout.activity_main);

        response = (TextView) findViewById(R.id.responseTextView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main, menu);
        return false;//Estou retornando False para o menu nao ser exibido. VErificar se vai dar certo!!
    }

    // Método que dará início ao servico de background.
    public void startService(View view) {
        startService(new Intent(getBaseContext(), RemoteService.class));//Como aki eu invoco um metodo q nao foi implementado??? Ele pertence a Context.
    }

    // Metodo que parara o servico
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), RemoteService.class));
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return false;//true

    }*/

}
