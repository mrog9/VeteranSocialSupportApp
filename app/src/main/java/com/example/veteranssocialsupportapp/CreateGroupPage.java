package com.example.veteranssocialsupportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateGroupPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_group_page);
    }

    public void openHomepageFromCreateGrp(View view){
        Intent intent= new Intent(this, HomePage.class);
        startActivity(intent);
    }
}