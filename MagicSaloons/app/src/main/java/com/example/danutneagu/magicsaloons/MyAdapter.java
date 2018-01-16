package com.example.danutneagu.magicsaloons;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ceylonlabs.imageviewpopup.ImagePopup;

import java.util.ArrayList;

/**
 * Created by Danut Neagu on 10/6/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<CreateList> galleryList;
    private Context context;
    private int layoutResourceId;
    public boolean isImageFitToScreen;


//    private ArrayList<CreateList> prepareData(){
//        ArrayList<CreateList> theimage = new ArrayList<>();
//        for(int i = 0; i< image_titles.length; i++){
//            CreateList createList = new CreateList();
//            createList.setImage_title(image_titles[i]);
//            createList.setImage_id(image_ids[i]);
//            createList.setImage_Location(image_locations[i]);
//            theimage.add(createList);
//        }
////        String path = Environment.getRootDirectory().toString();
////        File f = new File(path);
////        File file[] = f.listFiles();
////        for (int i=0; i < file.length; i++)
////        {
////            CreateList createList = new CreateList();
////            createList.setImage_Location(file[i].getName());
////        }
//        return theimage;
//    }

    public MyAdapter(Context context, ArrayList<CreateList> galleryList) {
        this.galleryList = galleryList;
        this.context = context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_layout, viewGroup, false);
        return new ViewHolder(view);

    }





    @Override
    public void onBindViewHolder(final MyAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.title.setText(galleryList.get(i).getImage_title());
        viewHolder.img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        viewHolder.img.setImageResource((galleryList.get(i).getImage_id()));
        viewHolder.img.getDrawable();
        viewHolder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String test;
                test = galleryList.get(i).getImage_title();
                int currentimageindex = i;



//                final ImagePopup imagePopup = new ImagePopup(context);
//                imagePopup.setBackgroundColor(Color.BLACK);
//                imagePopup.setFullScreen(true);
//                imagePopup.setHideCloseIcon(true);
//                imagePopup.setImageOnClickClose(true);
//                ImageView imageView;
//                imageView = viewHolder.img;
//                imageView.findViewById(R.id.img);
//                imagePopup.initiatePopup(imageView.getDrawable());
//                imagePopup.viewPopup();
                Toast.makeText(context,"Image Click" + " / " + " Image No: " + test + " / " + " Position index: " + currentimageindex , Toast.LENGTH_SHORT).show();
        }

        });
    }

    @Override
    public int getItemCount() {
        return galleryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private ImageView img;

        public ViewHolder(View view) {
            super(view);
            title = (TextView)view.findViewById(R.id.title);
            img = (ImageView) view.findViewById(R.id.img);
//            ImageView imageView = this.img;
        }

    }

}