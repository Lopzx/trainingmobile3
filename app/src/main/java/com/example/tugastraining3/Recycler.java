package com.example.tugastraining3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tugastraining3.Database.AppDatabase;
import com.example.tugastraining3.GithubServices.DataLayer;
import com.example.tugastraining3.viewrecycler.GitRecyclerView;

public class Recycler extends Fragment {
    RecyclerView rv;
    DataLayer dl;
    AppDatabase db;
    Button offline_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler, container, false);
        db = AppDatabase.getDbinstance(getActivity().getApplicationContext());
        rv = v.findViewById(R.id.recycle_view);
        dl = new ViewModelProvider(getActivity()).get(DataLayer.class);
        dl.call_my_api("Lopzx");
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        dl.get_data().observe(getActivity(), DataLayers -> {
            rv.setAdapter(new GitRecyclerView(DataLayers,db));
        });
        offline_btn = v.findViewById(R.id.offline_btn);
        offline_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent offlineMode = new Intent(getActivity(), OfflineActivity.class);
                startActivity(offlineMode);
            }
        });
        return v;
    }
}