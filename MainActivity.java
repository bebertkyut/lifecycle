package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "CREATED!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "STARTED!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "RESUMED!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "PAUSED!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "STOPPED!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "RESTARTED!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "DESTROYED!", Toast.LENGTH_SHORT).show();
    }
}