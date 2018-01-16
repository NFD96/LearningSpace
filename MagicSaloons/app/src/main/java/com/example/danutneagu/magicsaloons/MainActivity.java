package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.danutneagu.magicsaloons.com.example.danutneagu.magicsaloons.extensions.RetailerActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/*
First Attempt
Neagu Danut
 */

public class MainActivity extends AppCompatActivity {
    //Declararea variabilelor
//    EditText editText = (EditText)findViewById(R.id.editText);
//    TextView textView = (TextView)findViewById(R.id.textView);

    private static final String TAG = "MainActivity";
    private final String CONTENT = "Content";
    private final int PENDING = 0;

//    int layoutId = R.layout.activity_main;

    @Bind(R.id.button1) Button _button1;
    @Bind(R.id.button2) Button _button2;
    @Bind(R.id.button3) Button _button3;
    @Bind(R.id.button4) Button _button4;
    @Bind(R.id.button5) Button _button5;
    @Bind(R.id.button6) Button _button6;
    @Bind(R.id.button7) Button _button7;
    @Bind(R.id.button8) Button _button8;
    @Bind(R.id.button9) Button _button9;

//    Button homeButton = (Button)findViewById(R.id.button1);
//    Button psButton = (Button)findViewById(R.id.button2);
//    Button contactButton = (Button)findViewById(R.id.button3);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: in");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //Bara de sus ascunsa
        getSupportActionBar().hide();
        //Setare layout fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivity(intent);

        // Capturarea activitatii la (button) click
        _button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent1 = new Intent(getApplicationContext(), AboutUs.class);
                startActivityForResult(intent1, RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        Log.d(TAG, "onCreate: out");

        _button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent2 = new Intent(getApplicationContext(), CoaforServicesList.class);
                startActivityForResult(intent2,RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        Log.d(TAG, "onCreate: out");

        _button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent3 = new Intent(getApplicationContext(), Contact.class);
                startActivityForResult(intent3, RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        Log.d(TAG, "onCreate: out");

        _button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivityForResult(intent4, RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        Log.d(TAG, "onCreate: out");

        _button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(), Gallery.class);
                startActivityForResult(intent5, RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        Log.d(TAG, "onCreate: out");

        _button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getApplicationContext(), Newsletter.class);
                startActivityForResult(intent6, RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        Log.d(TAG, "onCreate: out");

        _button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(getApplicationContext(), Deals.class);
                startActivityForResult(intent7, RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        Log.d(TAG, "onCreate: out");

        _button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(getApplicationContext(), Blog.class);
                startActivityForResult(intent8, RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        Log.d(TAG, "onCreate: out");

        _button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(getApplicationContext(), WorkWithUs.class);
                startActivityForResult(intent9, RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        Log.d(TAG, "onCreate: out");

    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: in");
        super.onStart();
        Log.d(TAG, "onStart: out");
    }
    
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        savedInstanceState.putInt("layoutId", layoutId);
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        Log.d(TAG, "onRestoreInstanceState: in");
        super.onRestoreInstanceState(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        String savedString = savedInstanceState.getString(CONTENT);
//        textView.setText(savedString);
        Log.d(TAG, "onRestoreInstanceState: out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: in");
        super.onRestart();
        Log.d(TAG, "onRestart: out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
//        outState.putInt("layoutId", layoutId);
        Log.d(TAG, "onSaveInstanceState: in");
//        outState.putString(CONTENT, textView.getText().toString());
        super.onSaveInstanceState(outState);
//        setContentView(R.layout.activity_main);
        Log.d(TAG, "onSaveInstanceState: out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: in");
        super.onPause();
        Log.d(TAG, "onPause: out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: in");
        super.onStop();
        Log.d(TAG, "onStop: out");
    }

//    @Override
//    public void onBackPressed() {
////        moveTaskToBack(true);
//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivityForResult(intent, RESULT_OK);
//        finish();
//    }


    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        //Inflate the menu,this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}

