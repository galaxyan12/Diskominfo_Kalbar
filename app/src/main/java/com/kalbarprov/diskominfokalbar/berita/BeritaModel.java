package com.kalbarprov.diskominfokalbar.berita;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BeritaModel {

    @SerializedName("news_title")
    private String newsTitle;
    @SerializedName("news_slug")
    private String newsSlug;
    @SerializedName("news_url")
    private String newsUrl;
    @SerializedName("news_image")
    private String newsImage;
    @SerializedName("news_view")
    private Integer newsView;
    @SerializedName("news_sinopsis")
    private String newsSinopsis;
    @SerializedName("news_datecreate")
    private String newsDatecreate;
    @SerializedName("news_user")
    private String newsUser;

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsSlug() {
        return newsSlug;
    }

    public void setNewsSlug(String newsSlug) {
        this.newsSlug = newsSlug;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }

    public String getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage;
    }

    public Integer getNewsView() {
        return newsView;
    }

    public void setNewsView(Integer newsView) {
        this.newsView = newsView;
    }

    public String getNewsSinopsis() {
        return newsSinopsis;
    }

    public void setNewsSinopsis(String newsSinopsis) {
        this.newsSinopsis = newsSinopsis;
    }

    public String getNewsDatecreate() {
        return newsDatecreate;
    }

    public void setNewsDatecreate(String newsDatecreate) {
        this.newsDatecreate = newsDatecreate;
    }

    public String getNewsUser() {
        return newsUser;
    }

    public void setNewsUser(String newsUser) {
        this.newsUser = newsUser;
    }

}
