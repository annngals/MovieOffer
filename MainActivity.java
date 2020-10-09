package com.example.movieoffer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView movieTV;
    ArrayList<String> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movies = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.movies)));
        movieTV = findViewById(R.id.movieNameTV);
    }

    public void onClick(View v){
        if (movies.size() != 0) {
            int randomId = (int) (Math.random() * movies.size());
            String movie = movies.get(randomId);
            movieTV.setText(movie);
            movies.remove(randomId);
        }
        else movieTV.setText("Run out of movies");
    }

}