package osman.example.com.sahi;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by osman on 3/25/2016.
 */
public class MyMusicPlayer {

    Context appContext;
    MediaPlayer mediaPlayer;

    private static MyMusicPlayer ourInstance = new MyMusicPlayer();

    public static MyMusicPlayer getInstance() {
        return ourInstance;
    }

    public void setMusicPlayerContext(Context context)
    {
        this.appContext = context;
    }

    private MyMusicPlayer() {
    }

    public void mStart(int id ) {
        mediaPlayer = MediaPlayer.create(appContext, id);
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

   public void mStop() {
        mediaPlayer.stop();
    }

}
