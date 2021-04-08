package com.example.consume_restapi.api;

import com.example.consume_restapi.entities.Kamus;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/")
    Call<List<Kamus>> getAll();

}
