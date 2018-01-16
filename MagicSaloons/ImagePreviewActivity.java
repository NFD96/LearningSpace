package com.example.danutneagu.magicsaloons;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import butterknife.OnClick;

public class ImagePreviewActivity extends AppCompatActivity implements View.OnClickListener {
    public int currentimageindex = 0;
    private int[] IMAGE_IDS = {R.drawable.coafor,R.drawable.machiajsemi,R.drawable.manichiura,R.drawable.pmachiaj};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_preview);

        ImageView imageview;
        imageview = (ImageView)findViewById(R.id.imageView3);
        imageview.setImageResource(R.drawable.coafor);
        currentimageindex++;
        imageview.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Animation inFromRight = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, +1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f);
        inFromRight.setDuration(500);
        ImageView imageview = (ImageView)findViewById(R.id.imageView3);
        imageview.startAnimation(inFromRight);

        if((IMAGE_IDS.length) > currentimageindex) {
            imageview.setImageResource(IMAGE_IDS[currentimageindex]);
        }
    }
}
