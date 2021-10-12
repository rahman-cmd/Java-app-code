package com.aisoftware.allbanglanewspaper.Newspaper;

public class News_model {

    String newsUrl;
    int newsImage;

    public News_model(String newsUrl, int newsImage) {
        this.newsUrl = newsUrl;
        this.newsImage = newsImage;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }

    public int getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(int newsImage) {
        this.newsImage = newsImage;
    }
}


