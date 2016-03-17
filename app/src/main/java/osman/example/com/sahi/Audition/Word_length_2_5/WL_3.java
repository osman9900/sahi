package osman.example.com.sahi.Audition.Word_length_2_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import osman.example.com.sahi.R;

public class WL_3 extends AppCompatActivity {
    ImageView book;
    ImageView bottle;
    ImageView umbrella;
    Button next_button;
    Button identify_image_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wl_3);
        book = (ImageView) findViewById(R.id.imageView2);
        bottle = (ImageView) findViewById(R.id.imageView3);
        umbrella = (ImageView) findViewById(R.id.imageView4);
        next_button= (Button) findViewById(R.id.next);
        final MyMusicPlayer musicPlayer = new MyMusicPlayer(getApplicationContext());
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.mCreate(R.raw.book);
                musicPlayer.mStart();
            }
        });
        bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.mCreate(R.raw.bottle);
                musicPlayer.mStart();
            }
        });
        umbrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.mCreate(R.raw.umbrella);
                musicPlayer.mStart();
            }
        });
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), WL_4.class));
            }
        });
    }
}
