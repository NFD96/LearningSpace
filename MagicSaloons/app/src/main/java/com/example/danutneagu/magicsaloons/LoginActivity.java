package com.example.danutneagu.magicsaloons;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Bind;

/*
First Attempt
Neagu Danut
 */

public class LoginActivity extends AppCompatActivity {
    // Declararea variabilelor
    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;

    @Bind(R.id._emailText) EditText _emailText;
    @Bind(R.id._passwordText) EditText _passwordText;
    @Bind(R.id._loginButton) Button _loginButton;
    @Bind(R.id._signupLink) TextView _signupLink;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        // Capturarea activitatii la (button) click
        _loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                login();

            }
        });

        _signupLink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Porneste activitatea de SignUp
                Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
    }

    // Metode
    public void login() {
        Log.d(TAG, "Login");


        if (!validate()) {
            onLoginFailed();
            return;
        }

        _loginButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.Theme_AppCompat_DialogWhenLarge);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Se autentifica...");
        progressDialog.show();
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);

        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        // TODO: Logica de implementare a autentificarii

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // Pentru un call realizat fie onLoginSuccess sau onLoginFailed
                        onLoginSuccess();
                        // onLoginFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_SIGNUP) {
            if (resultCode == RESULT_OK) {

                // TODO: Logica de implementare a autentificarii
                // Activitatea este finalizata standard si te autentifica automat
                this.finish();
            }
        }
    }

    @Override
    public void onBackPressed() {
        // Dezactivarea butonului de back in LoginActivity
        moveTaskToBack(true);
//        super.onBackPressed();



    }

    public void onLoginSuccess() {
        _loginButton.setEnabled(true);
        Intent intent = new Intent(this, MainActivity.class);
        setResult(RESULT_OK, intent);
        startActivityForResult(intent, RESULT_OK);
        finish();


    }

    public void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Procesul a esuat", Toast.LENGTH_LONG).show();

        _loginButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;
//        java.sql.Connection conn = null;

        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _emailText.setError("Introdu o adresa de e-mail valida");
            valid = false;
        } else {
            _emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 16) {
            _passwordText.setError("Intre 4 - 16 caractere alfanumerice");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

// Tentativa Sqlite
//        if (conn != null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }

        return valid;
    }
}

