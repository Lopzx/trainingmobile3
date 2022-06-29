package com.example.tugastraining3.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.tugastraining3.GithubServices.GitUser;

import java.util.List;

@Dao
public interface RepoDao {
    @Query("SELECT * FROM repo")
    List<GitUser> getAllRepo();

    @Insert
    void insertRepo(GitUser repo);


}

