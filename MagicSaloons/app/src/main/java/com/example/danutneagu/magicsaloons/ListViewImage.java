package com.example.danutneagu.magicsaloons;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/*
First Attempt
Neagu Danut
 */


public class ListViewImage extends AppCompatActivity {

    ListView listView;
    Context context;
    ArrayList progList;

    public static Integer[] progImages = {
      R.drawable.coafor,R.drawable.manichiura,R.drawable.cosmetica,R.drawable.tratamente,R.drawable.epilare,
            R.drawable.machiajsemi,R.drawable.pmachiaj,R.drawable.punghii,R.drawable.ppar,R.drawable.logo
    };

    public static String[] progNames = {
            "Coafor", "Manichiura", "Cosmetica", "Tratamente Academie", "Epilare Definitiva", "Machiaj Semipermanent"
            , "Produse Machiaj", "Produse Unghii", "Produse Par", "Scrolling Test"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);

        MyListAdapter adapter = new MyListAdapter(this, progNames, progImages);
        listView = (ListView)findViewById(R.id.listView2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewImage.this, " You clicked at " + progNames[position],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), CoaforServicesList.class);
                startActivityForResult(intent, RESULT_OK);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
    }
    @Override
    public void onBackPressed() {
        // Disable going back to the LoginActivity
//        moveTaskToBack(true);
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }

}
