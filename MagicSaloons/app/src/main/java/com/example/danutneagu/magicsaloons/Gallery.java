package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Gallery extends AppCompatActivity {
    private static final String TAG = "Gallery";

    boolean isImageFitToScreen;

    private final String image_titles[] = {
            "1.","2.","3.","4."
    };

    private final Integer image_ids[] = {
            R.drawable.coafor,
            R.drawable.punghii,
            R.drawable.ppar,
            R.drawable.pmachiaj

    };

    private final String image_locations[] = {
            "Test","Test2","Test3","Test4"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.imagegallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 4);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<CreateList> createLists = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);
//        recyclerView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(isImageFitToScreen) {
//                    isImageFitToScreen = false;
//                    recyclerView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//                } else {
//                    isImageFitToScreen = true;
//                    recyclerView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
//                }
//            }
//        });
    }

    private ArrayList<CreateList> prepareData(){
        ArrayList<CreateList> theimage = new ArrayList<>();
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_id(image_ids[i]);
            createList.setImage_Location(image_locations[i]);
            theimage.add(createList);
        }
        return theimage;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }
}
