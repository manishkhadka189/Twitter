package com.tweet.twitter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView twLogin;
    Button createUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        //   getSupportActionBar().hide(); //hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enables fullscreen
        setContentView(R.layout.activity_main2);
        twLogin = findViewById( R.id.twLogin );
        createUser = findViewById( R.id.createUser );
        twLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login= new Intent( MainActivity.this, LoginActivity.class );
                startActivity( login );
            }
        } );
        createUser.setOnClickListener( new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               Intent signUP= new Intent( MainActivity.this, SignUp.class );
                                               startActivity( signUP );
                                           }
                                       }
        );
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finishAffinity();

    }
}

