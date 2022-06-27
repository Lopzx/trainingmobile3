package com.example.tugastraining3.viewrecycler;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugastraining3.GithubServices.ApiServiceImplementation;
import com.example.tugastraining3.GithubServices.DataLayer;
import com.example.tugastraining3.GithubServices.GitUser;
import com.example.tugastraining3.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GitRecyclerView extends RecyclerView.Adapter<GitUserHolder> {
    private final List<GitUser> listrepo;

    public GitRecyclerView (List<GitUser> list){
        this.listrepo = list;
    }


    public GitUserHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.fragment_for_recycler, viewGroup, false);
        return new GitUserHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(GitUserHolder gitUserHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        gitUserHolder.setRepo_title(listrepo.get(position).getName());
        gitUserHolder.setRepo_link(listrepo.get(position).getFullName());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        Log.e("Jumlah", String.valueOf(listrepo.size()) );
        return listrepo.size();
    }
}
