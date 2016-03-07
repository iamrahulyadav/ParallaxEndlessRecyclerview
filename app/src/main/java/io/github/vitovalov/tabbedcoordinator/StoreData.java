package io.github.vitovalov.tabbedcoordinator;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dharam on 3/3/2016.
 */
public class StoreData {

    @SerializedName("id")
    String id;
    @SerializedName("score")
    String score;
    @SerializedName("store_name")
    String store_name;
    @SerializedName("overall_ratings")
    String overall_ratings;
    @SerializedName("sub_area_id")
    String sub_area_id;
    @SerializedName("likes_count")
    String likes_count;
    @SerializedName("is_liked")
    String is_liked;
    @SerializedName("cards_count")
    String cards_count;
    @SerializedName("store_images_count")
    String store_images_count;
    @SerializedName("is_followed")
    String is_followed;
    @SerializedName("rated_color")
    String rated_color;


    public String getStore_images_count() {
        return store_images_count;
    }

    public void setStore_images_count(String store_images_count) {
        this.store_images_count = store_images_count;
    }

    public String getRated_color() {
        return rated_color;
    }

    public void setRated_color(String rated_color) {
        this.rated_color = rated_color;
    }

    public String getIs_followed() {
        return is_followed;
    }

    public void setIs_followed(String is_followed) {
        this.is_followed = is_followed;
    }

    public String getCards_count() {
        return cards_count;
    }

    public void setCards_count(String cards_count) {
        this.cards_count = cards_count;
    }

    public String getIs_liked() {
        return is_liked;
    }

    public void setIs_liked(String is_liked) {
        this.is_liked = is_liked;
    }

    public String getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(String likes_count) {
        this.likes_count = likes_count;
    }

    public String getSub_area_id() {
        return sub_area_id;
    }

    public void setSub_area_id(String sub_area_id) {
        this.sub_area_id = sub_area_id;
    }

    public String getOverall_ratings() {
        return overall_ratings;
    }

    public void setOverall_ratings(String overall_ratings) {
        this.overall_ratings = overall_ratings;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
