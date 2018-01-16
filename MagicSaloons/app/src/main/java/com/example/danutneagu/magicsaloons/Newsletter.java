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

/**
 * Created by Danut Neagu on 10/3/2017.
 */

public class Newsletter extends AppCompatActivity {
    //Declararea variabilelor
    private static final String TAG = "Newsletter";

    @Bind(R.id.textView2) TextView _textView2;
    @Bind(R.id.textView4) TextView _textView4;
    @Bind(R.id.textView5) TextView _textView5;
    @Bind(R.id.editText5) EditText _nameText;
    @Bind(R.id.editText6) EditText _emailText;
    @Bind(R.id.imageView) ImageView _imageView;
    @Bind(R.id.button11) Button _subscribeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsletter);
        ButterKnife.bind(this);

        // Capturarea activitatii la (button) click
        _subscribeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid = true;
                String name = _nameText.getText().toString();
                String email = _emailText.getText().toString();

                if (name.isEmpty() || name.length() < 10) {
                    _nameText.setError("Nume / Prenume");
                    valid = false;
                } else {
                    _nameText.setError(null);
                }
                if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    _emailText.setError("Introdu o adresa de e-mail valida");
                    valid = false;
                } else {
                    _emailText.setError(null);
                }
                Toast.makeText(Newsletter.this, "Test abonare: " + name + " " + email + " " + valid + ".", Toast.LENGTH_LONG).show();

            }
        });
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
