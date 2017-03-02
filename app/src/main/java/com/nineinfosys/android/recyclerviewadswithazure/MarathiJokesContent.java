package com.nineinfosys.android.recyclerviewadswithazure;

/**
 * Created by Dev on 02-03-2017.
 */

public class MarathiJokesContent {
    @com.google.gson.annotations.SerializedName("id")
    private String id ;
    @com.google.gson.annotations.SerializedName("category")
    private String category;
    @com.google.gson.annotations.SerializedName("content")
    private String content;

    public MarathiJokesContent() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
