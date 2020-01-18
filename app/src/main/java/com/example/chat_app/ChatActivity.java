package com.example.chat_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");

        //1. recyclerView - loop
        //2. DB내용을 넣는다.
        //3. 상대방폰에 채팅 내용이 보임

        //1-1. recyclerview - chat data
        //1. message, nickname, isMine - Data Tranfer Object



    }
}
