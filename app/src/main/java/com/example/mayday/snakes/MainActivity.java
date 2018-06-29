package com.example.mayday.snakes;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int myDices[]={
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six
    };


    public void rollTapped(View view){
        Log.i("Button","Button tapped");

        Random ran=new Random();
        int randomNumber=ran.nextInt(8-2)+1;
        Log.i("Random","Random number is "+randomNumber);

        ImageView dice=(ImageView)findViewById(R.id.dice);
        dice.setImageResource(myDices[(randomNumber-1)]);

        Toast.makeText(getApplicationContext(),"Number is "+randomNumber,Toast.LENGTH_SHORT).show();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       

    }
}
