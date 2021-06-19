package com.example.animtion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imglogo, imgProfile;
    TextView txShared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imglogo = findViewById(R.id.logo);
        imgProfile = findViewById(R.id.profile);
        txShared = findViewById(R.id.title);
    }
    public void checkRippleAnimation(View view){
        Intent intent = new Intent(this,RippleActivity.class);
        startActivity(intent);
    }


    public void sharedElementTransition(View view) {
        //trasionname is pair
        Pair[] pair = new Pair[3];
        pair[0] = new Pair<View,String>(imglogo,"smartherd_shared");
        pair[1] = new Pair<View,String>(txShared,"logo_shared");
        pair[2] = new Pair<View,String>(imgProfile,"profile_pic_shared");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,pair);
        Intent i= new Intent(MainActivity.this,SharedElementActivity.class);
        startActivity(i,options.toBundle());


    }

}