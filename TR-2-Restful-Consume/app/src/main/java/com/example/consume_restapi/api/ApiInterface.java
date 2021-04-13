package com.example.consume_restapi.api;

import com.example.consume_restapi.entities.Kamus;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/")
    Call<List<Kamus>> getAll();

    @GET("/kata/{id}")
    Call<Kamus>getKata(@Path("id")String id);

    @GET("/{kata}")
    Call<Kamus>getKatabyKata(@Path("kata")String kata);

//    @POST("/save")
//    Call<Kamus> addKamus(@Body Kamus kamus);

}
