package osman.example.com.sahi.Audition.Word_length_2_5;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import osman.example.com.sahi.MyMusicPlayer;
import osman.example.com.sahi.R;

public class WL_1 extends AppCompatActivity {
    static int imageNumber = 0;
    static boolean testFlag = false;
    ImageView car;
    ImageView bicycle;
    ImageView ambulance;
    Button next_button;
    TextView textViewCar;
    TextView textViewBicycle;
    TextView textViewAmbulance;
    ImageView identify_image_sound;
    ImageView correctTick1;
    ImageView correctTick2;
    ImageView correctTick3;
    private boolean marksFlag1 = true;
    private boolean marksFlag2 = true;
    private boolean marksFlag3 = true;
    private int marks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wl_1);
        textViewCar = (TextView) findViewById(R.id.textView1);
        textViewBicycle = (TextView) findViewById(R.id.textView2);
        textViewAmbulance = (TextView) findViewById(R.id.textView3);

        textViewCar.setText(R.string.car);
        textViewBicycle.setText(R.string.bicycle);
        textViewAmbulance.setText(R.string.ambulance);

        car = (ImageView) findViewById(R.id.imageView1);
        bicycle = (ImageView) findViewById(R.id.imageView2);
        ambulance = (ImageView) findViewById(R.id.imageView3);

        correctTick1 = (ImageView) findViewById(R.id.action_tick_1);
        correctTick2 = (ImageView) findViewById(R.id.action_tick_2);
        correctTick3 = (ImageView) findViewById(R.id.action_tick_3);

        correctTick1.setVisibility(View.INVISIBLE);
        correctTick2.setVisibility(View.INVISIBLE);
        correctTick3.setVisibility(View.INVISIBLE);

        car.setImageResource(R.drawable.car);
        bicycle.setImageResource(R.drawable.bicycle);
        ambulance.setImageResource(R.drawable.ambulance);


        car.setOnClickListener(new View.OnClickListener() {

            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (testFlag && imageNumber == 1) {
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
                    }

                    testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                MyMusicPlayer.getInstance().mStart(R.raw.car);
            }
        });
        bicycle.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (testFlag && imageNumber == 2) {
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

                    testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                MyMusicPlayer.getInstance().mStart(R.raw.bicycle);
            }
        });
        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (testFlag && imageNumber == 3) {
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
                    }
                    testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                MyMusicPlayer.getInstance().mStart(R.raw.ambulance);
            }
        });

        next_button = (Button) findViewById(R.id.next);
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), WL_2.class));
            }
        });

        identify_image_sound = (ImageView) findViewById(R.id.sound_button);

        identify_image_sound.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int randomNumber = getRandomNumber();
                switch (randomNumber) {
                    case 0:
                        testFlag = true;
                        imageNumber = 1;
                        MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                        MyMusicPlayer.getInstance().mStart(R.raw.car);
                        break;
                    case 1:
                        testFlag = true;
                        imageNumber = 2;
                        MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                        MyMusicPlayer.getInstance().mStart(R.raw.bicycle);

                        break;
                    case 2:
                        testFlag = true;
                        imageNumber = 3;
                        MyMusicPlayer.getInstance().setMusicPlayerContext(getApplicationContext());
                        MyMusicPlayer.getInstance().mStart(R.raw.ambulance);
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
