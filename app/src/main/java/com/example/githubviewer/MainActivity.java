package com.example.githubviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.example.githubviewer.adapters.RepositoryRecyclerAdapter;
import com.example.githubviewer.bean.GithubResponse;
import com.example.githubviewer.bean.Repository;
import com.example.githubviewer.retrofitApi.ApiClient;
import com.example.githubviewer.retrofitApi.ApiInterface;
import com.example.githubviewer.service.DateService;
import com.example.githubviewer.service.RequestService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RepositoryRecyclerAdapter repositoryRecyclerAdapter;
    private Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRepositories(mContext);

    }


    public void getRepositories(final Context context) {
        DateService dateService = new DateService();
        final RecyclerView recyclerRepositories = findViewById(R.id.item_list);
        final LinearLayoutManager notesLayoutManager = new LinearLayoutManager(this);
        recyclerRepositories.setLayoutManager(notesLayoutManager);

        ApiInterface apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        String date = dateService.getCurrentDateString();
        Call<GithubResponse> call = apiInterface.getResponse(date);
        call.enqueue(new Callback<GithubResponse>() {
            @Override
            public void onResponse(Call<GithubResponse> call, Response<GithubResponse> response) {
                GithubResponse githubResponse = response.body();
                if (githubResponse != null) {
                    repositoryRecyclerAdapter = new RepositoryRecyclerAdapter(mContext, githubResponse.getRepositories());
                    recyclerRepositories.setAdapter(repositoryRecyclerAdapter);
                }
            }
            @Override
            public void onFailure(Call<GithubResponse> call, Throwable t) {
                t.printStackTrace();

            }
        });
    }
}
