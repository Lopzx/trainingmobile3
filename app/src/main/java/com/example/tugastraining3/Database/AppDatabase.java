package com.example.tugastraining3.Database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.example.tugastraining3.GithubServices.GitUser;
import com.example.tugastraining3.GithubServices.OwnerConverter;

@androidx.room.Database(entities = {GitUser.class}, version = 1)
@TypeConverters({OwnerConverter.class})
public abstract class AppDatabase extends RoomDatabase {
    public abstract RepoDao repoDao();

    public static AppDatabase _DBINSTANCE ;

    public static AppDatabase getDbinstance(final Context appGlobalContext) {
        if(_DBINSTANCE == null) {
            _DBINSTANCE = Room.databaseBuilder(appGlobalContext, AppDatabase.class,"repo")
                .build();
        }

        return _DBINSTANCE;
    }

}
