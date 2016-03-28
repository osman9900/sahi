package osman.example.com.sahi.Audition.Word_length_2_5;

import android.content.Context;
import android.widget.Toast;

import java.util.Random;

import osman.example.com.sahi.MyMusicPlayer;

/**
 * Created by osman on 3/26/2016.
 */
public class GenerateRandomSound {
    public static boolean testFlag = false;
    public static int imageNumber = 0;
    Context context;

    GenerateRandomSound() {
    }

    public GenerateRandomSound(Context context) {
        this.context = context;
    }

    private int randomNumber() {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        if (randomNum < 0) {
            randomNum = -randomNum;
        }
        return randomNum;
    }

    protected void generateRandomSound(int[] soundResId) {

        switch (randomNumber()) {
            case 0:
                testFlag = true;
                imageNumber = 1;
                MyMusicPlayer.getInstance().setMusicPlayerContext(context);
                MyMusicPlayer.getInstance().mStart(soundResId[1]);
                break;
            case 1:
                testFlag = true;
                imageNumber = 2;
                MyMusicPlayer.getInstance().setMusicPlayerContext(context);
                MyMusicPlayer.getInstance().mStart(soundResId[2]);

                break;
            case 2:
                testFlag = true;
                imageNumber = 3;
                MyMusicPlayer.getInstance().setMusicPlayerContext(context);
                MyMusicPlayer.getInstance().mStart(soundResId[3]);
                break;
            default:
                Toast.makeText(context, "-1", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}