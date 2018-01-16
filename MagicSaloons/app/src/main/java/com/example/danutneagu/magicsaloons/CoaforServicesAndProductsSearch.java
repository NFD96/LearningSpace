package com.example.danutneagu.magicsaloons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

/*
Testing Search Module
 */

public class CoaforServicesAndProductsSearch extends AppCompatActivity {
    //Declararea variabilelor

    // List view
    private ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coafor_services_and_products_search);

        // Listview Data
        String products[] = {"Dell Inspiron", "MacBook Air", "Mac Mini", "MacBook Pro"};

        lv = (ListView) findViewById(R.id.listView2);
//        inputSearch = (EditText) findViewById(R.id.editTextSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.activity_image_list, R.id.listView2, products);
        lv.setAdapter(adapter);

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // Cand userul schimba textul
                CoaforServicesAndProductsSearch.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO

            }
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO
            }
        });

        }
}
