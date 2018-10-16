package com.example.karimm7mad.lab3_karimm7mad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public Button submitBtn;
    public EditText weight,height;
    public MainActivity ref;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ref = this;
        i = new Intent(ref,resultActivity.class);
        submitBtn = findViewById(R.id.submitBtn);
        weight = findViewById(R.id.weightTxtEnty);
        height = findViewById(R.id.heightTxtEntry);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("weight",ref.weight.getText().toString());
                i.putExtra("height",ref.height.getText().toString());
                startActivity(i);
            }
        });

    }
}
