package com.everis.microservices.reviews.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * Created by jordi on 26/03/15.
 */
public class Review {
    @Id
    private String id;

    @Indexed
    private String imdbID;

    @Indexed
    private String userName;

    private String review;

    private int rating;

    public String getId() {
        return id;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getUserName() {
        return userName;
    }

    public String getReview() {
        return review;
    }

    public int getRating() {
        return rating;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
