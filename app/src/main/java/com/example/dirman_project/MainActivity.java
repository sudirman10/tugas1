package com.example.dirman_project;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 100;
    TextView tvname ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvname = findViewById(R.id.project1);
        Button btnNext = findViewById(R.id.button);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Activity2.class);
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && requestCode == REQUEST_CODE) {
            String HASIL=data.getStringExtra(Activity2.EXTRA_NAME);
            tvname.setText(String.format("%s %s", getResources().getString(R.string.HASIL),HASIL));
        }
    }
}
