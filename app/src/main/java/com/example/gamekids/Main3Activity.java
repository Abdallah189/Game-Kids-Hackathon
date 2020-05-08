package com.example.gamekids;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    Switch s12,s22,s32,s42,s52,s62;
    ImageView v1,v2,v3,v4,v5,v6;
    TextView t,timer,v11,v12,v13,v14,v15,v16;
    ProgressBar pr;
    Button btn;
    int scroe=100;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        intSwitch();
        t=findViewById(R.id.textView2);
        timer=findViewById(R.id.textView10);

       final CountDownTimer coun= new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("00 :" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Intent nt=new Intent(Main3Activity.this,Main4Activity.class);
                nt.putExtra("Score"," "+scroe);
                nt.putExtra("stage","1");
                startActivity(nt);
            }
        }.start();
        btn=findViewById(R.id.button9);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nt=new Intent(Main3Activity.this,Main4Activity.class);
                nt.putExtra("Score"," "+scroe);
                nt.putExtra("stage","1");
                startActivity(nt);
                coun.cancel();
            }
        });

        pr=findViewById(R.id.progressBar2);
       // btn=findViewById(R.id.button);
        v1=findViewById(R.id.imageView14);
        v11=findViewById(R.id.textView14);
        s12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=32;
                    v1.setVisibility(View.VISIBLE);
                    v11.setVisibility(View.VISIBLE);

                }else {
                    scroe+=32;
                    v1.setVisibility(View.INVISIBLE);
                    v11.setVisibility(View.INVISIBLE);

                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
        v2=findViewById(R.id.imageView12);
        v12=findViewById(R.id.textView16);
        s22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=16;
                    v2.setVisibility(View.VISIBLE);
                    v11.setVisibility(View.VISIBLE);
                }else {
                    scroe+=16;
                    v2.setVisibility(View.INVISIBLE);
                    v11.setVisibility(View.INVISIBLE);

                }
                pr.setProgress(scroe);
                textcolor();
            }

        });
        v3=findViewById(R.id.imageView15);
        v13=findViewById(R.id.textView15);
        s32.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=11;
                    v3.setVisibility(View.VISIBLE);
                    v13.setVisibility(View.VISIBLE);

                }else {
                    scroe+=11;
                    v3.setVisibility(View.INVISIBLE);
                    v13.setVisibility(View.INVISIBLE);

                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
        v4=findViewById(R.id.imageView18);
        v14=findViewById(R.id.textView8);
        s42.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=13;
                    v4.setVisibility(View.VISIBLE);
                    v14.setVisibility(View.VISIBLE);
                }else {
                    scroe+=13;
                    v4.setVisibility(View.INVISIBLE);
                    v14.setVisibility(View.INVISIBLE);

                }
                pr.setProgress(scroe);
                textcolor();
            }

        });
        v5=findViewById(R.id.imageView16);
        v15=findViewById(R.id.textView18);
        s52.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=9;
                    v5.setVisibility(View.VISIBLE);
                    v15.setVisibility(View.VISIBLE);

                }else {
                    scroe+=9;
                    v5.setVisibility(View.INVISIBLE);
                    v15.setVisibility(View.INVISIBLE);

                }
                pr.setProgress(scroe);
                textcolor();
            }

        });
        v6=findViewById(R.id.imageView17);
        v16=findViewById(R.id.textView17);
        s62.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=19;
                    v6.setVisibility(View.VISIBLE);
                    v16.setVisibility(View.VISIBLE);
                }else {
                    scroe+=19;
                    v6.setVisibility(View.INVISIBLE);
                    v16.setVisibility(View.INVISIBLE);

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
        s12=findViewById(R.id.switch15);
        s22=findViewById(R.id.switch16);
        s32=findViewById(R.id.switch17);
        s42=findViewById(R.id.switch18);
        s52=findViewById(R.id.switch19);
        s62=findViewById(R.id.switch20);
    }

}
