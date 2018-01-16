package com.example.danutneagu.magicsaloons;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.ceylonlabs.imageviewpopup.ImagePopup;
import com.example.danutneagu.magicsaloons.com.example.danutneagu.magicsaloons.RecyclerItemClickListener;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;

/**
 * Created by Danut Neagu on 10/6/2017.
 */

public class Gallery extends AppCompatActivity {
    //Declararea variabilelor
    private static final String TAG = "Gallery";
    public int currentimageindex = 0;

//    boolean isImageFitToScreen;

    //Arrays
    private final String image_titles[] = {
            "1.","2.","3.","4.","5.",
    };

    private final Integer image_ids[] = {
            R.drawable.coafor,
            R.drawable.punghii,
            R.drawable.ppar,
            R.drawable.pmachiaj,
            R.drawable.manichiura,

    };

    private final String image_locations[] = {
            "Test","Test2","Test3","Test4","Test5",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
//        final ImagePopup imagePopup = new ImagePopup(this);
//        imagePopup.setBackgroundColor(Color.BLACK);
//        imagePopup.setFullScreen(true);
//        imagePopup.setHideCloseIcon(true);
//        imagePopup.setImageOnClickClose(true);



        //Setare & Localizare (Recycler) View
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.imagegallery);
//        ImageView iV = (ImageView)findViewById(R.id.iV);
//        imagePopup.initiatePopup(iV.getDrawable());
//        imagePopup.initiatePopup(currentimageindex);
//        currentimageindex++;
//        recyclerView.setOnClickListener(this);
        recyclerView.setHasFixedSize(true);
        //Setare layoutManager ca Grid (4 obiecte pe un rand)
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 4);
        recyclerView.setLayoutManager(layoutManager);
//        Picasso.with(this).load(R.id.imagegallery).into((Target) recyclerView);
//        imagePopup.initiatePopup(getDrawable(currentimageindex));
        //Atribuire lista
        ArrayList<CreateList> createLists = prepareData();
        //Setare adapter
        MyAdapter adapter = new MyAdapter(getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);
//        recyclerView.addOnItemTouchListener(
//                new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
//                    @Override public void onItemClick(View view, int position) {
//                        // TODO: Logica popup image click
//                        view.findViewById(image_ids[position]);
//                        view.getResources();
//                        recyclerView.getChildViewHolder(view);
//
//                    }
//                })
//        );
//        recyclerView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if((image_ids.length) > currentimageindex) {
//                    int i = 0; i++;
//                    i = currentimageindex;
//                    recyclerView.setClickable(true);
//                    recyclerView.getChildViewHolder(v.findViewById(i));
////                    imagePopup.initiatePopup(getDrawable(i));
////                    imagePopup.viewPopup();
////                    recyclerView.addOnItemTouchListener(image_ids[currentimageindex]);
////                    currentimageindex++;
//                    return;
//
//                }
//            }
//        });

//        recyclerView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if ((image_ids.length > currentimageindex)) {
//                    int i = 0; i++;
//                    i = currentimageindex;
//                    recyclerView.setClickable(true);
//                    recyclerView.getChildViewHolder(v.findViewById(currentimageindex));
//                    imagePopup.initiatePopup(getDrawable(currentimageindex));
//                    imagePopup.viewPopup();
//                }
//            }
//        });
    }

    // Definire lista & conditii

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

    // Butonul de back default devine functie activa de back in app cu animatie (rasfoire pagini)
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }


//    @Override
//    public void onClick(View v) {
//        Animation inFromRight = new TranslateAnimation(
//                Animation.RELATIVE_TO_PARENT, +1.0f,
//                Animation.RELATIVE_TO_PARENT, 0.0f,
//                Animation.RELATIVE_TO_PARENT, 0.0f,
//                Animation.RELATIVE_TO_PARENT, 0.0f);
//        inFromRight.setDuration(500);
//        ImageView imageview = (ImageView)findViewById(R.id.imagegallery);
//        imageview.setImageResource(R.drawable.coafor);
//        imageview.startAnimation(inFromRight);
//
//        if((image_ids.length) > currentimageindex) {
//            imageview.setImageResource(image_ids[currentimageindex]);
//            currentimageindex++;
//        }
//    }
}

