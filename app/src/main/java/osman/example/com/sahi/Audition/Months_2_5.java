package osman.example.com.sahi.Audition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import osman.example.com.sahi.Audition.Word_length_2_5.WL_1;
import osman.example.com.sahi.R;

public class Months_2_5 extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months_2_5);
        button1= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),WL_1.class));
            }
        });

    }
}
