package com.example.gamekids;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Switch s21,s14,s13,s12,s11;
    TextView t,timer;
    ProgressBar pr;
    Button btn;
    ImageView v1,v2,v3,v4,v5;
    int scroe=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intSwitch();
        t=findViewById(R.id.textView3);
        timer=findViewById(R.id.textView4);
       final CountDownTimer cu=  new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("00 :" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Intent nt=new Intent(Main2Activity.this,Main4Activity.class);
                nt.putExtra("Score",""+scroe);
                nt.putExtra("stage","3");
                startActivity(nt);
            }
        }.start();
        btn=findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nt=new Intent(Main2Activity.this,Main4Activity.class);
                nt.putExtra("Score"," "+scroe);
                startActivity(nt);
                cu.cancel();
            }
        });

        pr=findViewById(R.id.progressBar3);
        v3=findViewById(R.id.imageView4);

        s21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=19;
                    v3.setVisibility(View.VISIBLE);

                }else {
                    scroe+=19;
                    v3.setVisibility(View.INVISIBLE);

                }
                pr.setProgress(scroe);
                textcolor();
            }

        });
        v2=findViewById(R.id.imageView5);
        s14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=18;
                    v2.setVisibility(View.VISIBLE);

                }else {
                    scroe+=18;
                    v3.setVisibility(View.INVISIBLE);
                }
                pr.setProgress(scroe);
                textcolor();
            }

        });
        v1=findViewById(R.id.imageView3);
        s13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=22;
                    v1.setVisibility(View.VISIBLE);
                }else {
                    scroe+=22;
                    v1.setVisibility(View.INVISIBLE);
                }
                pr.setProgress(scroe);
                textcolor();

            }

        });
        v4=findViewById(R.id.imageView7);
        s12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=32;
                    v4.setVisibility(View.VISIBLE);

                }else {
                    scroe+=32;
                    v4.setVisibility(View.INVISIBLE);

                }
                pr.setProgress(scroe);
                textcolor();
            }

        });
        v5=findViewById(R.id.imageView6);

        s11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=9;
                    v5.setVisibility(View.VISIBLE);

                }else {
                    scroe+=9;
                    v5.setVisibility(View.VISIBLE);

                }
                pr.setProgress(scroe);
                textcolor();
            }

        });

    }
    private void textcolor() {
        if(scroe<80){
            t.setTextColor(Color.parseColor("#2d5b1a"));
        }
        else if(scroe<60){
            t.setTextColor(Color.parseColor("#474a15"));
        }
        else if(scroe<40){
            t.setTextColor(Color.parseColor("#5d471b"));
        }
        else if(scroe<20){
            t.setTextColor(Color.parseColor("#64251d"));
        }
        t.setText(""+scroe);
    }
    private void intSwitch() {
        s21=findViewById(R.id.switch21);
        s14=findViewById(R.id.switch14);
        s13=findViewById(R.id.switch13);
        s12=findViewById(R.id.switch12);
        s11=findViewById(R.id.switch11);
    }
}
