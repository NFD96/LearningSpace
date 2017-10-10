package com.example.danutneagu.magicsaloons;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.danutneagu.magicsaloons.CoaforServicesList.progNames;

/**
 * Created by Danut Neagu on 8/28/2017.
 */

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] progList;
    private final Integer[] progImages;
    private Integer[] sectionsImages;



    public MyListAdapter(Activity context, String[] progList, Integer[] progImages) {
        super(context, R.layout.activity_image_list, progList);
        this.context = context;
        this.progList = progList;
        this.progImages = progImages;;
    }

//    @Override
//    public String getItem(int position) {
//        int items = progImages(getPosition(getItem(position)));
//        return String.valueOf(getPosition(String.valueOf(items)));
//    }
//
//    private int progImages(int position) {
//        return position;
//    }

    //    public MyListAdapter(Activity context,Integer[] sectionsImages,Integer[] progImages,String[] progList) {
//        super(context, R.layout.activity_image_list2, progList);
//        this.context = context;
//        this.progList = progList;
//        this.progImages = progImages;
//        this.sectionsImages = sectionsImages;
//
//    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
//        LayoutInflater inflater2 = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_image_list, null, true);
//        View rowView2 = inflater2.inflate(R.layout.activity_image_list2, null, true);
        //1st ListAdapter
        TextView txtView = (TextView)rowView.findViewById(R.id.textView1);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.imageView1);
//        EditText inputSearch = (EditText)rowView.findViewById(R.id.editTextSearch);
        //2nd ListAdapter
//        TextView txtView2 = (TextView)rowView2.findViewById(R.id.textView1);
//        ImageView imageView2 = (ImageView)rowView2.findViewById(R.id.imageView1);
//        ImageView imageView3 = (ImageView)rowView2.findViewById(R.id.sectionView);
        //
//        inputSearch.getText();
        txtView.setText(progList[position]);
        imageView.setImageResource(progImages[position]);
        //
//        txtView2.setText(progList[position]);
//        imageView2.setImageResource(progImages[position]);
//        imageView3.setImageResource(sectionsImages[position]);




        return rowView;
    }

}
