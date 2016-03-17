package osman.example.com.sahi.Audition.Word_length_2_5;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by osman on 2/12/2016.
 */
public class MyMusicPlayer {
    MediaPlayer mediaPlayer;
    private Context appContext;

    MyMusicPlayer(Context context){
        this.appContext=context;
    }
    void mCreate(int id){

        mediaPlayer=MediaPlayer.create(appContext,id);
    }
    void mStart() {
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.reset();
                mp.release();
            }
        });

    }
    void mStop()
    {
        mediaPlayer.stop();
    }


}
