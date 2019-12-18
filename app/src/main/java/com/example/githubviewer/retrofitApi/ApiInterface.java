package com.example.githubviewer.retrofitApi;

import com.example.githubviewer.bean.GithubResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("search/repositories?q=created:>{date}&sort=stars&order=desc")
    Call<GithubResponse> getResponse(@Query("date") String date);
//    @GET("search/repositories?q=created:>2019-12-10&sort=stars&order=desc")
//    Call<GithubResponse> getResponse();
}
