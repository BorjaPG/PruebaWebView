package com.bp.pruebawebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se declara el componente WebView.
        WebView webView = (WebView) findViewById(R.id.webview);
        //Permite acceder a los ajustes.
        WebSettings settings = webView.getSettings();
        //ZoomControls hace visibles los controles para hacer zoom.
        settings.setBuiltInZoomControls(true);
        //Permite la ejecución de JavaScript.
        settings.setJavaScriptEnabled(true);
        //Se emplea loadUrl para cargar la dirección web.
        webView.loadUrl("http://www.google.com");
    }

    /* Permite gestionar el botón atrás para volver a la página anterior. */

    /*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if((keyCode == KeyEvent.KEYCODE_BACK) && (webView.canGoBack())){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }*/
}
