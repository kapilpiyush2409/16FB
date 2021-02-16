package com.upgard.BlogPostApplication.model;

import java.util.Date;
//PJOJ -> plain old java object
public class Post {
    // components of the post
    private String title;
    private String body;
    private Date date;

    // Getters and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}