package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


import static com.example.danutneagu.magicsaloons.R.id.imageViewLogo;

/**
 * Created by Danut Neagu on 9/18/2017.
 */

public class Blog extends AppCompatActivity {
    //Declararea variabilelor
    private static final String TAG = "Blog";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        ImageView imageView = (ImageView)findViewById(imageViewLogo);
    }

    // Butonul de back default devine functie activa de back in app cu animatie (rasfoire pagini)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }
}

