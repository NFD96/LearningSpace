package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Blog extends AppCompatActivity {
    private static final String TAG = "Blog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }
}

