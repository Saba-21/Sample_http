package com.example.pc.retrofit;

import com.example.pc.retrofit.models.Models;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApi {

    @GET ("/data/2.5/weather?q=London%2Cuk&appid=b1b15e88fa797225412429c1c50c122a1")
    Call<Models>getData();

}
