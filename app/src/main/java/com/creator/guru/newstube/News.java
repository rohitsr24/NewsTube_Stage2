package com.creator.guru.newstube;

public class News {

    String title;
    String author;
    String url;
    String date;
    String section;

    public News(String title, String author, String date, String url, String section) {
        this.title = title;
        this.author = author;
        this.url = url;
        this.date = date;
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                ", date='" + date + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
