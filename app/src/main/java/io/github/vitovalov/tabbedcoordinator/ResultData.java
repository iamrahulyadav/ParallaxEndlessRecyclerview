package io.github.vitovalov.tabbedcoordinator;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by dharam on 3/3/2016.
 */
public class ResultData {
    @SerializedName("id")
    String id;
    @SerializedName("city_id")
    String city_id;
    @SerializedName("sub_area_name")
    String sub_area_name;
    @SerializedName("is_popular")
    String is_popular;
    @SerializedName("slug")
    String slug;
    @SerializedName("sub_city_id")
    String sub_city_id;
    @SerializedName("android_api_image")
    String android_api_image;
    @SerializedName("stores_count")
    String stores_count;
    @SerializedName("url_slug")
    String url_slug;
    @SerializedName("market_name")
    String market_name;
    ArrayList<StoreData> stores;
    public ArrayList<StoreData> getStores() {
        return stores;
    }

    public void setStores(ArrayList<StoreData> stores) {
        this.stores = stores;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getSub_area_name() {
        return sub_area_name;
    }

    public void setSub_area_name(String sub_area_name) {
        this.sub_area_name = sub_area_name;
    }

    public String getIs_popular() {
        return is_popular;
    }

    public void setIs_popular(String is_popular) {
        this.is_popular = is_popular;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSub_city_id() {
        return sub_city_id;
    }

    public void setSub_city_id(String sub_city_id) {
        this.sub_city_id = sub_city_id;
    }

    public String getAndroid_api_image() {
        return android_api_image;
    }

    public void setAndroid_api_image(String android_api_image) {
        this.android_api_image = android_api_image;
    }

    public String getStores_count() {
        return stores_count;
    }

    public void setStores_count(String stores_count) {
        this.stores_count = stores_count;
    }

    public String getUrl_slug() {
        return url_slug;
    }

    public void setUrl_slug(String url_slug) {
        this.url_slug = url_slug;
    }

    public String getMarket_name() {
        return market_name;
    }

    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }



}
