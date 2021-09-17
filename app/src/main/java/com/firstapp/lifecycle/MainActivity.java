package com.firstapp.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"on Create method invoked",Toast.LENGTH_LONG).show();
        Log.d("abhay1","onCreate method invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"on Start method invoked",Toast.LENGTH_LONG).show();
        Log.d("abhay2","OnStart method invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart method invoked",Toast.LENGTH_LONG).show();
        Log.d("abhay3","OnRestart method invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause method invoked",Toast.LENGTH_LONG).show();
        Log.d("abhay4","OnPause method invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume method invoked",Toast.LENGTH_LONG).show();
        Log.d("abhay5","OnResume method invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop method invoked",Toast.LENGTH_LONG).show();
        Log.d("abhay6","OnStop method invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy method invoked",Toast.LENGTH_LONG).show();
        Log.d("abhay7","OnDestroy method invoked");
    }
}