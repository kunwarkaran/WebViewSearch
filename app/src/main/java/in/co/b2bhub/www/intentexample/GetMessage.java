package in.co.b2bhub.www.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by B2B Android on 3/29/2017.
 */

public class GetMessage extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getmessage);
        webview=(WebView)findViewById(R.id.web_view);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.KARAN);
        String url = "https://www.google.com/search?q="+message;
        webview.loadUrl(url);
        WebViewClient webViewClient=new WebViewClient();
        webview.setWebViewClient(webViewClient);
        webview.getSettings().setJavaScriptEnabled(true);

}
}
