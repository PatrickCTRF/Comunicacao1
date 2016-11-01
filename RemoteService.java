package com.example.patrick.comunicacao1;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by patrick on 10/31/16.
 */
public class RemoteService extends Service {

    static final int SAY_POSITIVO = 0;
    static final int SAY_NEGATIVO = 1;

    class MyHandler extends Handler
    {

        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            super.handleMessage(msg);
            switch(msg.what)
            {
                case SAY_POSITIVO:
                    Toast.makeText(getApplicationContext(), "POSITIVO", Toast.LENGTH_LONG).show();
                    break;
                case SAY_NEGATIVO:
                    Toast.makeText(getApplicationContext(), "NEGATIVO", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

    Messenger mMessenger = new Messenger(new MyHandler());
    @Override
    public IBinder onBind(Intent arg0) {
        // TODO Auto-generated method stub
        return mMessenger.getBinder();

    }

}
