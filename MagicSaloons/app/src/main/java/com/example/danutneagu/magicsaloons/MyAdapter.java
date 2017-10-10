package com.example.danutneagu.magicsaloons;

import android.content.Context;
import android.os.Environment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Danut Neagu on 10/6/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<CreateList> galleryList;
    private Context context;


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
    public void onBindViewHolder(MyAdapter.ViewHolder viewHolder, int i) {
        viewHolder.title.setText(galleryList.get(i).getImage_title());
        viewHolder.img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        viewHolder.img.setImageResource((galleryList.get(i).getImage_id()));
        viewHolder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Image", Toast.LENGTH_SHORT).show();
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


        }

    }

}