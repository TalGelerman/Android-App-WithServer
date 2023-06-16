package com.example.myapplication;

import android.content.Context;

import androidx.room.Room;

import com.example.myapplication.contacts.ContactDB;
import com.example.myapplication.messages.MessageDB;

public class SingletonDatabase {
    private static ContactDB contactInstance;
    private static MessageDB messageInstance;

    private SingletonDatabase() {
        // Private constructor to prevent instantiation
    }

    public static synchronized ContactDB getContactInstance(Context context) {
        if (contactInstance == null) {
            contactInstance = Room.databaseBuilder(context.getApplicationContext(),
                    ContactDB.class, "ContactDB").allowMainThreadQueries().build();
        }
        return contactInstance;
    }

    public static synchronized ContactDB getContactInstance() {
        return contactInstance;
    }


    public static synchronized MessageDB getMessageInstance(Context context) {
        if (messageInstance == null) {
            messageInstance = Room.databaseBuilder(context.getApplicationContext(),
                    MessageDB.class, "MessageDB").allowMainThreadQueries().build();
        }
        return messageInstance;
    }

    public static synchronized MessageDB getMessageInstance() {
        return messageInstance;
    }
}