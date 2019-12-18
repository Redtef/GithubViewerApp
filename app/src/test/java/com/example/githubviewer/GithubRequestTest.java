package com.example.githubviewer;

import com.example.githubviewer.bean.GithubResponse;
import com.example.githubviewer.service.RequestService;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GithubRequestTest {


    @Test
    public void makeRequest(){
        String date = "2019-12-12";
        RequestService requestService = new RequestService();
        GithubResponse  githubResponse =requestService.getResponse(date);
        assertEquals(59410, githubResponse.getCount());
    }
}
