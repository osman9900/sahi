package osman.example.com.sahi.Audition.Word_length_2_5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import osman.example.com.sahi.R;

/**
 * Created by osman on 3/25/2016.
 */
public class WordLengthActivity extends AppCompatActivity implements View.OnClickListener {

    Button next;
    ImageButton randomSoundButton;
    ImageView tickAction1;
    ImageView tickAction2;
    ImageView tickAction3;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    private int soundResId[] = new int[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.world_lenght_activity_2_to_5);
        next = (Button) findViewById(R.id.next);
        randomSoundButton = (ImageButton) findViewById(R.id.sound_button);

        tickAction1 = (ImageView) findViewById(R.id.action_tick_1);
        tickAction2 = (ImageView) findViewById(R.id.action_tick_2);
        tickAction3 = (ImageView) findViewById(R.id.action_tick_3);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);


        int activityNumber = getIntent().getIntExtra("ActivityNumber", 0);

        switch (activityNumber) {
            case 1:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.car;
                soundResId[2] = R.raw.bicycle;
                soundResId[3] = R.raw.ambulance;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 2);
                        startActivity(intent);
                    }
                });
                break;
            case 2:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.brush;
                soundResId[2] = R.raw.towel;
                soundResId[3] = R.raw.comb;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 3);
                        startActivity(intent);
                    }
                });
                break;
            case 3:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.book;
                soundResId[2] = R.raw.bottle;
                soundResId[3] = R.raw.umbrella;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 4);
                        startActivity(intent);
                    }
                });
                break;
            case 4:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.fan;
                soundResId[2] = R.raw.remote;
                soundResId[3] = R.raw.computer;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 5);
                        startActivity(intent);
                    }
                });
                break;
            case 5:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.light;
                soundResId[2] = R.raw.tv;
                soundResId[3] = R.raw.cylinder;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 6);
                        startActivity(intent);
                    }
                });
                break;
            case 6:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.sun;
                soundResId[2] = R.raw.lock;
                soundResId[3] = R.raw.giraffe;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 7);
                        startActivity(intent);
                    }
                });
                break;
            case 7:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.cup;
                soundResId[2] = R.raw.candle;
                soundResId[3] = R.raw.cheetah;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 8);
                        startActivity(intent);
                    }
                });
                break;
            case 8:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.ball;
                soundResId[2] = R.raw.cooker;
                soundResId[3] = R.raw.pustakam;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 9);
                        startActivity(intent);
                    }
                });
                break;
            case 9:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.kite;
                soundResId[2] = R.raw.frog;
                soundResId[3] = R.raw.cylinder;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 10);
                        startActivity(intent);
                    }
                });
                break;
            case 10:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.bag;
                soundResId[2] = R.raw.auto;
                soundResId[3] = R.raw.aeroplane;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 11);
                        startActivity(intent);
                    }
                });
                break;
            case 11:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.bell;
                soundResId[2] = R.raw.calender;
                soundResId[3] = R.raw.ticket;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 12);
                        startActivity(intent);
                    }
                });
                break;
            case 12:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.pen;
                soundResId[2] = R.raw.pencil;
                soundResId[3] = R.raw.papaya;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 13);
                        startActivity(intent);
                    }
                });
                break;
            case 13:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.jam;
                soundResId[2] = R.raw.vada;
                soundResId[3] = R.raw.samosa;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 14);
                        startActivity(intent);
                    }
                });
                break;
            case 14:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.bread;
                soundResId[2] = R.raw.puri;
                soundResId[3] = R.raw.chapati;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 15);
                        startActivity(intent);
                    }
                });
                break;
            case 15:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.cake;
                soundResId[2] = R.raw.potato;
                soundResId[3] = R.raw.tomato;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 16);
                        startActivity(intent);
                    }
                });
                break;
            case 16:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.kheer;
                soundResId[2] = R.raw.dosa;
                soundResId[3] = R.raw.biscuits;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 17);
                        startActivity(intent);
                    }
                });
                break;
            case 17:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.gun;
                soundResId[2] = R.raw.rice;
                soundResId[3] = R.raw.mirror;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 18);
                        startActivity(intent);
                    }
                });
                break;
            case 18:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.coat;
                soundResId[2] = R.raw.curry;
                soundResId[3] = R.raw.rasamu;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 19);
                        startActivity(intent);
                    }
                });
                break;
            case 19:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.bed;
                soundResId[2] = R.raw.raggu;
                soundResId[3] = R.raw.blanket;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
                        intent.putExtra("ActivityNumber", 20);
                        startActivity(intent);
                    }
                });
                break;
            case 20:
                new SetLayoutContent(this).setLayoutContent(activityNumber);
                soundResId[1] = R.raw.key;
                soundResId[2] = R.raw.cap;
                soundResId[3] = R.raw.slippers;
                randomSoundButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        new GenerateRandomSound(getApplicationContext()).generateRandomSound(soundResId);
                    }
                });
                break;

        }


    }

    @Override
    public void onClick(View v) {
        new ImageClicked(this, soundResId).extractSound(v);


  /*      switch (v.getId()) {
            case R.id.imageView1:

                Toast.makeText(this, "Image view 1 clicked ", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(this, "marks " + marks, Toast.LENGTH_SHORT).show();
                    }

                    GenerateRandomSound.testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(this);
                MyMusicPlayer.getInstance().mStart(soundResId[1]);
                break;
            case R.id.imageView2:
                Toast.makeText(this, "Image view 1 clicked ", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(this, "marks " + marks, Toast.LENGTH_SHORT).show();
                    }

                    GenerateRandomSound.testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(this);
                MyMusicPlayer.getInstance().mStart(soundResId[2]);
                break;
            case R.id.imageView3:
                Toast.makeText(this, "Image view 1 clicked ", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(this, "marks " + marks, Toast.LENGTH_SHORT).show();
                    }
                    GenerateRandomSound.testFlag = false;
                }
                MyMusicPlayer.getInstance().setMusicPlayerContext(this);
                MyMusicPlayer.getInstance().mStart(soundResId[3]);
                break;
        }  */
    }


}
