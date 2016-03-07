package com.zakoopi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dharam on 3/7/2016.
 */
public class StoreReviewData {

    @SerializedName("id")
    String id;
    @SerializedName("user_id")
    String user_id;
    @SerializedName("store_id")
    String store_id;
    @SerializedName("review")
    String review;
    @SerializedName("rated")
    String rated;
    @SerializedName("hits")
    String hits;
    @SerializedName("likes_count")
    String likes_count;
    @SerializedName("is_liked")
    String is_liked;
    @SerializedName("rated_color")
    String rated_color;
    @SerializedName("hits_text")
    String hits_text;
    @SerializedName("store_name")
    String store_name;
    @SerializedName("store_overall_rating")
    String store_overall_rating;
    @SerializedName("store_slug")
    String store_slug;
    @SerializedName("store_market_name")
    String store_market_name;
    @SerializedName("store_city_id")
    String store_city_id;
    @SerializedName("comment_count")
    String comment_count;
    StoreReviewStores store;
    StoreReviewUser user;
    StoreReviewLastComments last_comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getHits() {
        return hits;
    }

    public void setHits(String hits) {
        this.hits = hits;
    }

    public String getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(String likes_count) {
        this.likes_count = likes_count;
    }

    public String getIs_liked() {
        return is_liked;
    }

    public void setIs_liked(String is_liked) {
        this.is_liked = is_liked;
    }

    public String getRated_color() {
        return rated_color;
    }

    public void setRated_color(String rated_color) {
        this.rated_color = rated_color;
    }

    public String getHits_text() {
        return hits_text;
    }

    public void setHits_text(String hits_text) {
        this.hits_text = hits_text;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_overall_rating() {
        return store_overall_rating;
    }

    public void setStore_overall_rating(String store_overall_rating) {
        this.store_overall_rating = store_overall_rating;
    }

    public String getStore_slug() {
        return store_slug;
    }

    public void setStore_slug(String store_slug) {
        this.store_slug = store_slug;
    }

    public String getStore_market_name() {
        return store_market_name;
    }

    public void setStore_market_name(String store_market_name) {
        this.store_market_name = store_market_name;
    }

    public String getStore_city_id() {
        return store_city_id;
    }

    public void setStore_city_id(String store_city_id) {
        this.store_city_id = store_city_id;
    }

    public String getComment_count() {
        return comment_count;
    }

    public void setComment_count(String comment_count) {
        this.comment_count = comment_count;
    }

    public StoreReviewStores getStore() {
        return store;
    }

    public void setStore(StoreReviewStores store) {
        this.store = store;
    }

    public StoreReviewUser getUser() {
        return user;
    }

    public void setUser(StoreReviewUser user) {
        this.user = user;
    }

    public StoreReviewLastComments getLast_comment() {
        return last_comment;
    }

    public void setLast_comment(StoreReviewLastComments last_comment) {
        this.last_comment = last_comment;
    }

}
