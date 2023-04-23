package com.example.veteranssocialsupportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCreateProfile(View view){
        Intent intent= new Intent (this, CreateProfile.class);
        startActivity(intent);
    }

    public void openLogIn(View view){
        Intent intent= new Intent (this, LogInActivity.class);
        startActivity(intent);
    }
}