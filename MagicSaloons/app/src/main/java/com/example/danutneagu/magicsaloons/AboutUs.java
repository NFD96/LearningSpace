package com.example.danutneagu.magicsaloons;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

//import com.google.android.youtube.player.YouTubeBaseActivity;
//import com.google.android.youtube.player.YouTubePlayer;
//import com.google.android.youtube.player.YouTubePlayerView;
//import com.google.android.youtube.player.YouTubeThumbnailView;

import java.util.List;

import static com.example.danutneagu.magicsaloons.R.raw.video;
import static com.example.danutneagu.magicsaloons.R.raw.videotest;

public class AboutUs extends AppCompatActivity {
    private static final String TAG = "AboutUs";

//    Button button10 = (Button) findViewById(R.id.button10);
//    YouTubePlayer YPW;
//    YouTubePlayer.OnInitializedListener listener;
//    private MediaPlayer mediaPlayer;
//    private SurfaceHolder vidHolder;
//    private SurfaceView vidSurface;
//    String vidAddress = "android.resource://" + getPackageName() + "/" + video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        // Locate the button in activity_main.xml
        Button _myButton = (Button) findViewById(R.id.MyButton);

        // Capture button clicks
        _myButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(AboutUs.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });

//        vidSurface = (SurfaceView)findViewById(R.id.view2);
//        vidHolder = vidSurface.getHolder();
//        vidHolder.addCallback(this);

//        VideoView view2 = (VideoView) findViewById(R.id.view2);
//        view2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + video));
//        view2.setMediaController(new MediaController(this));
//        MediaController vidControl = new MediaController(this);
//        vidControl.setAnchorView(view2);
//        view2.setMediaController(vidControl);
//        view2.requestFocus();
//        view2.start();




//        YPW = (YouTubePlayerView) findViewById(R.id.view2);
//        listener = new YouTubePlayer() {
//            @Override
//            public void play() {
//
//            }
//
//            @Override
//            public boolean hasPrevious() {
//                return false;
//            }
//
//            @Override
//            public void loadVideo(String s) {
//
//            }
//
//            @Override
//            public void release() {
//
//            }
//
//            @Override
//            public void cueVideo(String s) {
//
//            }
//
//            @Override
//            public void cueVideo(String s, int i) {
//
//            }
//
//            @Override
//            public void loadVideo(String s, int i) {
//
//            }
//
//            @Override
//            public void cuePlaylist(String s) {
//
//            }
//
//            @Override
//            public void cuePlaylist(String s, int i, int i1) {
//
//            }
//
//            @Override
//            public void loadPlaylist(String s) {
//
//            }
//
//            @Override
//            public void loadPlaylist(String s, int i, int i1) {
//
//            }
//
//            @Override
//            public void cueVideos(List<String> list) {
//
//            }
//
//            @Override
//            public void cueVideos(List<String> list, int i, int i1) {
//
//            }
//
//            @Override
//            public void loadVideos(List<String> list) {
//
//            }
//
//            @Override
//            public void loadVideos(List<String> list, int i, int i1) {
//
//            }
//
//            @Override
//            public void pause() {
//
//            }
//
//            @Override
//            public boolean isPlaying() {
//                return false;
//            }
//
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public void next() {
//
//            }
//
//            @Override
//            public void previous() {
//
//            }
//
//            @Override
//            public int getCurrentTimeMillis() {
//                return 0;
//            }
//
//            @Override
//            public int getDurationMillis() {
//                return 0;
//            }
//
//            @Override
//            public void seekToMillis(int i) {
//
//            }
//
//            @Override
//            public void seekRelativeMillis(int i) {
//
//            }
//
//            @Override
//            public void setFullscreen(boolean b) {
//
//            }
//
//            @Override
//            public void setOnFullscreenListener(OnFullscreenListener onFullscreenListener) {
//
//            }
//
//            @Override
//            public void setFullscreenControlFlags(int i) {
//
//            }
//
//            @Override
//            public int getFullscreenControlFlags() {
//                return 0;
//            }
//
//            @Override
//            public void addFullscreenControlFlag(int i) {
//
//            }
//
//            @Override
//            public void setPlayerStyle(PlayerStyle playerStyle) {
//
//            }
//
//            @Override
//            public void setShowFullscreenButton(boolean b) {
//
//            }
//
//            @Override
//            public void setManageAudioFocus(boolean b) {
//
//            }
//
//            @Override
//            public void setPlaylistEventListener(PlaylistEventListener playlistEventListener) {
//
//            }
//
//            @Override
//            public void setPlayerStateChangeListener(PlayerStateChangeListener playerStateChangeListener) {
//
//            }
//
//            @Override
//            public void setPlaybackEventListener(PlaybackEventListener playbackEventListener) {
//
//            }
//
//            @Override
//            public void onInitializationSucces(YouTubePlayer.Provider provider, YouTubePlayer player, boolean b) {
//                player.loadVideo("a4NT5iBFuZs");
//            }
//            };
//
//            button10.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    videoplay(view2);
//                }
//            });
//    }
//    public void videoplay(View v) {
//        String videopath = "android.resource://" + getPackageName() + "/" + video;
//        Uri uri = Uri.parse(videopath);
//        view2.setVideoURI(uri);
//        view2.start();
//
//    }
    }
//    @Override
//    public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
//        // TODO Auto-generated method stub
//    }
//
//    @Override
//    public void surfaceCreated(SurfaceHolder arg0) {
//        try {
//            mediaPlayer = new MediaPlayer();
//            mediaPlayer.setDisplay(vidHolder);
//            mediaPlayer.setDataSource(vidAddress);
//            mediaPlayer.prepare();
//            mediaPlayer.setOnPreparedListener(this);
//            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void surfaceDestroyed(SurfaceHolder arg0) {
//        // TODO Auto-generated method stub
//    }
//
//    @Override
//    public void onPrepared(MediaPlayer mp) {
//      mediaPlayer.start();
//    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, RESULT_OK);
        finish();
        overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }
}
