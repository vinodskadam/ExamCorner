package com.skew.exammania;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RandomQuestionActivity extends AppCompatActivity {

    TextView topicText;
    TextView questionByClassText;
    TextView questionText;
    Button optionABtn;
    Button optionBBtn;
    Button optionCBtn;
    Button optionDBtn;
    Button challengeBtn;
    TextView correctAnsTxt;
    String correctOption;
    TextView questionInfoText;
    GetQuestionDetails getQuestObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_question);

        topicText = (TextView)findViewById(R.id.topicid);
        questionByClassText = (TextView)findViewById(R.id.questByClassid);
        questionInfoText = (TextView)findViewById(R.id.qinfoid);
        questionText = (TextView)findViewById(R.id.qtextid);
        optionABtn = (Button)findViewById(R.id.optionAid);
        optionBBtn = (Button)findViewById(R.id.optionBid);
        optionCBtn = (Button)findViewById(R.id.optionCid);
        optionDBtn = (Button)findViewById(R.id.optionDid);
        challengeBtn = (Button)findViewById(R.id.challengethisid);
        correctAnsTxt = (TextView)findViewById(R.id.correctAnsid);

        String qID = "q1";
        getQuestObject = new GetQuestionDetails();
        questionInfoText.setText(getQuestObject.getQuestionInfo(qID));
        questionText.setText(getQuestObject.getQuestionText(qID));
        optionABtn.setText(getQuestObject.getOptionA(qID));
        optionBBtn.setText(getQuestObject.getOptionB(qID));
        optionCBtn.setText(getQuestObject.getOptionC(qID));
        optionDBtn.setText(getQuestObject.getOptionD(qID));
        correctOption = getQuestObject.getCorrectAns(qID);

        optionABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correctOption.equalsIgnoreCase("optionA")) {
                    correctAnsTxt.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.lightgreen));
                    correctAnsTxt.setText("Correct Ans");
                }else{
                    correctAnsTxt.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    correctAnsTxt.setText("Incorrect Ans");
                }
            }
        });

        optionBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correctOption.equalsIgnoreCase("optionB")) {
                    correctAnsTxt.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.lightgreen));
                    correctAnsTxt.setText("Correct Ans");
                } else {
                    correctAnsTxt.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    correctAnsTxt.setText("Incorrect Ans");
                }
            }
        });
        optionCBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correctOption.equalsIgnoreCase("optionC")) {
                    correctAnsTxt.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.lightgreen));
                    correctAnsTxt.setText("Correct Ans");
                } else {
                    correctAnsTxt.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    correctAnsTxt.setText("Incorrect Ans");
                }
            }
        });
        optionDBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correctOption.equalsIgnoreCase("optionD")) {
                    correctAnsTxt.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.lightgreen));
                    correctAnsTxt.setText("Correct Ans");
                } else {
                    correctAnsTxt.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
                    correctAnsTxt.setText("Incorrect Ans");
                }
            }
        });
        challengeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SelectChallengeFriendActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
