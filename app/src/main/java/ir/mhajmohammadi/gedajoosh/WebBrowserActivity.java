package ir.mhajmohammadi.gedajoosh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WebBrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);

        Button btnGoToAddress=findViewById(R.id.btnGoToBrowser);
        EditText txtAddress=findViewById(R.id.txtAddress);

        btnGoToAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stAddress="https://"+txtAddress.getText().toString();
                Toast.makeText(getApplicationContext(), stAddress,Toast.LENGTH_SHORT).show();

                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(stAddress));
                startActivity(i);
            }
        });
    }
}