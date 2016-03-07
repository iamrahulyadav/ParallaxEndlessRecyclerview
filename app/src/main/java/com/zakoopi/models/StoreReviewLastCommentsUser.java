package com.zakoopi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dharam on 3/7/2016.
 */
public class StoreReviewLastCommentsUser {

    @SerializedName("id")
    String id;
    @SerializedName("slug")
    String slug;
    @SerializedName("android_api_img")
    String android_api_img;
    @SerializedName("name")
    String name;
    @SerializedName("points")
    String points;
    @SerializedName("pro_review_count")
    String pro_review_count;
    @SerializedName("pro_likes_count")
    String pro_likes_count;
    @SerializedName("lookbook_draft_count")
    String lookbook_draft_count;
    @SerializedName("lookbook_active_count")
    String lookbook_active_count;
    @SerializedName("article_active_count")
    String article_active_count;
    @SerializedName("question_active_count")
    String question_active_count;


    public String getLookbook_active_count() {
        return lookbook_active_count;
    }

    public void setLookbook_active_count(String lookbook_active_count) {
        this.lookbook_active_count = lookbook_active_count;
    }

    public String getQuestion_active_count() {
        return question_active_count;
    }

    public void setQuestion_active_count(String question_active_count) {
        this.question_active_count = question_active_count;
    }

    public String getArticle_active_count() {
        return article_active_count;
    }

    public void setArticle_active_count(String article_active_count) {
        this.article_active_count = article_active_count;
    }

    public String getLookbook_draft_count() {
        return lookbook_draft_count;
    }

    public void setLookbook_draft_count(String lookbook_draft_count) {
        this.lookbook_draft_count = lookbook_draft_count;
    }

    public String getPro_likes_count() {
        return pro_likes_count;
    }

    public void setPro_likes_count(String pro_likes_count) {
        this.pro_likes_count = pro_likes_count;
    }

    public String getPro_review_count() {
        return pro_review_count;
    }

    public void setPro_review_count(String pro_review_count) {
        this.pro_review_count = pro_review_count;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAndroid_api_img() {
        return android_api_img;
    }

    public void setAndroid_api_img(String android_api_img) {
        this.android_api_img = android_api_img;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
