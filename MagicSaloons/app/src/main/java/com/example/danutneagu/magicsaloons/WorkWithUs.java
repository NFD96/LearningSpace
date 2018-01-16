package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WorkWithUs extends AppCompatActivity {
    //Declararea variabilelor
    private static final String TAG = "WorkWithUs";

    @Bind(R.id.imageViewLogo) ImageView _imageViewAngj;
    @Bind(R.id.editTextN) EditText _editTextNumeAngj;
    @Bind(R.id.editTextPn) EditText _editTextPrenumeAngj;
    @Bind(R.id.editTextMail) EditText _editTextMailAngj;
    @Bind(R.id.editTextExp) EditText _editTextExpAngj;
    @Bind(R.id.editTextNum) EditText _editTextNrAngj;
    @Bind(R.id.editTextBirth) EditText _editTextNastereAngj;
    @Bind(R.id.textViewAngj) TextView _textViewPopUp;
    @Bind(R.id.buttonAngj) Button _buttonAngj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_with_us);
        ButterKnife.bind(this);

//        _textViewPopUp.setText(Html.fromHtml(_textViewPopUp + "<font color=white" + " " + "</font><br><br>" + " "));



        // Capturarea activitatii la (button) click
        _buttonAngj.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                boolean valid = true;
                String name = _editTextNumeAngj.getText().toString();
                String pName = _editTextPrenumeAngj.getText().toString();
                String email = _editTextMailAngj.getText().toString();
                String phone = _editTextNrAngj.getText().toString();
                String birth = _editTextNastereAngj.getText().toString();
                String exp = _editTextExpAngj.getText().toString();

                if (name.isEmpty() || name.length() < 3) {
                    _editTextNumeAngj.setError("Cel putin 3 caractere");
                    valid = false;
                } else {
                    _editTextNumeAngj.setError(null);
                }
                if (pName.isEmpty() || pName.length() < 3) {
                    _editTextPrenumeAngj.setError("Cel putin 3 caractere");
                    valid = false;
                } else {
                    _editTextPrenumeAngj.setError(null);
                }
                if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    _editTextMailAngj.setError("Introdu o adresa de e-mail valida");
                    valid = false;
                } else {
                    _editTextMailAngj.setError(null);
                }
                if (phone.isEmpty() || phone.length() != 10) {
                    _editTextNrAngj.setError("Introdu un numar de mobil valid");
                    valid = false;
                } else {
                    _editTextNrAngj.setError(null);
                }
                if (birth.isEmpty() || birth.length() != 10) {
                    _editTextNastereAngj.setError("Introdu o data de nastere valida");
                    valid = false;
                } else {
                    _editTextNastereAngj.setError(null);
                }
                if (exp.isEmpty() || exp.length() < 50) {
                    _editTextExpAngj.setError("Completeaza spatiul gol.Minim 50 de caractere");
                    valid = false;
                } else {
                    _editTextExpAngj.setError(null);
                }
                Toast.makeText(WorkWithUs.this, "Test trimitere" + name + " " + pName + " " + phone + " " + email + " " + birth + " " + exp + " " + valid + ".", Toast.LENGTH_LONG).show();
            }
        });
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
