package com.example.somaiya.somaiyaclassroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button tch_button;
    private Button std_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tch_button = (Button) findViewById(R.id.tch_btn);
        std_button= (Button) findViewById(R.id.stu_btn);
        std_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMainSignIn1();
            }
        });
        tch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMainSignIn2();
            }
        });
    }


    public void openActivityMainSignIn2() {
        Intent main_intent = new Intent(HomeActivity.this,Main_Sign_In.class);
        startActivity(main_intent);
    }
    public void openActivityMainSignIn1() {
        Intent main_intent = new Intent(HomeActivity.this,Main_Sign_In_Student.class);
        startActivity(main_intent);
    }
}