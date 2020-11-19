package com.example.movies.moviesnew;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.movies.R;

import java.util.ArrayList;
import java.util.List;


    public class MovieAdapter extends ArrayAdapter<Movie> {

        private Context mContext;
        private List<Movie> moviesList = new ArrayList<>();

        public MovieAdapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<Movie> list) {
            super(context, 0 , list);
            mContext = context;
            moviesList = list;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItem = convertView;
            if(listItem == null)
                listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

            Movie currentMovie = moviesList.get(position);

            ImageView image = (ImageView)listItem.findViewById(R.id.imageView_poster);
            image.setImageResource(currentMovie.getmImageDrawable());

            TextView name = (TextView) listItem.findViewById(R.id.textView_name);
            name.setText(currentMovie.getmName());

            TextView release = (TextView) listItem.findViewById(R.id.textView_Rating);
            release.setText(currentMovie.getmRatings());

            TextView director = (TextView) listItem.findViewById(R.id.textView_Description);
            director.setText(currentMovie.getmDescription());

            return listItem;
        }
    }
