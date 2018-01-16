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

/**
 * Created by Danut Neagu on 9/29/2017.
 */

public class CoaforServicesList2 extends AppCompatActivity {
    //Declararea variabilelor
    ListView listView;
    Context context;
    ArrayList progList;
    ArrayList sectionsLists;

    public static Integer[] progImages = {
            R.drawable.manichiura,R.drawable.cosmetica,R.drawable.tratamente,R.drawable.epilare,
            R.drawable.machiajsemi,R.drawable.pmachiaj,R.drawable.punghii,R.drawable.ppar,
    };

    public static Integer[] products = {
            R.drawable.test

    };

    public static String[] progNames = {
            "Manichiura"
// "Cosmetica", "Tratamente Academie", "Epilare Definitiva", "Machiaj Semipermanent"
//            , "Produse Machiaj", "Produse Unghii", "Produse Par"
    };

    //test
//    public static Integer[] sectionsImages = {
//            R.drawable.coafor,R.drawable.manichiura,R.drawable.cosmetica,R.drawable.tratamente,R.drawable.epilare,
//            R.drawable.machiajsemi,R.drawable.pmachiaj,R.drawable.punghii,R.drawable.ppar,
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image2);

        // Initializare si setare adapter
        // Localizare listview
        // Capturarea activitatii la (button) click
        MyListAdapter2 adapter = new MyListAdapter2(this, progImages, products, progNames);
        listView = (ListView)findViewById(R.id.listView2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CoaforServicesList2.this, " Ai selectat " + progNames[position],Toast.LENGTH_LONG).show();
            }
        });
    }

    // Butonul de back default devine functie activa de back in app cu animatie (rasfoire pagini)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, CoaforServicesList.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }
}
