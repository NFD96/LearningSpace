package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Danut Neagu on 10/3/2017.
 */

public class Contact extends AppCompatActivity {
    //Declararea variabilelor
    private static final String TAG = "Contact";

    @Bind(R.id.editText)EditText _editText;
    @Bind(R.id.editText2)EditText _editText2;
    @Bind(R.id.editText3)EditText _editText3;
    @Bind(R.id.editText4)EditText _editText4;
    @Bind(R.id.button) Button _button;
    @Bind(R.id.imageView2) ImageView _imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        ButterKnife.bind(this);

//        String name = _editText.getText().toString();
//        String phone = _editText2.getText().toString();
//        String email = _editText3.getText().toString();
//        String mess = _editText4.getText().toString();

        // Capturarea activitatii la (button) click
        _button.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View v) {
                                           boolean valid = true;
                                           String name = _editText.getText().toString();
                                           String phone = _editText2.getText().toString();
                                           String email = _editText3.getText().toString();
                                           String mess = _editText4.getText().toString();

                                           if (name.isEmpty() || name.length() < 10) {
                                               _editText.setError("Nume / Prenume");
                                               valid = false;
                                           } else {
                                               _editText.setError(null);
                                           }
                                           if (phone.isEmpty() || phone.length() != 10) {
                                               _editText2.setError("Introdu un numar de mobil valid");
                                               valid = false;
                                           } else {
                                               _editText2.setError(null);
                                           }
                                           if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                                               _editText3.setError("Introdu o adresa de e-mail valida");
                                               valid = false;
                                           } else {
                                               _editText3.setError(null);
                                           }
                                           if (mess.isEmpty() || mess.length() != 50) {
                                               _editText4.setError("Completeaza spatiul gol.Minim 50 de caractere");
                                               valid = false;
                                           } else {
                                               _editText4.setError(null);
                                           }
                                           Toast.makeText(Contact.this, "Test trimitere: " + name + " " + phone + " " + email + " " + mess + " " + valid + ".", Toast.LENGTH_LONG).show();

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

    // Butonul de back default devine functie activa de back in app cu animatie (rasfoire pagini)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }
}

