package com.example.gamekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {
Button btn;
//MediaPlayer pl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btn=findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nt=new Intent(Main6Activity.this,Main7Activity.class);
                nt.putExtra("stage","1");
                startActivity(nt);
            }
        });
//     pl=MediaPlayer.create(Main6Activity.this,R.drawable.play);
//     pl.start();
    }
}
