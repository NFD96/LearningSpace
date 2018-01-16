package com.example.danutneagu.magicsaloons;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.example.danutneagu.magicsaloons.R.raw.video;

/**
 * Created by Danut Neagu on 10/3/2017.
 */

public class VideoViewActivity extends Activity {
    // Declararea variabilelor
    ProgressDialog pDialog;
    VideoView videoview;
    int position = 0;
    private final String TAG = "VideoViewActivity";

    // Introducerea Video URL
    String VideoURL = "http://img.jbzd.pl/2016/06/7c5ed467a0e8ae7d04c80d009851d391.webm";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Obtine layout de la video_main.xml
        setContentView(R.layout.videoview_main);
        // Localizare VideoView in video_main.xml
        videoview = (VideoView) findViewById(R.id.VideoView);

        // Tentativa StreamVideo
//        videoview.setZOrderOnTop(true);
//        videoview.setBackgroundColor(Color.TRANSPARENT);

        // Definire progressbar (Loading animation)
        pDialog = new ProgressDialog(VideoViewActivity.this);
        // Setare titlu progressbar
        pDialog.setTitle("Prezentare Magic");
        // Seteaza mesaj progressbar
        pDialog.setMessage("Buffering...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(true);
        pDialog.setProgress(100);
        // Arata progressbar
        pDialog.show();


        try {
            // Porneste MediaController
            MediaController mediacontroller = new MediaController(
                    VideoViewActivity.this);
            mediacontroller.setAnchorView(videoview);

            // Obtineti adresa URL din String VideoURL
            Uri videoURI = Uri.parse(VideoURL);
            //            videoview.setVideoURI(videoURI);

            //Obtinerea video din resource (res/raw/video.mp4)
            videoview.setMediaController(mediacontroller);
            videoview.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + video));

        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoview.requestFocus();
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            // Inchidere progressbar si rulare videoclip
            public void onPrepared(MediaPlayer mp) {
                pDialog.dismiss();
                //Daca avem definit position in savedInstanceState,reluarea video va incepe de aici
                videoview.seekTo(position);
                if (position == 0) {
                    videoview.start();
                } else {
                    //Daca venim dintr-o activitate reluata si/sau se schimba position(pozitia),videoul va fi pus in pauza
                    videoview.pause();
                }
            }
        });

    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: in");
        super.onStart();
        Log.d(TAG, "onStart: out");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
//        outState.putInt("layoutId", layoutId);
        Log.d(TAG, "onSaveInstanceState: in");
//        outState.putString(CONTENT, textView.getText().toString());
        super.onSaveInstanceState(outState);
        //Obtine pozitia curenta a videoclipului
        //Venind dintr-o activitate reluata va fi pus pe pauza
        outState.putInt("Position", videoview.getCurrentPosition());
        videoview.pause();
//        outState.get(String.valueOf(videoview));
//        setContentView(R.layout.activity_main);
        Log.d(TAG, "onSaveInstanceState: out");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        savedInstanceState.putInt("layoutId", layoutId);
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        Log.d(TAG, "onRestoreInstanceState: in");
//        savedInstanceState.get(String.valueOf(videoview));
        super.onRestoreInstanceState(savedInstanceState);
        //Definire position & Verificare position
        position = savedInstanceState.getInt("Position");
        videoview.seekTo(position);
//        setContentView(R.layout.activity_main);
//        String savedString = String.valueOf(savedInstanceState.get(String.valueOf(videoview)));
//        textView.setText(savedString);
        Log.d(TAG, "onRestoreInstanceState: out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: in");
        super.onRestart();
        Log.d(TAG, "onRestart: out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: in");
        super.onPause();
        Log.d(TAG, "onPause: out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: in");
        super.onStop();
        Log.d(TAG, "onStop: out");


    }

}
