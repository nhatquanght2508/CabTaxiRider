package com.example.myrog.cabtaxirider.Remote;

import com.example.myrog.cabtaxirider.Model.FCMResponse;
import com.example.myrog.cabtaxirider.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by My Rog on 12/2/2017.
 */

public interface IFCMService {
    @Headers({

            "Content-Type:application/json",
            "Authorization:key=AAAAgO_gjLY:APA91bEnxMRO9nvVdJKDtb52rIpdSr8qSLC4Kjbj5qXImGmkRrwDSEgJtIPEHa0BBn53vnUgoDo-1iSn4c5gw3ruSLjkQYkVUskIf6fAI9uQIRLP0yTtSgXTj12JSeVgBB-ZcUkbe6sL"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
