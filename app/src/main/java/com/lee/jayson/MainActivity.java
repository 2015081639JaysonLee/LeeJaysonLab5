package com.lee.jayson;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITF", "onCreate has executed...");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    protected void onStart(){
        super.onStart();
        Log.d("4ITF", "onStart has executed...");
    }

    protected void onResume(){
        super.onResume();
        Log.d("4ITF", "onResume has executed...");
    }

    protected void onPause(){
        super.onPause();
        Log.d("4ITF", "onPause has started");
    }

    protected void onStop(){
        super.onStop();
        Log.d("4ITF", "onStop has executed...");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("4ITF", "onRestart is again executed");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITF", "onDestroy has destroyed the app");
    }

    public void showSecondAct(View view){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if (v.getId()==R.id.Next){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.639445, 121.077986?q=14.639445, 121.077986(Ateneo+de+Manila+University)"));
            chooser = Intent.createChooser(i,"Select your preference");
            startActivity(i);
        }
    }
}
