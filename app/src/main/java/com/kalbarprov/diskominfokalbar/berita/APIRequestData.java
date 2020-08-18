package com.kalbarprov.diskominfokalbar.berita;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {

    @GET("json/2020/")
    Call<ResponseModel> ardRetrieveData();
}
