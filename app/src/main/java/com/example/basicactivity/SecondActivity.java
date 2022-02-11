package com.example.basicactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i("SecondActivity", "Create !");
    }

    public void goMain(View view) {
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);
    }

    // Application state
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SecondActivity", "Start !");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SecondActivity", "Resume !");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SecondActivity", "Pause !");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SecondActivity", "Stop !");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SecondActivity", "Destroy !");
    }
}