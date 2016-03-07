package com.zakoopi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dharam on 3/7/2016.
 */
public class StoreReviewLastComments {

    @SerializedName("id")
    String id;
    @SerializedName("store_review_id")
    String store_review_id;
    @SerializedName("user_id")
    String user_id;
    @SerializedName("comment")
    String comment;
    @SerializedName("posted_on")
    String posted_on;
    @SerializedName("status")
    String status;
    StoreReviewLastCommentsUser user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStore_review_id() {
        return store_review_id;
    }

    public void setStore_review_id(String store_review_id) {
        this.store_review_id = store_review_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPosted_on() {
        return posted_on;
    }

    public void setPosted_on(String posted_on) {
        this.posted_on = posted_on;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StoreReviewLastCommentsUser getUser() {
        return user;
    }

    public void setUser(StoreReviewLastCommentsUser user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
