package com.example.ryeblog.DB;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDAO {
    @Query("SELECT * FROM users WHERE username = :username")
    LiveData<List<User>> getUser(String username);

    @Query("SELECT * FROM users")
    LiveData<List<User>> getAll();

    @Insert
    void insert(User... users);

    @Update
    void update(User... users);

    @Delete
    void delete(User... users);


    @Query("DELETE FROM users WHERE username = :username")
    void delete(String username);
}
