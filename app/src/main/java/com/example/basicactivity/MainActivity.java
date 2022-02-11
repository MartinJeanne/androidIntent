package com.example.basicactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity", "Create !");
    }

    public void goSecond(View view) {
        Intent secondActivityIntent = new Intent(this, SecondActivity.class);
        startActivity(secondActivityIntent);
    }

    // Application state
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "Start !");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "Resume !");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "Pause !");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "Stop !");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "Destroy !");
    }
}