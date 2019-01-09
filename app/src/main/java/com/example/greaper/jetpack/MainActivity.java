package com.example.greaper.jetpack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.greaper.jetpack.databinding.BindingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dataBinding(View view) {
        startActivity(new Intent(MainActivity.this, BindingActivity.class));
    }
}
