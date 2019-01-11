package com.example.chen.desutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String desEncrypt = Util.DESEncrypt(this, "陈祎喆", "123456");
        Log.e("CHEN", "desEncrypt: " + desEncrypt);
    }
}
