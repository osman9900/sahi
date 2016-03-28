package osman.example.com.sahi.Audition.Word_length_2_5;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import osman.example.com.sahi.MyMusicPlayer;
import osman.example.com.sahi.R;

/**
 * Created by osman on 3/26/2016.
 */
public class ImageClicked {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    ImageView tickAction1;
    ImageView tickAction2;
    ImageView tickAction3;

    private static int marks=0;
    private static boolean marksFlag1=true;
    private static boolean marksFlag2=true;
    private static boolean marksFlag3=true;

    Activity activity;

    private int soundResId[]=new int[3];

    ImageClicked(Activity activity,int[] soundResId) {

        this.soundResId=soundResId;
        this.activity = activity;

        imageView1 = (ImageView) activity.findViewById(R.id.imageView1);
        imageView2 = (ImageView) activity.findViewById(R.id.imageView2);
        imageView3 = (ImageView) activity.findViewById(R.id.imageView3);

        tickAction1 = (ImageView) activity.findViewById(R.id.action_tick_1);
        tickAction2 = (ImageView) activity.findViewById(R.id.action_tick_2);
        tickAction3 = (ImageView) activity.findViewById(R.id.action_tick_3);
    }
    protected   void extractSound(View view){
        switch (view.getId()) {
            case R.id.imageView1:

                Toast.makeText(activity, "Image view 1 clicked ", Toast.LENGTH_SHORT).show();
                if (GenerateRandomSound.testFlag && GenerateRandomSound.imageNumber == 1) {
                    tickAction1.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tickAction1.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag1) {
                        marks = marks + 1;
                        marksFlag1 = false;
                        Toast.makeText(activity, "marks " + marks, Toast.LENGTH_SHORT).show();
                    }

                    GenerateRandomSound.testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(activity);
                MyMusicPlayer.getInstance().mStart(soundResId[1]);
                break;
            case R.id.imageView2:
                Toast.makeText(activity, "Image view 1 clicked ", Toast.LENGTH_SHORT).show();
                if (GenerateRandomSound.testFlag && GenerateRandomSound.imageNumber == 2) {
                    tickAction2.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tickAction2.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag2) {
                        marks = marks + 1;
                        marksFlag2 = false;
                        Toast.makeText(activity, "marks " + marks, Toast.LENGTH_SHORT).show();
                    }

                    GenerateRandomSound.testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(activity);
                MyMusicPlayer.getInstance().mStart(soundResId[2]);
                break;
            case R.id.imageView3:
                Toast.makeText(activity, "Image view 1 clicked ", Toast.LENGTH_SHORT).show();
                if (GenerateRandomSound.testFlag && GenerateRandomSound.imageNumber == 3) {
                    tickAction3.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tickAction3.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag3) {
                        marks = marks + 1;
                        marksFlag3 = false;
                        Toast.makeText(activity, "marks " + marks, Toast.LENGTH_SHORT).show();
                    }
                    GenerateRandomSound.testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(activity);
                MyMusicPlayer.getInstance().mStart(soundResId[3]);
                break;
        }


     /*   imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenerateRandomSound.testFlag && GenerateRandomSound.imageNumber == 1) {
                    tickAction1.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tickAction1.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag1) {
                        marks = marks + 1;
                        marksFlag1 = false;
                    }

                    GenerateRandomSound.testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(activity);
                MyMusicPlayer.getInstance().mStart(soundResId[1]);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenerateRandomSound.testFlag && GenerateRandomSound.imageNumber == 2) {
                    tickAction2.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tickAction2.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag2) {
                        marks = marks + 1;
                        marksFlag2 = false;
                        Toast.makeText(activity, "marks " + marks, Toast.LENGTH_SHORT).show();
                    }

                    GenerateRandomSound.testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(activity);
                MyMusicPlayer.getInstance().mStart(soundResId[2]);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GenerateRandomSound.testFlag && GenerateRandomSound.imageNumber == 3) {
                    tickAction3.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tickAction3.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag3) {
                        marks = marks + 1;
                        marksFlag3 = false;
                    }
                    GenerateRandomSound.testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(activity);
                MyMusicPlayer.getInstance().mStart(soundResId[3]);
            }
        });  */
    }

}
