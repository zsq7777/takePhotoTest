package com.able;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(v -> {
            startActivity(new Intent(this,TakePhoto1Activity.class));
        });
        findViewById(R.id.btn2).setOnClickListener(v -> {
            startActivity(new Intent(this,TakePhoto2Activity.class));
        });
    }
}
