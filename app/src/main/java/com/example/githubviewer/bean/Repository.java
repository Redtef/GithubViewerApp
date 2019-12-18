package com.example.githubviewer.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Repository implements Serializable {

    @SerializedName("name")
    private String Name;
    @SerializedName("description")
    private String Description;
    @SerializedName("stargazers_count")
    private int Stargazers_count;
    @SerializedName("owner")
    private RepositoryOwner repositoryOwner;

    public Repository() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getStargazers_count() {
        return Stargazers_count;
    }

    public void setStargazers_count(int stargazers_count) {
        Stargazers_count = stargazers_count;
    }

    public RepositoryOwner getRepositoryOwner() {
        return repositoryOwner;
    }

    public void setRepositoryOwner(RepositoryOwner repositoryOwner) {
        this.repositoryOwner = repositoryOwner;
    }
}
