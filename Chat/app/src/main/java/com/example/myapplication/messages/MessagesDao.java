package com.example.myapplication.messages;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myapplication.entities.Message;
import com.example.myapplication.entities.MessagesByID;

import java.util.List;

@Dao
public interface MessagesDao {


    @Query("SELECT * FROM messagesByID")
    List<MessagesByID> index();

    @Query("SELECT * FROM messagesByID WHERE id = :id")
    MessagesByID get(int id);

    @Insert
    void insert(MessagesByID... message);

    @Update
    void update(MessagesByID... message);

    @Delete
    void delete(MessagesByID... message);

}
