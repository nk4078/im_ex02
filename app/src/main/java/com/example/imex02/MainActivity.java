package com.example.imex02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iV1;
    ImageButton iM1;
    int num;
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iV1 = (ImageView) findViewById(R.id.iV1);
        iM1 = (ImageButton) findViewById(R.id.iM1);
    }

    public void clicked(View view) {
        num = rand.nextInt(3)+1;
        if (num==1){
            iV1.setImageResource(R.drawable.img_1);
            iM1.setImageResource(R.drawable.num1);
        }

        if(num==2){
            iV1.setImageResource(R.drawable.img_2);
            iM1.setImageResource(R.drawable.num2);
        }
        if(num==3){
            iV1.setImageResource(R.drawable.img_3);
            iM1.setImageResource(R.drawable.num3);
        }
    }
}