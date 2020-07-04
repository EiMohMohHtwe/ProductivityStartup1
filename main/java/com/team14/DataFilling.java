package com.team14;

public class DataFilling {
    private String title, ingredients, method;
    private int video;

    public DataFilling() {
    }

    public DataFilling(String title, String ingredients, String method, int video) {
        this.title = title;
        this.ingredients = ingredients;
        this.method = method;
        this.video = video;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }
}
