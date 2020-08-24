package com.kalbarprov.diskominfokalbar.berita;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseDetilModel {

    @SerializedName("status")
    private Integer statusdetil;
    @SerializedName("code")
    private Integer codedetil;
    @SerializedName("message")
    private String messagedetil;
    @SerializedName("content")
    private List<DetilModel> detilModel = null;

    public Integer getStatusdetil() {
        return statusdetil;
    }

    public void setStatusdetil(Integer statusdetil) {
        this.statusdetil = statusdetil;
    }

    public Integer getCodedetil() {
        return codedetil;
    }

    public void setCodedetil(Integer codedetil) {
        this.codedetil = codedetil;
    }

    public String getMessagedetil() {
        return messagedetil;
    }

    public void setMessagedetil(String messagedetil) {
        this.messagedetil = messagedetil;
    }

    public List<DetilModel> getContent() {
        return detilModel;
    }

    public void setContent(List<DetilModel> detilModel) {
        this.detilModel = detilModel;
    }
}
