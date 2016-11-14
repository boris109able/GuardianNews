package com.example.boris.todayguardiannews;

/**
 * Created by boris on 11/9/2016.
 */

public class News {
    private String title;
    private String section;
    private String datePublished;
    private String url;

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public String getUrl() {
        return url;
    }

    public News(String title, String section, String datePublished, String url) {
        this.title = title;
        this.section = section;
        this.datePublished = datePublished;
        this.url = url;
    }
}
