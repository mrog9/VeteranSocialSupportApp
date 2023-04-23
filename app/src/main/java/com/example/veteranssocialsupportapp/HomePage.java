package com.example.veteranssocialsupportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void openMyGroups(View view){
        Intent intent= new Intent(this, MyGroupsPage.class);
        startActivity(intent);
    }

    public void openSearchPage(View view){
        Intent intent= new Intent(this, SearchPage.class);
        startActivity(intent);
    }

    public void openCreateGroupPage(View view){
        Intent intent= new Intent(this, CreateGroupPage.class);
        startActivity(intent);
    }

    public void openMessagePage(View view){
        Intent intent= new Intent(this, MessagePage.class);
        startActivity(intent);
    }

    public void openProfilePage(View view){
        Intent intent= new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

}