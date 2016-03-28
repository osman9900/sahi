package osman.example.com.sahi.Audition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import osman.example.com.sahi.Audition.Word_length_2_5.WordLengthActivity;
import osman.example.com.sahi.R;

public class Months_2_5 extends AppCompatActivity {
    Button wordLength;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months_2_5);
        wordLength = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        final Intent intent = new Intent(getApplicationContext(), WordLengthActivity.class);
        intent.putExtra("ActivityNumber", 1);

        wordLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
