package com.lee.jayson;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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

    public void display1(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }

    public void process(View v){
        Intent i = null, chooser = null;
        if (v.getId()==R.id.Next){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.60981, 120.989662?q=14.60981, 120.989662(University+of+Santo+Tomas)"));
            chooser = Intent.createChooser(i,"Select your preference");
            startActivity(chooser);
        }
    }
}
