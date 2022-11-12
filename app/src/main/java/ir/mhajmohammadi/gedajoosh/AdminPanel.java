package ir.mhajmohammadi.gedajoosh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        Button btnSeason=findViewById(R.id.btnSeason1);
        btnSeason.setOnClickListener(view -> {
            Intent i=new Intent(view.getContext(),Season1.class);
            startActivity(i);
        });

        Button btnWebBrowser=findViewById(R.id.btnWebBrowser);
        btnWebBrowser.setOnClickListener(view -> {
            Intent i=new Intent(view.getContext(),WebBrowserActivity.class);
            startActivity(i);
        });
    }
}