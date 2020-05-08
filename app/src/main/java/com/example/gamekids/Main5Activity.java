package com.example.gamekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btn1=(Button)findViewById(R.id.button33);
        btn2=(Button)findViewById(R.id.button43);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass=getIntent().getStringExtra("pass");
                String stage=getIntent().getStringExtra("stage");
                if (stage.equals("1")){
                    if (pass.equals("1")){
                        Intent nt=new Intent(Main5Activity.this,MainActivity.class);
                        nt.putExtra("pass",pass);
                        nt.putExtra("stage","2");
                        startActivity(nt);
                    }else{
                        Intent nt=new Intent(Main5Activity.this,Main3Activity.class);
                        nt.putExtra("pass",pass);
                        nt.putExtra("stage","1");
                        startActivity(nt);
                    }
                }else if(stage.equals("2")){
                    if (pass.equals("1")){
                        Intent nt=new Intent(Main5Activity.this,Main2Activity.class);
                        nt.putExtra("pass",pass);
                        nt.putExtra("stage","3");
                        startActivity(nt);
                    }else{
                        Intent nt=new Intent(Main5Activity.this,MainActivity.class);
                        nt.putExtra("pass",pass);
                        nt.putExtra("stage","2");
                        startActivity(nt);
                    }

                }else if(stage.equals("3")){
//                    if (pass.equals("1")){
                        Intent nt=new Intent(Main5Activity.this,Main3Activity.class);
                        nt.putExtra("pass",""+pass);
                        nt.putExtra("stage","3");
                        startActivity(nt);
//                    }else{
//                        Intent nt=new Intent(Main5Activity.this,Main3Activity.class);
//                        nt.putExtra("pass",""+pass);
//                        nt.putExtra("stage","3");
//                        startActivity(nt);
//                    }
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            String pass=getIntent().getStringExtra("pass");
            String stage=getIntent().getStringExtra("stage");
            @Override
            public void onClick(View view) {
                Intent nt=new Intent(Main5Activity.this,Main7Activity.class);
                if (stage.equals("1")){
                    if (pass.equals("1")){
                        nt.putExtra("stage","2");
                    }
                    else{
                        nt.putExtra("stage","1");
                    }
                }else if (stage.equals("2")){
                    if (pass.equals("1")){
                        nt.putExtra("stage","3");
                    }
                    else{
                        nt.putExtra("stage","2");
                    }
                }else if (stage.equals("3")){
//                    if (pass.equals("1")){
                        nt.putExtra("stage","3");
//                    }
//                    else{
//                        nt.putExtra("stage","3");
//                    }
                }

                startActivity(nt);
            }
        });
    }
}
