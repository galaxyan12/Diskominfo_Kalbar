package com.kalbarprov.diskominfokalbar.berita;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {
    private static final String baseURL = "http://kalbarprov.go.id/APIs/kalbarberita-API/json/";
    private static Retrofit retrofit;

    public static Retrofit connectRetrofit(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
