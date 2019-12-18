package com.example.githubviewer.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

public class RepositoryOwner implements Serializable {
    @SerializedName("login")
    private String login;
    @SerializedName("avatar_url")
    private String avatar;

    public String getLogin() {
        return login;
    }

    public String getAvatar() {
        return avatar;
    }
    public URI getAvatarUri() throws URISyntaxException {
        URI myURI = new URI(getAvatar());
        return myURI;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public RepositoryOwner() {
    }

    public RepositoryOwner(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepositoryOwner that = (RepositoryOwner) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(avatar, that.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, avatar);
    }
}
