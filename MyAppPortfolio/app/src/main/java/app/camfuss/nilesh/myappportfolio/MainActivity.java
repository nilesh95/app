package app.camfuss.nilesh.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button sportify,score,library,bigger,xyz,capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sportify= (Button) findViewById(R.id.sportify);
        score= (Button) findViewById(R.id.sports);
        library= (Button) findViewById(R.id.library);
        bigger= (Button) findViewById(R.id.built);
        xyz= (Button) findViewById(R.id.xyz);
        capstone= (Button) findViewById(R.id.capstone);
        sportify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Sportify App!",Toast.LENGTH_SHORT).show();
            }
        });
        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Scores App!",Toast.LENGTH_SHORT).show();
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Library App!",Toast.LENGTH_SHORT).show();
            }
        });
        bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Build it Bigger App!",Toast.LENGTH_SHORT).show();
            }
        });
        xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my XYZ Reader App!",Toast.LENGTH_SHORT).show();
            }
        });
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This button will launch my Capstone App!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
