package com.example.muhammadjohn.assn2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment bf = new BlankFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, bf).commit();

        Log.d("Mtag", "Check");
    }
}
