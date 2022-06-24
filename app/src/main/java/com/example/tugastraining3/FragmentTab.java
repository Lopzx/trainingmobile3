package com.example.tugastraining3;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentTab extends Fragment {
    TextView txt1;
    TextView txt2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_tab, container, false);
        txt1 = v.findViewById(R.id.usernamevalo);
        txt2 = v.findViewById(R.id.passwordvalo);

        SharedPreferences sp = this.getActivity().getSharedPreferences("user", MODE_PRIVATE);
        txt1.setText(sp.getString("username",""));
        txt2.setText(sp.getString("password",""));


        return v;
    }
}