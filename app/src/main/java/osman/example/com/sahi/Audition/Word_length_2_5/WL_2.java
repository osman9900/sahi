package osman.example.com.sahi.Audition.Word_length_2_5;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import osman.example.com.sahi.MyMusicPlayer;
import osman.example.com.sahi.R;

public class WL_2 extends AppCompatActivity {
    static int imageNumber = 0;
    static int testFlag = 0;
    TextView textViewBrush;
    TextView textViewTowel;
    TextView textViewComb;
    ImageView brush;
    ImageView towel;
    ImageView comb;
    ImageView correctTick1;
    ImageView correctTick2;
    ImageView correctTick3;
    Button next_button;
    ImageButton identify_image_sound;
    private boolean marksFlag1 = true;
    private boolean marksFlag2 = true;
    private boolean marksFlag3 = true;
    private int marks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wl_1);

        textViewBrush = (TextView) findViewById(R.id.textView1);
        textViewTowel = (TextView) findViewById(R.id.textView2);
        textViewComb = (TextView) findViewById(R.id.textView3);

        textViewBrush.setText(R.string.brush);
        textViewTowel.setText(R.string.towel);
        textViewComb.setText(R.string.comb);

        brush = (ImageView) findViewById(R.id.imageView1);
        towel = (ImageView) findViewById(R.id.imageView2);
        comb = (ImageView) findViewById(R.id.imageView3);

        brush.setImageResource(R.drawable.brush);
        towel.setImageResource(R.drawable.towel);
        comb.setImageResource(R.drawable.comb);

        next_button = (Button) findViewById(R.id.next);

        correctTick1 = (ImageView) findViewById(R.id.action_tick_1);
        correctTick2 = (ImageView) findViewById(R.id.action_tick_2);
        correctTick3 = (ImageView) findViewById(R.id.action_tick_3);

        correctTick1.setVisibility(View.INVISIBLE);
        correctTick2.setVisibility(View.INVISIBLE);
        correctTick3.setVisibility(View.INVISIBLE);

        brush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (testFlag == 1 && imageNumber == 1) {
                    correctTick1.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctTick1.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag1) {
                        marks = marks + 1;
                        marksFlag1 = false;
                        Toast.makeText(getApplicationContext(), "marks " + marks, Toast.LENGTH_SHORT).show();
                    }

                    testFlag = 0;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                MyMusicPlayer.getInstance().mStart(R.raw.brush);
            }
        });
        towel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (testFlag == 1 && imageNumber == 2) {
                    correctTick2.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctTick2.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag2) {
                        marks = marks + 1;
                        marksFlag2 = false;
                        Toast.makeText(getApplicationContext(), "marks " + marks, Toast.LENGTH_SHORT).show();
                    }

                    testFlag = 0;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                MyMusicPlayer.getInstance().mStart(R.raw.towel);
            }
        });
        comb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (testFlag == 1 && imageNumber == 3) {
                    correctTick3.setVisibility(View.VISIBLE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctTick3.setVisibility(View.INVISIBLE);
                        }
                    }, 4000);
                    if (marksFlag3) {
                        marks = marks + 1;
                        marksFlag3 = false;
                        Toast.makeText(getApplicationContext(), "marks " + marks, Toast.LENGTH_SHORT).show();
                    }

                    testFlag = 0;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                MyMusicPlayer.getInstance().mStart(R.raw.comb);
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

            @Override
            public void onClick(View v) {

                int randomNumber = getRandomNumber();
                switch (randomNumber) {
                    case 0:
                        testFlag = 1;
                        imageNumber = 1;
                        Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                        MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                        MyMusicPlayer.getInstance().mStart(R.raw.brush);
                        break;
                    case 1:
                        testFlag = 1;
                        imageNumber = 2;
                        MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                        MyMusicPlayer.getInstance().mStart(R.raw.towel);
                        Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        testFlag = 1;
                        imageNumber = 3;
                        MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                        MyMusicPlayer.getInstance().mStart(R.raw.comb);

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
