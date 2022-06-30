package com.example.tugastraining3.GithubServices;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.tugastraining3.Database.RepoDao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DataLayer extends ViewModel {
    ExecutorService exe;

    private MutableLiveData<List<GitUser>> repo_list = new MutableLiveData<>();
    public LiveData<List<GitUser>> get_data() {
        return repo_list;
    }
    AsyncTask asc;

    public DataLayer(){
        repo_list.setValue(new ArrayList<GitUser>());
    }

    public DataLayer(RepoDao dao) {
        asc.execute(() -> {
            repo_list.postValue(dao.getAllRepo());
        });
    }
    public DataLayer(List<GitUser> ArrList){
        repo_list.setValue(ArrList);
    }
    private ApiServiceImplementation imp = new ApiServiceImplementation();

    public int call_my_api(String username){
        Call<List<GitUser>> repos = imp.getGithubAPIFunctionList().listRepos(username);
        repos.enqueue(new Callback<List<GitUser>>() {
            @Override
            public void onResponse(Call<List<GitUser>> call, Response<List<GitUser>> response) {
                int statusCode = response.code();
                Log.e("Code", String.valueOf(statusCode));
                repo_list.setValue(response.body());
                Log.e("Berhasil", repo_list.toString());
            }

            @Override
            public void onFailure(Call<List<GitUser>> call, Throwable t) {
                Log.e("Api Call Fail", "Api Call Github Failed");
            }
        });
        return 1;
    }

}
