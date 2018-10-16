package com.example.karimm7mad.lab3_karimm7mad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    public TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int weight = Integer.parseInt(this.getIntent().getStringExtra("weight"));
        int height = Integer.parseInt(this.getIntent().getStringExtra("height"));
        resultView = findViewById(R.id.resultView);
        resultView.setText(""+(weight/(height*height)));

    }
}
