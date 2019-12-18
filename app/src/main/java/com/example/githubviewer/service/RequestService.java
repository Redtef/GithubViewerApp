package com.example.githubviewer.service;

import android.content.Context;
import android.util.Log;

import com.example.githubviewer.bean.GithubResponse;
import com.example.githubviewer.bean.Repository;
import com.example.githubviewer.retrofitApi.ApiClient;
import com.example.githubviewer.retrofitApi.ApiInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RequestService {
    public static final String TAG = "RequestService";

//    public void test(String date) {
//        getRepositories(date);
//    }

//    public GithubResponse getResponse(String date) {
//
////        Response<GithubResponse> githubResponse = new Response<GithubResponse>();
//        final GithubResponse[] githubResponse = {new GithubResponse()};
//        ApiInterface apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
////        Call<GithubResponse> call = apiInterface.getResponse(date);
//        Call<GithubResponse> call = apiInterface.getResponse();
////        try {
////            githubResponse = call.execute().body();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        call.enqueue(new Callback<GithubResponse>() {
//            @Override
//            public void onResponse(Call<GithubResponse> call, Response<GithubResponse> response) {
//                Log.d(TAG, "Onresponse");
//                GithubResponse githubResponse = response.body();
//                if (githubResponse != null) {
//                }
//            }
//
//            @Override
//            public void onFailure(Call<GithubResponse> call, Throwable t) {
//                Log.d(TAG, "OnFailure");
//                t.printStackTrace();
//
//            }
//        });
//        return githubResponse[0];
//    }

//    public List<Repository> getRepositories(String date) {
//        List<Repository> repositories = new ArrayList<>();
//        GithubResponse githubResponse = getResponse(date);
//
//        return githubResponse.getRepositories();
//    }


}
