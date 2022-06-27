package com.example.tugastraining3.viewrecycler;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tugastraining3.R;

import org.w3c.dom.Text;

public class GitUserHolder extends RecyclerView.ViewHolder {
    TextView repo_title;
    TextView repo_link;
    public GitUserHolder(View view) {
        super(view);

        repo_title = view.findViewById(R.id.github_profile);
        repo_link = view.findViewById(R.id.github_link);
    }

    public void setRepo_title(String title) {
        repo_title.setText(title);
    }

    public void setRepo_link(String link) {
        repo_link.setText(link);
    }
}
