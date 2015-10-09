package com.example.tisan.startinganotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    public final static String EXTRA_MESSAGE="ASDF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et = (EditText) findViewById(R.id.editText_infoToSecondActivity);

        Button btn_secondActivity = (Button) findViewById(R.id.button_switchToSecond);
        btn_secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create Intent to pass data and start Activity
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                String message = et.getText().toString();
                intent.putExtra("message",message);

                Log.d("MAINACTIVITY", "Intent is starting");
                //Start Activity
                startActivity(intent);
            }
        });
    }


}
