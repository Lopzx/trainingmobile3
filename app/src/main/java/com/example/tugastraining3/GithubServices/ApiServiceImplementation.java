package com.example.tugastraining3.GithubServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiServiceImplementation{
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


   ApiInterface githubAPIFunctionList = retrofit.create(ApiInterface.class);

    public ApiInterface getGithubAPIFunctionList() {
        return githubAPIFunctionList;
    }
}
