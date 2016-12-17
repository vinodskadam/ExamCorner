package com.skew.exammania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Banking_Segments extends AppCompatActivity {
    Button englishBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banking__segments);

        englishBtn = (Button) findViewById(R.id.englishBtnid);
        englishBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(),QuestionSelectionActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
