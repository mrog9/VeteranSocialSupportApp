package com.example.veteranssocialsupportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
    }

    public void openHomepageFromProfilePage(View view){
        Intent intent= new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void openEditProfilePage(View view){
        Intent intent= new Intent(this, EditProfilePage.class);
        startActivity(intent);
    }
}