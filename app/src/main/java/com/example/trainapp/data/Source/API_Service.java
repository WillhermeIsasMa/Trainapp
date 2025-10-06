package com.example.trainapp.data.Source;

import com.example.trainapp.models.Report;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
// Interface que define os endpoints da API.
public interface API_Service {

    @POST("reports")
    Call<Report> createReport(@Body Report report);

    // Outros endpoints (ex: @GET("trains")) viriam aqui...
}