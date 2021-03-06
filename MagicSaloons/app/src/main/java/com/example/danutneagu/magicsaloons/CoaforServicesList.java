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
 * Created by Danut Neagu on 9/28/2017.
 */


public class CoaforServicesList extends AppCompatActivity {
    //Declararea variabilelor
    ListView listView;
    Context context;
    ArrayList progList;

    public static Integer[] progImages = {
      R.drawable.coafor,R.drawable.manichiura,R.drawable.cosmetica,R.drawable.tratamente,R.drawable.epilare,
            R.drawable.machiajsemi,R.drawable.pmachiaj,R.drawable.punghii,R.drawable.ppar,R.drawable.logo
    };

    public static String[] progNames = {
            "Coafor", "Manichiura", "Cosmetica", "Tratamente Academie", "Epilare Definitiva", "Machiaj Semipermanent"
            , "Produse Machiaj", "Produse Unghii", "Produse Par", "Scrolling test"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);

        // Initializare si setare adapter
        // Localizare listview
        // Capturarea activitatii la (button) click
        MyListAdapter adapter = new MyListAdapter(this, progNames, progImages);
        listView = (ListView)findViewById(R.id.listView2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CoaforServicesList.this, " Ai selectat " + progNames[position],Toast.LENGTH_LONG).show();
                if(position == 0){
                    Intent intent = new Intent(view.getContext(), CoaforServicesList2.class);
                    startActivityForResult(intent,0);
                }
//                if(position == 1){
//                    Intent intent = new Intent(view.getContext(), CoaforServicesAndProductsSearch.class);
//                    startActivityForResult(intent,1);
//                }
//                Intent intent = new Intent(getApplicationContext(), CoaforServicesList2.class);
//                startActivityForResult(intent, RESULT_OK);
//                finish();

                //Animatie cu efect de rasfoit pagini.
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
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
