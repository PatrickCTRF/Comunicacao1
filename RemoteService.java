package com.example.patrick.comunicacao1;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

/**
 * Created by patrick on 10/31/16.
 */
public class RemoteService extends Service {


    Messenger mMessenger;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        mMessenger = new Messenger(new MyHandler(getApplicationContext()));

        Toast.makeText(this, "Service Started", LENGTH_LONG).show();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {

        super.onDestroy();

        Toast.makeText(this, "Service Destroyed", LENGTH_LONG).show();

    }


    @Override
    public IBinder onBind(Intent arg0) {
        // TODO Auto-generated method stub
        return mMessenger.getBinder();

    }

}
