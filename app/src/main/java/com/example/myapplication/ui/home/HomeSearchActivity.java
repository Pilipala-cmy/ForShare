package com.example.myapplication.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SearchView;

import com.example.myapplication.R;

public class HomeSearchActivity extends AppCompatActivity {

    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_search);
        searchView = findViewById(R.id.home_search_page);


    }
}