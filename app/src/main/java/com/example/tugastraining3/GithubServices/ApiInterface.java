package com.example.tugastraining3.GithubServices;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("users/{user}/repos")
    Call<List<GitUser>> listRepos(@Path("user") String user);
}
