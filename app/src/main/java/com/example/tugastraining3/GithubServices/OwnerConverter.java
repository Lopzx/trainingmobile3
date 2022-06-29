package com.example.tugastraining3.GithubServices;

import androidx.room.TypeConverter;

public class OwnerConverter {
    @TypeConverter
    public static Owner fromOwner(Owner e){
        return new Owner(e);
    }
}
