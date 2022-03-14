package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button b1;
    Button b2;
    Button b3;
    int lsize,rsize,color_c,bgcolor_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.txtview);
        b1 = (Button) findViewById(R.id.bt1);
        b2 = (Button) findViewById(R.id.bt2);
        b3 = (Button) findViewById(R.id.bt3);
        lsize = 30;
        color_c = 0;
        bgcolor_c = 0;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lsize <= 50)
                    lsize += 5;
                else
                    lsize = 30;
                txt.setTextSize(lsize);



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color_c++;
                if (color_c == 1)
                {
                    txt.setTextColor(Color.RED);
                }
                else if(color_c == 2)
                {
                    txt.setTextColor(Color.GREEN);
                }
                else if(color_c == 3)
                {
                    txt.setTextColor(Color.CYAN);
                }
                else
                {
                    color_c = 0;
                    txt.setTextColor(Color.BLUE);

                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bgcolor_c++;
                if (bgcolor_c == 1)
                {
                    txt.setBackgroundColor(Color.RED);
                }
                else if(bgcolor_c == 2)
                {
                    txt.setBackgroundColor(Color.GREEN);
                }
                else if(bgcolor_c == 3)
                {
                    txt.setBackgroundColor(Color.CYAN);
                }
                else
                {
                    bgcolor_c = 0;
                    txt.setBackgroundColor(Color.WHITE);

                }
            }
        });


    }
}