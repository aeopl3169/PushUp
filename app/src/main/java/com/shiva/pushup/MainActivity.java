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
    String str = "ok";
    String str2 = "";
    int a = 10;
    int branch1 = 12+13+14;
    boolean t = true;
    String str3 = "ok Axis";

    @Override
    protected void onPause() {
        super.onPause();
    }
    String str = "ok";
    String str2 = "";
    int a = 10;
    int branch1 = 12+13+14;
    boolean t = true;
    String str3 = "ok Axis";

    @Override
    protected void onStop() {
        super.onStop();
    }
}
