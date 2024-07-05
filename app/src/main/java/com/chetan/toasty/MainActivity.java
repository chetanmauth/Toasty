package com.chetan.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chetan.tossty.Tossy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tossy.showTossy(this,"this is toast");
    }
}