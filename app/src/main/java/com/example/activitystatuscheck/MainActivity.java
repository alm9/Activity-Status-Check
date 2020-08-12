package com.example.activitystatuscheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log; // to print in logcat

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ACTIVITY_STATUS", "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Status_of_activity", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Status_of_activity", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Status_of_activity", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Status_of_activity", "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Status_of_activity", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Status_of_activity", "onDestroy: ");
    }
}