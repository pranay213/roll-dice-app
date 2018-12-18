package com.example.pranay.rolldice;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    Button roll;

    Random random=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.iv);

        roll=findViewById(R.id.button);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Roll();

                Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.anim);

                iv.startAnimation(animation);


            }
        });

    }
    public void Roll()
    {


        int rg= random.nextInt(6)+1;
         switch (rg)

        {



            case 1:
                iv.setImageResource(R.drawable.one);






                break;
            case 2:

                iv.setImageResource(R.drawable.two);


                break;
            case 3:

                iv.setImageResource(R.drawable.three);


                break;
            case 4:

                iv.setImageResource(R.drawable.four);



            case 5:

                iv.setImageResource(R.drawable.five);



            case 6:
                iv.setImageResource(R.drawable.six);



                break;

        }
    }
}
