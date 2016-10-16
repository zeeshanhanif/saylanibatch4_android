package com.example.android.demosecondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomeWork(View view){
        //Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show();
        TextView tv =  (TextView)findViewById(R.id.text1);
        tv.setText("Updated from UI");
    }
}
