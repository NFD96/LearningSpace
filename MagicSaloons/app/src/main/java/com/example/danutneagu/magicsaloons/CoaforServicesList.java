package com.example.danutneagu.magicsaloons;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CoaforServicesList extends AppCompatActivity {
    ListView listView;
    Context context;
    ArrayList progList;
    ArrayList sectionsLists;

    public static Integer[] progImages = {
            R.drawable.manichiura,R.drawable.cosmetica,R.drawable.tratamente,R.drawable.epilare,
            R.drawable.machiajsemi,R.drawable.pmachiaj,R.drawable.punghii,R.drawable.ppar,
    };

    public static String[] progNames = {
            "Manichiura", "Cosmetica", "Tratamente Academie", "Epilare Definitiva", "Machiaj Semipermanent"
            , "Produse Machiaj", "Produse Unghii", "Produse Par"
    };


    public static Integer[] sectionsImages = {
            R.drawable.coafor,R.drawable.manichiura,R.drawable.cosmetica,R.drawable.tratamente,R.drawable.epilare,
            R.drawable.machiajsemi,R.drawable.pmachiaj,R.drawable.punghii,R.drawable.ppar,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image2);

        MyListAdapter2 adapter = new MyListAdapter2(this, sectionsImages, progImages, progNames);
        listView = (ListView)findViewById(R.id.listView2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CoaforServicesList.this, "You clicked at " + progNames[position],Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Disable going back to the LoginActivity
//        moveTaskToBack(true);
        Intent intent = new Intent(this, ListViewImage.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
    }
}
