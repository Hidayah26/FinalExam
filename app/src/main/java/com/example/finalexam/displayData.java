package com.example.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class displayData extends AppCompatActivity {

    TextView tvUsername;

    public final static String USERNAME="com.example.finalexam.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        //untuk panggil data daripada login
        Intent intent=getIntent();
        String strUsername=intent.getStringExtra("USERNAME");
        tvUsername=(TextView)findViewById(R.id.tvUsername);
        tvUsername.setText(strUsername);


    }
}