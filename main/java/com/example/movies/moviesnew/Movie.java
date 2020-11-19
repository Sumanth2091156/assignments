package com.example.movies.moviesnew;

public class Movie {
    // Store the id of the  movie poster
    private int mImageDrawable;
    // Store the name of the movie
    private String mName;

    // Store the release date of the movie
    private String mRatings;
    private String mDescription;

    // Constructor that is used to create an instance of the Movie object
    public Movie(String mName, String mRatings,String mDescription,int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
        this.mName = mName;
        this.mRatings = mRatings;
        this.mDescription=mDescription;
    }

    public int getmImageDrawable() {
        return mImageDrawable;
}
    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
    public String getmRatings() {
        return mRatings;
    }

    public void setmRatings(String mRatings) {
        this.mRatings = mRatings;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }


}

