package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WorkWithUs extends AppCompatActivity {
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
                    _editTextNumeAngj.setError("at least 3 characters");
                    valid = false;
                } else {
                    _editTextNumeAngj.setError(null);
                }
                if (pName.isEmpty() || pName.length() < 3) {
                    _editTextPrenumeAngj.setError("at least 3 characters");
                    valid = false;
                } else {
                    _editTextPrenumeAngj.setError(null);
                }
                if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    _editTextMailAngj.setError("enter a valid email address");
                    valid = false;
                } else {
                    _editTextMailAngj.setError(null);
                }
                if (phone.isEmpty() || phone.length() != 10) {
                    _editTextNrAngj.setError("enter a valid mobile number");
                    valid = false;
                } else {
                    _editTextNrAngj.setError(null);
                }
                if (birth.isEmpty() || birth.length() < 8) {
                    _editTextNastereAngj.setError("enter a valid birth date");
                    valid = false;
                } else {
                    _editTextNastereAngj.setError(null);
                }
                if (exp.isEmpty()) {
                    _editTextExpAngj.setError("fill empty space");
                    valid = false;
                } else {
                    _editTextExpAngj.setError(null);
                }
                Toast.makeText(WorkWithUs.this, "Sending Test" + name + " " + pName + " " + phone + " " + email + " " + birth + " " + exp + " " + valid + ".", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }
}
