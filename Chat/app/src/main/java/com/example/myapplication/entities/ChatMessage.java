package com.example.myapplication.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

public class ChatMessage {

    private  String id;
    private  String created;

    public String getId() {
        return id;
    }

    public String getCreated() {
        return created;
    }

    public String getContent() {
        return content;
    }

    private String content;


    public ChatMessage(String id, String created, String content) {
        this.id = id;
        this.created = created;
        this.content = content;
    }
}
