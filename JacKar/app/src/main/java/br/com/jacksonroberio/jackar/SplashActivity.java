package br.com.jacksonroberio.jackar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handle = new Handler();
        handle.postDelayed(getRunnable(), 1700);
    }


    private Runnable getRunnable(){
        return new Runnable() {
            @Override public void run() {
                irTelaPrincipal();
            }
        };
    }

    private void irTelaPrincipal() {
        Intent intent = new Intent(SplashActivity.this, MainMenuActivity.class);
        startActivity(intent);
        finish();
    }
}