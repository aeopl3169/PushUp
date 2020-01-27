package com.shiva.pushup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("ok");
        System.out.println("branch1");
    }
    String str = "jon";
    String str2 = "peter";
    int a = 689;
    int branch1 = 23+45+56;
    boolean t = false;
    String str3 = "ok Axis";

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
