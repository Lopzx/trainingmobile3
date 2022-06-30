package com.example.tugastraining3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugastraining3.Database.AppDatabase;
import com.example.tugastraining3.GithubServices.DataLayer;
import com.example.tugastraining3.GithubServices.GitUser;
import com.example.tugastraining3.viewrecycler.GitRecyclerView;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OfflineActivity extends AppCompatActivity {
    RecyclerView rv;
    DataLayer myData;
    AppDatabase db;
    ExecutorService exe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline);
        exe = Executors.newSingleThreadExecutor();
        rv = findViewById(R.id.OfflineRecycler);
        rv.setLayoutManager(new LinearLayoutManager(this));
        db = AppDatabase.getDbinstance(getApplicationContext());
        myData = new DataLayer(db.repoDao());
        myData.get_data().observe(this, data -> {
            rv.setAdapter(new GitRecyclerView(data, db));
        });
    }
}