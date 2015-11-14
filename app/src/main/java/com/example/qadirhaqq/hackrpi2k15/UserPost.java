package com.example.qadirhaqq.hackrpi2k15;

import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by dcr on 11/14/15.
 */
public class UserPost {

    private String message;
    private double latitude;
    private double longitude;
    private Date timeOfPost;
    private int upvotes;
    private TextView textView;

    public UserPost(String msg, double latitude, double longitude) {

        this.message = msg;
        this.latitude = latitude;
        this.longitude = longitude;

        this.timeOfPost = Calendar.getInstance().getTime();
        this.upvotes = 0;
    }

    public void upVote() { this.upvotes++; }

    public void downVote() { this.upvotes--; }

    public void setMessage(String msg) { this.message = msg; }

    public void setLatitude(double lat) { this.latitude = lat; }

    public void setLongitude(double lon) { this.longitude = lon; }

    public void setTimeOfPost(Date obj) { this.timeOfPost = obj; }

    public String getMessage() { return message; }

    public Date getTimeOfPost() { return timeOfPost; }

    public int getUpvotes() { return upvotes; }
}
