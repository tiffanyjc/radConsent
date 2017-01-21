package com.example.quizattempt;

import android.app.Activity;
import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Question1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
    }

    public void onClickWrong (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("story");
        myRef.setValue("Hello, World!");
    }

    public void onClickRight (View view)
    {
        Toast.makeText(this, "That's right! Good job", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }


}


