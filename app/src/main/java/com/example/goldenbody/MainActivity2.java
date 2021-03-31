package com.example.goldenbody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    ImageView img_run, img_workout, profile_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img_run = (ImageView) findViewById(R.id.img_run);
        img_workout = (ImageView) findViewById(R.id.img_workout);
        profile_logo = (ImageView) findViewById(R.id.profile_logo);

        img_run.setOnClickListener(this);
        img_workout.setOnClickListener(this);
        profile_logo.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_run:
                startActivity(new Intent(this,RunActivity.class));
                break;
            case R.id.img_workout:
                startActivity(new Intent(this,WorkoutActivity.class));
                break;
            case R.id.profile_logo:
                startActivity(new Intent(this, ProfileActivity.class));
                break;

        }
}
}