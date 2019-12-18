package com.example.githubviewer.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GithubResponse implements Serializable {
    @SerializedName("total_count")
    private int Count;
    @SerializedName("incomplete_results")
    private boolean IncompleteResults;
    @SerializedName("items")
    private List<Repository> repositories;

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public boolean isIncompleteResults() {
        return IncompleteResults;
    }

    public void setIncompleteResults(boolean incompleteResults) {
        IncompleteResults = incompleteResults;
    }

    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    @Override
    public String toString() {
        return "GithubResponse{" +
                "Count=" + Count +
                ", IncompleteResults=" + IncompleteResults +
                ", repositories=" + repositories +
                '}';
    }
}
