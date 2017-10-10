package com.example.danutneagu.magicsaloons;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Danut Neagu on 8/31/2017.
 */

public class MyListAdapter2 extends MyListAdapter {
    private final Activity context;
    private final String[] progList;
//    private final Integer[] progImages;
    private Integer[] sectionsImages;
    private Integer[] products;

    public MyListAdapter2(Activity context, Integer[] sectionsImages, Integer[] products, String[] progList) {
        super(context, progList, products);
        this.context = context;
        this.progList = progList;
        this.products = products;
//        this.progImages = progImages;
        this.sectionsImages = sectionsImages;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater2 = context.getLayoutInflater();
        View rowView2 = inflater2.inflate(R.layout.activity_image_list2, null, true);
        //2nd ListAdapter
        TextView txtView2 = (TextView) rowView2.findViewById(R.id.textView1);
        ImageView imageView2 = (ImageView) rowView2.findViewById(R.id.sectionView);
//        ImageView imageView3 = (ImageView) rowView2.findViewById(R.id.sectionView);
        //
        txtView2.setText(progList[position]);
        imageView2.setImageResource(products[position]);
//        imageView3.setImageResource(sectionsImages[position]);


        return rowView2;

    }
}
