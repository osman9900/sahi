package osman.example.com.sahi.Audition.Word_length_2_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import osman.example.com.sahi.R;

public class WL_2 extends AppCompatActivity {
    ImageView brush;
    ImageView towel;
    ImageView comb;
    Button next_button;
//    Button identify_image_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wl_2);
        brush = (ImageView) findViewById(R.id.imageView1);
        towel = (ImageView) findViewById(R.id.imageView2);
        comb = (ImageView) findViewById(R.id.imageView3);
        next_button= (Button) findViewById(R.id.next);
        final MyMusicPlayer musicPlayer = new MyMusicPlayer(getApplicationContext());
        brush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.mCreate(R.raw.brush);
                musicPlayer.mStart();
            }
        });
        towel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.mCreate(R.raw.towel);
                musicPlayer.mStart();
            }
        });
        comb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.mCreate(R.raw.comb);
                musicPlayer.mStart();
            }
        });
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),WL_3.class));
            }
        });
    }
}
