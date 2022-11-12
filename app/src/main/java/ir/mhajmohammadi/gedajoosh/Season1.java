package ir.mhajmohammadi.gedajoosh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Season1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season1);

        LinearLayout linearSeason=findViewById(R.id.linearSeasons);

        Button btnSpring=findViewById(R.id.btnSpring);
        btnSpring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linearSeason.setBackgroundResource(R.drawable.spring);

            }
        });

        Button btnSummer=findViewById(R.id.btnSummer);
        btnSummer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linearSeason.setBackgroundResource(R.drawable.summer);

            }
        });

        Button btnFall=findViewById(R.id.btnFall);
        btnFall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linearSeason.setBackgroundResource(R.drawable.fall);

            }
        });

        Button btnWinter=findViewById(R.id.btnWinter);
        btnWinter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linearSeason.setBackgroundResource(R.drawable.winter);

            }
        });
    }
}