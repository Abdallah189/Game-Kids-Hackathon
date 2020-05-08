package com.example.gamekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  Switch s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
  TextView t,timer;
  ProgressBar pr;
  Button btn;
  int scroe=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intSwitch();
        t=findViewById(R.id.textView);
        timer=findViewById(R.id.textView9);
        btn=findViewById(R.id.button11);
        final CountDownTimer counn= new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("00 :" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Intent nt=new Intent(MainActivity.this,Main4Activity.class);
                nt.putExtra("Score"," "+scroe);
                nt.putExtra("stage","2");
                startActivity(nt);
            }
        }.start();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nt=new Intent(MainActivity.this,Main4Activity.class);
                nt.putExtra("Score"," "+scroe);
                nt.putExtra("stage","2");
                startActivity(nt);
                counn.cancel();
            }
        });

        pr=findViewById(R.id.progressBar);
        t.setTextColor(Color.parseColor("#2d5b1a"));
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                  scroe-=10;
                }else {
                    scroe+=10;
                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
        s2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=10;
                }else {
                    scroe+=10;
                }
                textcolor();
                pr.setProgress(scroe);

            }
        });
        s3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=10;
                }else {
                    scroe+=10;
                }
                textcolor();
                pr.setProgress(scroe);

            }
        });
        s4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=10;
                }else {
                    scroe+=10;
                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
        s5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=10;
                }else {
                    scroe+=10;
                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
        s6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=10;
                }else {
                    scroe+=10;
                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
        s7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=10;
                }else {
                    scroe+=10;
                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
        s8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=10;
                }else {
                    scroe+=10;
                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
        s9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=10;
                }else {
                    scroe+=10;
                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
        s10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    scroe-=10;
                }else {
                    scroe+=10;
                }
                pr.setProgress(scroe);
                textcolor();
            }
        });
      //  Toast.makeText(this,"test :"+s1.isChecked(),Toast.LENGTH_LONG).show();
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
        s1=findViewById(R.id.switch1);
        s2=findViewById(R.id.switch2);
        s3=findViewById(R.id.switch3);
        s4=findViewById(R.id.switch4);
        s5=findViewById(R.id.switch5);
        s6=findViewById(R.id.switch6);
        s7=findViewById(R.id.switch7);
        s8=findViewById(R.id.switch8);
        s9=findViewById(R.id.switch9);
        s10=findViewById(R.id.switch10);
    }
}
