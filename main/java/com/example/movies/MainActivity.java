package com.example.movies;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movies.moviesnew.Movie;
import com.example.movies.moviesnew.MovieAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.movies_list);
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie("Batman" , "9/10" ,  "Wayne's family will take care of the city named Gotham to confront injustice. Bruce wayne will become responsible after his parent's death from a thief. He learns art of fighting and return to Gotham as Batman to stop a secret society.",R.drawable.batman));
        moviesList.add(new Movie("Disaster Artisit" , "7.5/10" ,  "An aspiring filmmaker Tommy Wiseau and actor Greg move to LA to look for Hollywood stardom.",R.drawable.disaster_artist));
        moviesList.add(new Movie("Kushi" , "8/10" ,  "A love story about Sidhu and Madhu who got divided due to misunderstanding. But they come together to help one of their friends and realise their love for each other has not ended",R.drawable.kushi));
        moviesList.add(new Movie( "Spyder" , "4/10" ,  "A guy named Mahesh acts as a spy for an Intelligence Bureau and his daily duty was to spy on the suspicious calls to protect from anything bad happening.",R.drawable.spyder));
        moviesList.add(new Movie("Zodiac","7/10","A cartoonist by profession finds himself obsessively thinking about the Zodiac killer and finds him.",R.drawable.zodiac));
        mAdapter = new MovieAdapter(this,moviesList);
        listView.setAdapter(mAdapter);

    }
}

