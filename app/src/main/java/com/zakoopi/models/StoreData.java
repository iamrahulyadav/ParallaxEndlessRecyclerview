package com.zakoopi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dharam on 3/7/2016.
 */
public class StoreData {

    @SerializedName("id")
    String id;
    @SerializedName("model")
    String model;
    StoreReviewData storeReviewData;

    public StoreReviewData getStoreReviewData() {
        return storeReviewData;
    }

    public void setStoreReviewData(StoreReviewData storeReviewData) {
        this.storeReviewData = storeReviewData;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
