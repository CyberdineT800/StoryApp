package com.example.hikoyalar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        sharedPreferences = getSharedPreferences("Naveen", MODE_PRIVATE);

        final int loginState = sharedPreferences.getInt("LoginState", 0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (loginState == 0) {
                    // If the login state is 0, navigate to the LoginActivity
                    Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                    startActivity(intent);
                } else {
                    // If the login state is not 0 (assuming it's 1), navigate to the MainActivity
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                }
                // Close the SplashScreen activity
                finish();
            }
        }, 3000); // 3000 milliseconds delay (3 seconds)
    }
}
