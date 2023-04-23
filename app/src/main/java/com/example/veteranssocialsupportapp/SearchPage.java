package com.example.veteranssocialsupportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
    }

    public void openHomepageFromSearchPage(View view){
        Intent intent= new Intent(this, HomePage.class);
        startActivity(intent);
    }


}