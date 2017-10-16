package com.example.pc.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private RetrofitApi retrofitApi;
    private Retrofit retrofit;

    public ApiClient() {

        retrofit = new Retrofit
                .Builder()
                .baseUrl("http://samples.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitApi = retrofit.create(RetrofitApi.class);
    }

    public static ApiClient getInstance(){ return new ApiClient(); }

    public RetrofitApi getRetrofitApi(){
        return this.retrofitApi;
    }
}
