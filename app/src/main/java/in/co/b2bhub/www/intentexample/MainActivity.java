package in.co.b2bhub.www.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String KARAN="I AM THE BEST";
    TextView edt_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_txt=(TextView)findViewById(R.id.edt_txt);
    }
    public void sendMessage(View view){
        String message=edt_txt.getText().toString();
        Intent intent=new Intent(getApplicationContext(),GetMessage.class);
        intent.putExtra(KARAN,message);
        startActivity(intent);
    }

}
