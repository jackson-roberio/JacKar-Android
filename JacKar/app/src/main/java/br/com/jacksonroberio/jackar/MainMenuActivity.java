package br.com.jacksonroberio.jackar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Tela, pós load Splash, exibida alguns menus e através dela também é possível ir pra activity do jogo.
 *
 * @author Jackson Roberio
 **/
public class MainMenuActivity extends AppCompatActivity {

    private static final String URL_POLITICA_PRIVACIDADE = "https://jackar.jacksonroberio.com.br/politica-de-privacidade";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button playButton = findViewById(R.id.playButton);
        Button creditsButton = findViewById(R.id.creditsButton);
        Button politicaPrivacidadeButton = findViewById(R.id.politicaPrivacidadeButton);

        final Intent playIntent = new Intent(MainMenuActivity.this, JacKar.class);
        playButton.setOnClickListener(view -> view.getContext().startActivity(playIntent));

        final Intent creditsIntent = new Intent(MainMenuActivity.this, CreditsActivity.class);
        creditsButton.setOnClickListener(view -> view.getContext().startActivity(creditsIntent));

        final Intent politicaPrivacidadeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL_POLITICA_PRIVACIDADE));
        politicaPrivacidadeButton.setOnClickListener(view -> view.getContext().startActivity(politicaPrivacidadeIntent));
    }
}
