package com.example.boris.todayguardiannews;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by boris on 11/9/2016.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    String url;
    public NewsLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (url == null) {
            return null;
        }
        return Utils.fetchEarthquakeData(url);
    }
}