package osman.example.com.sahi.Audition.Word_length_2_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import osman.example.com.sahi.R;

public class WL_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wl_10);
    }

    @Override
    public void finish() {
        super.finish();
        setContentView(R.layout.activity_audition);
    }
}
