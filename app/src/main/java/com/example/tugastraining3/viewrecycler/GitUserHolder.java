package com.example.tugastraining3.viewrecycler;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tugastraining3.Database.AppDatabase;
import com.example.tugastraining3.GithubServices.GitUser;
import com.example.tugastraining3.R;

import org.w3c.dom.Text;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GitUserHolder extends RecyclerView.ViewHolder {
    TextView repo_title;
    TextView repo_link;
    private final ExecutorService exe;

    public GitUserHolder(View view) {
        super(view);
        exe = Executors.newSingleThreadExecutor();
        repo_title = view.findViewById(R.id.github_profile);
        repo_link = view.findViewById(R.id.github_link);
    }

    public void setRepo_title(String title) {
        repo_title.setText(title);
    }

    public void setRepo_click(GitUser repo, AppDatabase _Instance) {
        repo_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exe.execute(() -> {
                    try {
                        _Instance.repoDao().insertRepo(repo);
                    } catch (Exception e) {
                        Log.e("EXIST" , e.getMessage().toString());
                    }
                });
            }
        });
    }

    public void setRepo_link(String link) {
        repo_link.setText(link);
    }
}
