package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

/*
First Attempt
Neagu Danut
 */

public class Contact extends AppCompatActivity {

    @Bind(R.id.editText)EditText _editText;
    @Bind(R.id.editText2)EditText _editText2;
    @Bind(R.id.editText3)EditText _editText3;
    @Bind(R.id.editText4)EditText _editText4;
    @Bind(R.id.button) Button _button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        ButterKnife.bind(this);



        _button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                 String name = _editText.getText().toString();
                 String phone = _editText2.getText().toString();
                 String email = _editText3.getText().toString();
                 String mess = _editText4.getText().toString();
                Toast.makeText(Contact.this, "Test: " + name + " " + phone + " " + email + " " + mess + "." , Toast.LENGTH_LONG).show();
            }
        });



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        // Disable going back to the LoginActivity
//        moveTaskToBack(true);
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
    }
}
