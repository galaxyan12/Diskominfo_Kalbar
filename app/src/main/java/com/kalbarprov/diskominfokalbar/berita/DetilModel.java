package com.kalbarprov.diskominfokalbar.berita;

import com.google.gson.annotations.SerializedName;

public class DetilModel {

    @SerializedName("news_title")
    private String detilTitle;
    @SerializedName("news_slug")
    private String detilSlug;
    @SerializedName("news_url")
    private String detilUrl;
    @SerializedName("news_image")
    private String detilImage;
    @SerializedName("news_view")
    private Integer detilView;
    @SerializedName("news_datecreate")
    private String detilDatecreate;
    @SerializedName("news_user")
    private String detilUser;
    @SerializedName("news_content")
    private String detilContent;

    public String getDetilTitle() {
        return detilTitle;
    }

    public void setDetilTitle(String detilTitle) {
        this.detilTitle = detilTitle;
    }

    public String getDetilSlug() {
        return detilSlug;
    }

    public void setDetilSlug(String detilSlug) {
        this.detilSlug = detilSlug;
    }

    public String getDetilUrl() {
        return detilUrl;
    }

    public void setDetilUrl(String detilUrl) {
        this.detilUrl = detilUrl;
    }

    public String getDetilImage() {
        return detilImage;
    }

    public void setDetilImage(String detilImage) {
        this.detilImage = detilImage;
    }

    public Integer getDetilView() {
        return detilView;
    }

    public void setDetilView(Integer detilView) {
        this.detilView = detilView;
    }

    public String getDetilDatecreate() {
        return detilDatecreate;
    }

    public void setDetilDatecreate(String detilDatecreate) {
        this.detilDatecreate = detilDatecreate;
    }

    public String getDetilUser() {
        return detilUser;
    }

    public void setDetilUser(String detilUser) {
        this.detilUser = detilUser;
    }

    public String getDetilContent() {
        return detilContent;
    }

    public void setDetilContent(String detilContent) {
        this.detilContent = detilContent;
    }
}
