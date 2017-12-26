package com.example.myrog.cabtaxirider.Remote;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by My Rog on 12/2/2017.
 */

public class FCMClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String BaseURL){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BaseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
