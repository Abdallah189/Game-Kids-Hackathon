package com.example.gamekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class Main4Activity<string> extends AppCompatActivity {
TextView t;
RatingBar rt;
String pass="0";
String stage;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        String score=getIntent().getStringExtra("Score");
        btn=findViewById(R.id.button50);
        t=findViewById(R.id.textView5);
        t.setText(score);
        float sv=Float.parseFloat(score)*5/100;
        rt=(RatingBar)findViewById(R.id.ratingBar);
        rt.setNumStars(5);
        rt.setRating(sv);
        rt.setEnabled(false);
        stage=getIntent().getStringExtra("stage");
        if(sv>=2.75 && sv<=3.5){
            pass="1";
        }

//        new CountDownTimer(7000, 1000) {
//
//            public void onTick(long millisUntilFinished) {
//
//            }
//
//            public void onFinish() {
//                Intent nt=new Intent(Main4Activity.this,Main5Activity.class);
//                nt.putExtra("pass",pass);
//                nt.putExtra("stage",stage);
//                startActivity(nt);}
//        }.start();

                btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nt=new Intent(Main4Activity.this,Main5Activity.class);
                nt.putExtra("pass",pass);
                nt.putExtra("stage",stage);
                startActivity(nt);
            }
        });




       /* rt.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                t.setText(" :"+v);
            }
        });*/
     //   rt.setRating(3);
    }
}
