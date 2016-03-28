package osman.example.com.sahi.Audition.Word_length_2_5;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import osman.example.com.sahi.R;

/**
 * Created by osman on 3/25/2016.
 */
public class SetLayoutContent {
    Activity activity;

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    TextView textView1;
    TextView textView2;
    TextView textView3;

    ImageView tickAction1;
    ImageView tickAction2;
    ImageView tickAction3;


    private int imageResId[] = new int[4];
    private int textResId[] = new int[4];


    SetLayoutContent(Activity activity) {
        this.activity = activity;

        imageView1 = (ImageView) activity.findViewById(R.id.imageView1);
        imageView2 = (ImageView) activity.findViewById(R.id.imageView2);
        imageView3 = (ImageView) activity.findViewById(R.id.imageView3);

        textView1 = (TextView) activity.findViewById(R.id.textView1);
        textView2 = (TextView) activity.findViewById(R.id.textView2);
        textView3 = (TextView) activity.findViewById(R.id.textView3);

        tickAction1 = (ImageView) activity.findViewById(R.id.action_tick_1);
        tickAction2 = (ImageView) activity.findViewById(R.id.action_tick_2);
        tickAction3 = (ImageView) activity.findViewById(R.id.action_tick_3);

    }

    public void setLayoutContent(int activityNumber) {
        tickAction1.setVisibility(View.INVISIBLE);
        tickAction2.setVisibility(View.INVISIBLE);
        tickAction3.setVisibility(View.INVISIBLE);
        switch (activityNumber) {
            case 1:
                imageResId[1] = R.drawable.car;
                imageResId[2] = R.drawable.bicycle;
                imageResId[3] = R.drawable.ambulance;
                setImage(imageResId);
                textResId[1] = R.string.car;
                textResId[2] = R.string.bicycle;
                textResId[3] = R.string.ambulance;
                setTextView(textResId);
                break;
            case 2:
                imageResId[1] = R.drawable.brush;
                imageResId[2] = R.drawable.towel;
                imageResId[3] = R.drawable.comb;
                setImage(imageResId);
                textResId[1] = R.string.brush;
                textResId[2] = R.string.towel;
                textResId[3] = R.string.comb;
                setTextView(textResId);
                break;
            case 3:
                imageResId[1] = R.drawable.book;
                imageResId[2] = R.drawable.bottle;
                imageResId[3] = R.drawable.umbrella;
                setImage(imageResId);
                textResId[1] = R.string.book;
                textResId[2] = R.string.bottle;
                textResId[3] = R.string.umbrella;
                setTextView(textResId);
                break;
            case 4:
                imageResId[1] = R.drawable.fan;
                imageResId[2] = R.drawable.remote;
                imageResId[3] = R.drawable.computer;
                setImage(imageResId);
                textResId[1] = R.string.fan;
                textResId[2] = R.string.remote;
                textResId[3] = R.string.computer;
                setTextView(textResId);
                break;
            case 5:
                imageResId[1] = R.drawable.light;
                imageResId[2] = R.drawable.tv;
                imageResId[3] = R.drawable.cylinder;
                setImage(imageResId);
                textResId[1] = R.string.light;
                textResId[2] = R.string.tv;
                textResId[3] = R.string.cylinder;
                setTextView(textResId);
                break;
            case 6:
                imageResId[1] = R.drawable.sun;
                imageResId[2] = R.drawable.lock;
                imageResId[3] = R.drawable.giraffe;
                setImage(imageResId);
                textResId[1] = R.string.sun;
                textResId[2] = R.string.lock;
                textResId[3] = R.string.giraffe;
                setTextView(textResId);
                break;
            case 7:
                imageResId[1] = R.drawable.cup;
                imageResId[2] = R.drawable.candle;
                imageResId[3] = R.drawable.cheetah;
                setImage(imageResId);
                textResId[1] = R.string.cup;
                textResId[2] = R.string.candle;
                textResId[3] = R.string.cheetah;
                setTextView(textResId);
                break;
            case 8:
                imageResId[1] = R.drawable.ball;
                imageResId[2] = R.drawable.cooker;
                imageResId[3] = R.drawable.pustakam;
                setImage(imageResId);
                textResId[1] = R.string.ball;
                textResId[2] = R.string.cooker;
                textResId[3] = R.string.pustakam;
                setTextView(textResId);
                break;
            case 9:
                imageResId[1] = R.drawable.kite;
                imageResId[2] = R.drawable.frog;
                imageResId[3] = R.drawable.cylinder;
                setImage(imageResId);
                textResId[1] = R.string.kite;
                textResId[2] = R.string.frog;
                textResId[3] = R.string.cylinder;
                setTextView(textResId);
                break;
            case 10:
                imageResId[1] = R.drawable.bag;
                imageResId[2] = R.drawable.auto;
                imageResId[3] = R.drawable.aeroplane;
                setImage(imageResId);
                textResId[1] = R.string.bag;
                textResId[2] = R.string.auto;
                textResId[3] = R.string.aeroplane;
                setTextView(textResId);
                break;
            case 11:
                imageResId[1] = R.drawable.bell;
                imageResId[2] = R.drawable.calender;
                imageResId[3] = R.drawable.ticket;
                setImage(imageResId);
                textResId[1] = R.string.bell;
                textResId[2] = R.string.calender;
                textResId[3] = R.string.ticket;
                setTextView(textResId);
                break;
            case 12:
                imageResId[1] = R.drawable.pen;
                imageResId[2] = R.drawable.pencil;
                imageResId[3] = R.drawable.papaya;
                setImage(imageResId);
                textResId[1] = R.string.pen;
                textResId[2] = R.string.pencil;
                textResId[3] = R.string.papaya;
                setTextView(textResId);
                break;
            case 13:
                imageResId[1] = R.drawable.jam;
                imageResId[2] = R.drawable.vada;
                imageResId[3] = R.drawable.umbrella;
                setImage(imageResId);
                textResId[1] = R.string.jam;
                textResId[2] = R.string.vada;
                textResId[3] = R.string.samosa;
                setTextView(textResId);
                break;
            case 14:
                imageResId[1] = R.drawable.bread;
                imageResId[2] = R.drawable.puri;
                imageResId[3] = R.drawable.chapati;
                setImage(imageResId);
                textResId[1] = R.string.bread;
                textResId[2] = R.string.puri;
                textResId[3] = R.string.chapati;
                setTextView(textResId);
                break;
            case 15:
                imageResId[1] = R.drawable.cake;
                imageResId[2] = R.drawable.potato;
                imageResId[3] = R.drawable.tomato;
                setImage(imageResId);
                textResId[1] = R.string.cake;
                textResId[2] = R.string.potato;
                textResId[3] = R.string.tomato;
                setTextView(textResId);
                break;
            case 16:
                imageResId[1] = R.drawable.kheer;
                imageResId[2] = R.drawable.dosa;
                imageResId[3] = R.drawable.biscuits;
                setImage(imageResId);
                textResId[1] = R.string.kheer;
                textResId[2] = R.string.dosa;
                textResId[3] = R.string.biscuits;
                setTextView(textResId);
                break;
            case 17:
                imageResId[1] = R.drawable.gun;
                imageResId[2] = R.drawable.rice;
                imageResId[3] = R.drawable.mirror;
                setImage(imageResId);
                textResId[1] = R.string.gun;
                textResId[2] = R.string.rice;
                textResId[3] = R.string.mirror;
                setTextView(textResId);
                break;
            case 18:
                imageResId[1] = R.drawable.coat;
                imageResId[2] = R.drawable.curry;
                imageResId[3] = R.drawable.rasamu;
                setImage(imageResId);
                textResId[1] = R.string.coat;
                textResId[2] = R.string.curry;
                textResId[3] = R.string.rasamu;
                setTextView(textResId);
                break;
            case 19:
                imageResId[1] = R.drawable.bed;
                imageResId[2] = R.drawable.bottle;
                imageResId[3] = R.drawable.blanket;
                setImage(imageResId);
                textResId[1] = R.string.bed;
                textResId[2] = R.string.raggu;
                textResId[3] = R.string.blanket;
                setTextView(textResId);
                break;
            case 20:
                imageResId[1] = R.drawable.key;
                imageResId[2] = R.drawable.bottle;
                imageResId[3] = R.drawable.slippers;
                setImage(imageResId);
                textResId[1] = R.string.key;
                textResId[2] = R.string.cap;
                textResId[3] = R.string.slippers;
                setTextView(textResId);
                break;

        }
    }

    private void setTextView(int[] textResId) {
        textView1.setText(textResId[1]);
        textView2.setText(textResId[2]);
        textView3.setText(textResId[3]);
    }

    private void setImage(int[] imageResId) {
        imageView1.setImageResource(imageResId[1]);
        imageView2.setImageResource(imageResId[2]);
        imageView3.setImageResource(imageResId[3]);
    }

}
