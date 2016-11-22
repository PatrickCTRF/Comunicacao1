package com.example.patrick.comunicacao1;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

/**
 * Created by patrick on 11/22/16.
 */
public class MyHandler extends Handler {


    static final int SAY_POSITIVO = 0;
    static final int SAY_NEGATIVO = 1;
    Context contexto;

    public MyHandler(Context contexto) {
        super();
        this.contexto = contexto;
    }

    @Override
    public void handleMessage(Message msg) {
        // TODO Auto-generated method stub
        super.handleMessage(msg);
        switch (msg.what) {
            case SAY_POSITIVO:
                Toast.makeText(contexto, "POSITIVO", Toast.LENGTH_LONG).show();
                break;
            case SAY_NEGATIVO:
                Toast.makeText(contexto, "NEGATIVO", Toast.LENGTH_LONG).show();
                break;


        }
    }
}