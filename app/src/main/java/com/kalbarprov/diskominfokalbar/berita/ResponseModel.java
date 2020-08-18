package com.kalbarprov.diskominfokalbar.berita;

import java.util.List;

public class ResponseModel {

    private int status, code;
    private String message;
    private List<BeritaModel> content;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<BeritaModel> getContent() {
        return content;
    }

    public void setContent(List<BeritaModel> content) {
        this.content = content;
    }
}
