package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Integer so1=0,so2=0;
    Character dau=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        final EditText ed1=(EditText) findViewById(R.id.ed1);
        Button btn0=(Button) findViewById(R.id.btn0);
        Button btn1=(Button) findViewById(R.id.btn1);
        Button btn2=(Button) findViewById(R.id.btn2);
        Button btn3=(Button) findViewById(R.id.btn3);
        Button btn4=(Button) findViewById(R.id.btn4);
        Button btn5=(Button) findViewById(R.id.btn5);
        Button btn6=(Button) findViewById(R.id.btn6);
        Button btn7=(Button) findViewById(R.id.btn7);
        Button btn8=(Button) findViewById(R.id.btn8);
        Button btn9=(Button) findViewById(R.id.btn9);
        Button btn_add=(Button) findViewById(R.id.btn_add);
        Button btn_sub=(Button) findViewById(R.id.btn_sub);
        Button btn_mul=(Button) findViewById(R.id.btn_mul);
        Button btn_div=(Button) findViewById(R.id.btn_div);
        Button btn_del=(Button) findViewById(R.id.btn_del);
        Button btn_equal=(Button) findViewById(R.id.btn_equal);
        /*event click button*/
        btn0.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"0");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"1");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"2");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"3");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"4");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"5");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"6");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"7");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"8");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText().toString()+"9");
                if(dau==null)so1=Integer.parseInt(ed1.getText().toString());
                else so2=Integer.parseInt(ed1.getText().toString());
            }
        } );
        btn_add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dau='+';
               ed1.setText("");
            }
        } );
        btn_sub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dau='-';
               ed1.setText("");
            }
        } );
        btn_mul.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dau='*';
               ed1.setText("");
            }
        } );
        btn_div.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dau='/';
               ed1.setText("");
            }
        } );
        btn_equal.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dau!=null){
                        Integer result=0;
                        switch (dau){
                            case '+':
                                result=so1+so2;
                                break;
                            case '-':
                                result=so1-so2;
                                break;
                            case '*':
                                result=so1*so2;
                                break;
                            case '/':
                                result=so1/so2;
                                break;
                        }
                        ed1.setText(result.toString());
                        so1=result;
                        dau=null;
                }
            }
        } );
        btn_del.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                so1=0;
                so2=0;
                dau=null;
                ed1.setText("");
            }
        } );
    }

}