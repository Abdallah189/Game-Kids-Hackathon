package com.example.gamekids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {
ConstraintLayout con;
Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        con=findViewById(R.id.cont);
        btn1=findViewById(R.id.button7);
        btn2=findViewById(R.id.button6);
        btn3=findViewById(R.id.button8);
        String stage=getIntent().getStringExtra("stage");
        if (stage.equals("1")){
            con.setBackgroundResource(R.drawable.ic_stage1);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
        }else if (stage.equals("2")){
            con.setBackgroundResource(R.drawable.ic_stage_2);
            btn2.setEnabled(true);
            btn3.setEnabled(false);
        }else if (stage.equals("3")){
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            con.setBackgroundResource(R.drawable.ic_stage_3);
        }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nt=new Intent(Main7Activity.this,Main3Activity.class);
                nt.putExtra("pass","1");
                nt.putExtra("stage","1");
                startActivity(nt);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nt=new Intent(Main7Activity.this,MainActivity.class);
                nt.putExtra("pass","2");
                nt.putExtra("stage","2");
                startActivity(nt);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nt=new Intent(Main7Activity.this,Main2Activity.class);
                nt.putExtra("pass","2");
                nt.putExtra("stage","2");
                startActivity(nt);
            }
        });
    }
}
