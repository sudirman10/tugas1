package com.example.dirman_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    public static final int RESULT_CODE = 110;
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final EditText edtEdit = findViewById(R.id.editText);
        Button btnoke = findViewById(R.id.button1);
        btnoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oke = edtEdit.getText().toString();
                Intent Back = new Intent();
                Back.putExtra(EXTRA_NAME,oke);
                setResult(RESULT_CODE,Back);
                finish();
            }
        });
    }
}
