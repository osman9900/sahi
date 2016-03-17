package osman.example.com.sahi.Audition.Word_length_2_5;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import osman.example.com.sahi.R;

public class WL_1 extends AppCompatActivity {
    ImageView car;
    ImageView bicycle;
    ImageView ambulance;
    Button next_button;
    ImageView identify_image_sound;
    static int test=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wl_1);
        car = (ImageView) findViewById(R.id.imageView2);
        bicycle = (ImageView) findViewById(R.id.imageView3);
        ambulance = (ImageView) findViewById(R.id.imageView4);
        final MyMusicPlayer musicPlayer = new MyMusicPlayer(getApplicationContext());
        car.setOnClickListener(new View.OnClickListener() {

            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if(test==1){
                    ImageView img= (ImageView) findViewById(R.id.ic_action_tick);
                    img.setImageDrawable(getDrawable(R.drawable.ic_action_tick));
                }
                musicPlayer.mCreate(R.raw.car);
                musicPlayer.mStart();
            }
        });
        bicycle.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if(test==2){
                    ImageView img= (ImageView) findViewById(R.id.ic_action_tick);
                    img.setImageDrawable(getDrawable(R.drawable.ic_action_tick));
                }
                musicPlayer.mCreate(R.raw.bicycle);
                musicPlayer.mStart();

            }
        });
        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.mCreate(R.raw.ambulance);
                musicPlayer.mStart();

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
            int flag0 = 0;
            int flag1 = 0;
            int flag2 = 0;
            MyMusicPlayer musicPlayer = new MyMusicPlayer(getApplicationContext());

            @Override
            public void onClick(View v) {
                if (flag0 == 1 && flag1 == 1 && flag2 == 1) {
                    flag0 = 0;
                    flag1 = 0;
                    flag2 = 0;
                }

                int random = -1;
                if (flag0 == 0 && flag1 == 0 && flag2 == 0) {
                    random = randomNumber(3);
                } else if (flag0 == 1) {
                    random = randomNumber(3);
                    if (flag1 == 1)
                        random = 2;
                    else if (flag2 == 1)
                        random = 1;
                    if (random == 0 && (flag1 == 0 || flag2 == 0))
                        random = randomNumber(2);
                    if (random == 0)
                        random = 1;
                    else
                        random = 2;

                } else if (flag1 == 1) {

                    random = randomNumber(3);
                    if (flag0 == 1)
                        random = 2;
                    else if (flag2 == 1)
                        random = 0;
                    if (random == 1 && (flag2 == 0 || flag0 == 0)) {
                        random = randomNumber(2);
                        if (random != 0)
                            random = 2;
                    }


                } else if (flag2 == 1) {
                    random = randomNumber(3);
                    if (flag0 == 1)
                        random = 1;
                    else if (flag1 == 1)
                        random = 0;
                    if (random == 3 && (flag0 == 0 || flag1 == 0)) {
                        random = randomNumber(2);
                    }
                }
                switch (random) {
                    case 0:
                        test=1;
                        flag0 = 1;
                        Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();

                        musicPlayer.mCreate(R.raw.car);
                        musicPlayer.mStart();
                        break;
                    case 1:
                        test=2;
                        flag1 = 1;
                        musicPlayer.mCreate(R.raw.bicycle);
                        musicPlayer.mStart();
                        Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();

                        break;
                    case 2:
                        test=3;
                        flag2 = 1;
                        musicPlayer.mCreate(R.raw.ambulance);
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

    /**
     *
     * @param max
     * @return
     */
    private int randomNumber(int max) {

        int random_number = -1;
        try {
            random_number = (int) (Math.random() * max);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return random_number;
    }
}
