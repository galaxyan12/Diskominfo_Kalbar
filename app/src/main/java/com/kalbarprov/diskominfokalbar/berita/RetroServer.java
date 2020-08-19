package com.kalbarprov.diskominfokalbar.berita;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {
    private static final String baseURL = "https://kalbarprov.go.id/APIs/kalbarberita-API/json/";
    private static Retrofit retrofit = null;

    public static Retrofit connectRetrofit(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client((new OkHttpClient.Builder()).build())
                    .build();
        }

        return retrofit;
    }
}
