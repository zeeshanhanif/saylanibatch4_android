package com.example.android.demofragments2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FirstFragment.FirstFragmentCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showFragment1(View view) {
        Toast.makeText(this,"Fragment 1",Toast.LENGTH_SHORT).show();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContent,new FirstFragment())
                .commit();
    }

    public void showFragment2(View view) {
        Toast.makeText(this,"Fragment 2",Toast.LENGTH_SHORT).show();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContent,new SecondFragment())
                .commit();
    }

    public void showFragment3(View view) {
        Toast.makeText(this,"Fragment 3",Toast.LENGTH_SHORT).show();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContent,new ThirdFragment())
                .commit();
    }

    @Override
    public void doSomeWork(String message) {
        Toast.makeText(this,"Found message in Activity "+message,Toast.LENGTH_SHORT).show();
    }
}
