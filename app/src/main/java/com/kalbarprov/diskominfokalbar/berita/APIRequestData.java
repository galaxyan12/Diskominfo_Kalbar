package com.kalbarprov.diskominfokalbar.berita;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface APIRequestData {

    @GET("json/2020")
    Call<ResponseModel> ardRetrieveData();

    @GET
    Call<ResponseDetilModel> ardRetrieveDetil(@Url String slugbaru);
}
