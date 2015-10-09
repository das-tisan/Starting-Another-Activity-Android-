package com.example.tisan.startinganotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        
        //Get Message from Intent
        Intent intent = getIntent();

//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message = intent.getStringExtra("message");

        Log.d("SECONDACTIVITY", "Intent is starting");

        //Show the message
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(message);

//        setContentView(R.layout.activity_second);


    }
}
