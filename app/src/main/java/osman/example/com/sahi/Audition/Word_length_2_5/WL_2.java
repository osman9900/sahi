package osman.example.com.sahi.Audition.Word_length_2_5;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import osman.example.com.sahi.R;

public class WL_2 extends AppCompatActivity {
    static int imageNumber = 0;
    static int testFlag = 0;
    private  int marksFlag1 = 0;
    private  int marksFlag2 = 0;
    private  int marksFlag3 = 0;
    ImageView brush;
    ImageView towel;
    ImageView comb;
    Button next_button;
    ImageButton identify_image_sound;
    ImageView correctTick;
    private int marks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wl_2);
        brush = (ImageView) findViewById(R.id.imageView1);
        towel = (ImageView) findViewById(R.id.imageView2);
        comb = (ImageView) findViewById(R.id.imageView3);
        next_button = (Button) findViewById(R.id.next);
        correctTick = (ImageView) findViewById(R.id.ic_action_tick);
        correctTick.setVisibility(View.GONE);

        final MyMusicPlayer musicPlayer = new MyMusicPlayer(getApplicationContext());
        brush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (testFlag == 1 && imageNumber == 1) {
                    correctTick.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctTick.setVisibility(View.GONE);
                        }
                    }, 4000);
                    if(marksFlag1==0){marks=marks+1;marksFlag1=1;}
                    Toast.makeText(getApplicationContext(), "marks " + marks, Toast.LENGTH_SHORT).show();
                    testFlag = 0;
                }
                musicPlayer.mCreate(R.raw.brush);
                musicPlayer.mStart();
            }
        });
        towel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (testFlag == 1 && imageNumber == 2) {
                    correctTick.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctTick.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag2 == 0) {
                        marks = marks + 1;
                        marksFlag2 = 1;
                    }
                    Toast.makeText(getApplicationContext(), "marks " + marks, Toast.LENGTH_SHORT).show();
                    testFlag = 0;
                }
                musicPlayer.mCreate(R.raw.towel);
                musicPlayer.mStart();
            }
        });
        comb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (testFlag == 1 && imageNumber == 3) {
                    correctTick.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctTick.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if(marksFlag3==0){marks=marks+1;marksFlag3=1;}
                    Toast.makeText(getApplicationContext(), "marks " + marks, Toast.LENGTH_SHORT).show();
                    testFlag = 0;
                }
                musicPlayer.mCreate(R.raw.comb);
                musicPlayer.mStart();
            }
        });
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), WL_3.class));
            }
        });
        identify_image_sound = (ImageButton) findViewById(R.id.sound_button);

        identify_image_sound.setOnClickListener(new View.OnClickListener() {

            MyMusicPlayer musicPlayer = new MyMusicPlayer(getApplicationContext());

            @Override
            public void onClick(View v) {

                int randomNumber = getRandomNumber();
                switch (randomNumber) {
                    case 0:
                        testFlag = 1;
                        imageNumber = 1;
                        Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                        musicPlayer.mCreate(R.raw.brush);
                        musicPlayer.mStart();
                        break;
                    case 1:
                        testFlag = 1;
                        imageNumber = 2;
                        musicPlayer.mCreate(R.raw.towel);
                        musicPlayer.mStart();
                        Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        testFlag = 1;
                        imageNumber = 3;
                        musicPlayer.mCreate(R.raw.comb);
                        musicPlayer.mStart();
                        Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "-1", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
    private int getRandomNumber() {
        Random random = new Random();
        int randomNumber = -1;
        try {
            randomNumber = random.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (randomNumber < 0) {
            randomNumber = -randomNumber;
        }
        randomNumber = randomNumber % 3;
        return randomNumber;
    }
}
