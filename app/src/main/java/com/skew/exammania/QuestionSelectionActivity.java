package com.skew.exammania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionSelectionActivity extends AppCompatActivity {

    Button randomQuestionBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_selection);

        randomQuestionBtn = (Button)findViewById(R.id.randomQid);
        randomQuestionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RandomQuestionActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
