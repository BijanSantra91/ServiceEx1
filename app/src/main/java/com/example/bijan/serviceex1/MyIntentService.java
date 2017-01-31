package com.example.bijan.serviceex1;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("HELLO");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

//        we can non touch UI fron handler intent because its a backgroud thread.
        Toast.makeText(MyIntentService.this, "Service is started", Toast.LENGTH_SHORT).show();

        Log.d("HELLO", "started");
    }
}
