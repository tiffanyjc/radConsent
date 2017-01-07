package com.example.quizattempt;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
    }

    public void onClickWrong (View view)
    {
        Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
    }

    public void onClickRight (View view)
    {
        Toast.makeText(this, "That's right! Good job", Toast.LENGTH_SHORT).show();

    }
}
