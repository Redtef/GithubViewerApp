package com.example.githubviewer.retrofitApi;

import com.example.githubviewer.bean.GithubResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

//    @GET("search/repositories?q=created:>{date}&sort=stars&order=desc")
    @GET("search/repositories")
    Call<GithubResponse> getResponse(@Query("q") String date,@Query("sort")String sort,@Query("order")String order);
//    @GET("search/repositories?q=created:>2019-12-10&sort=stars&order=desc")
//    Call<GithubResponse> getResponse();



}
