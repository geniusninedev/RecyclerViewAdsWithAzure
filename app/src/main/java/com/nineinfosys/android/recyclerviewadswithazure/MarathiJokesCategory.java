package com.nineinfosys.android.recyclerviewadswithazure;

/**
 * Created by Dev on 02-03-2017.
 */

public class MarathiJokesCategory {
    @com.google.gson.annotations.SerializedName("category")
    private String category;
    @com.google.gson.annotations.SerializedName("id")
    private  String id;
    @com.google.gson.annotations.SerializedName("image")
    private String image;
    public  MarathiJokesCategory(){

    }

    public String getCategory() {
        return category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
