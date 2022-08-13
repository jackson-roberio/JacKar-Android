package br.com.jacksonroberio.jackar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint("SetJavaScriptEnabled")
public class JacKar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_jackar);
        WebView jogo = (WebView) findViewById(R.id.webview_jogo);

        jogo.getSettings().setJavaScriptEnabled(true);

        jogo.setWebViewClient(new WebViewClient());

        jogo.loadUrl("https://jacksonroberio.com.br/jackar/mobile/android/");
    }
}