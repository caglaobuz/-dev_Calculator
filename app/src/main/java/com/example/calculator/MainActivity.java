package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button_C,button_open,button_close,button_div;
    Button button_7,button_8,button_9,button_multi;
    Button button_4,button_5,button_6,button_minus;
    Button button_1,button_2,button_3,button_plus;
    Button button_AC,button_0,button_Dot,button_equals;
    TextView islemler,result;

        boolean plus,minus,div,multi;
        float number1,number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);
        islemler=findViewById(R.id.islemler);

        button_C=(Button) findViewById(R.id.button_C);
        button_open=(Button) findViewById(R.id.button_open);
        button_close=(Button) findViewById(R.id.button_close);
        button_div=(Button) findViewById(R.id.button_div);
        button_7=(Button) findViewById(R.id.button_7);
        button_8=(Button) findViewById(R.id.button_8);
        button_9=(Button) findViewById(R.id.button_9);
        button_multi=(Button) findViewById(R.id.button_multi);
        button_4=(Button) findViewById(R.id.button_4);
        button_5=(Button) findViewById(R.id.button_5);
        button_6=(Button) findViewById(R.id.button_6);
        button_minus=(Button) findViewById(R.id.button_minus);
        button_1=(Button) findViewById(R.id.button_1);
        button_2=(Button) findViewById(R.id.button_2);
        button_3=(Button) findViewById(R.id.button_3);
        button_plus=(Button) findViewById(R.id.button_plus);
        button_AC=(Button) findViewById(R.id.button_AC);
        button_0=(Button) findViewById(R.id.button_0);
        button_Dot=(Button) findViewById(R.id.button_Dot);
        button_equals=(Button) findViewById(R.id.button_equals);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
                islemler.setText(result.getText());
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
                islemler.setText(result.getText());
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
                islemler.setText(result.getText());
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
                islemler.setText(result.getText());
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
                islemler.setText(result.getText());
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
                islemler.setText(result.getText());
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
                islemler.setText(result.getText());
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
                islemler.setText(result.getText());
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
                islemler.setText(result.getText());
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
                islemler.setText(result.getText());
            }
        });
        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
                islemler.setText(result.getText());
            }
        });

        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(" ");

            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (result==null){
                   result.setText("");
               }
               else{
                   number1 = Float.parseFloat(result.getText()+"");
                   plus=true;
                   result.setText(null);

               }
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Float.parseFloat(result.getText() + " ");
                minus = true;
                result.setText(null);
            }
            });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Float.parseFloat(result.getText() + " ");
                div = true;
                result.setText(null);
            }
        });
        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Float.parseFloat(result.getText() + " ");
                multi = true;
                result.setText(null);
            }
        });
        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number2 = Float.parseFloat(result.getText() + " ");
            if (plus==true){
                result.setText(number1+number2+"");
                islemler.setText(number1+"+"+number2);
                plus=false;
            }
                if (minus==true){
                    result.setText(number1-number2+"");
                    islemler.setText(number1+"-"+number2);
                    minus=false;
                }
                if (div==true){
                    result.setText(number1/number2+"");
                    islemler.setText(number1+"/"+number2);
                    div=false;
                }
                if (multi==true){
                    result.setText(number1*number2+"");
                    islemler.setText(number1+"x"+number2);
                    multi=false;
                }

            }
        });

        }
    }
