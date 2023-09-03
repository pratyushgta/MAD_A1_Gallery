package com.example.mad_a1_gallery;

public class ImageModel {
    private String imagePath;
    private String date;

    public ImageModel(String imagePath, String date) {
        this.imagePath = imagePath;
        this.date = date;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getDate() {
        return date;
    }
}

