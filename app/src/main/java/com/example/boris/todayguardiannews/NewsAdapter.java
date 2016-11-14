package com.example.boris.todayguardiannews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by boris on 11/9/2016.
 */

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> n) {
        super(context, 0, n);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View currentView = convertView;
        if (currentView == null) {
            currentView = LayoutInflater.from(getContext()).inflate(R.layout.news_item, parent, false);
        }
        News now = getItem(position);

        TextView titleTextView = (TextView) currentView.findViewById(R.id.title);
        titleTextView.setText(now.getTitle());

        TextView sectionTextView = (TextView) currentView.findViewById(R.id.section);
        sectionTextView.setText(now.getSection());

        TextView dateTextView = (TextView) currentView.findViewById(R.id.date);
        dateTextView.setText(now.getDatePublished());

        return currentView;
    }
}
