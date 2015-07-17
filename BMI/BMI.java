package com.example.wgh.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends Activity {
    private EditText height = null;
    private EditText weight = null;
    private Button button1 = null;
    private Button button2 = null;
    private TextView show = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        button1=(Button)findViewById(R.id.BMIbutton);
        button2=(Button)findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BMI.this,OtherActivity.class);


                startActivity(intent);

            }
        });

        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        show=(TextView) findViewById(R.id.show);

        button1.setOnClickListener(new View.OnClickListener() {
            double bmi = 0;

            public void onClick(View v) {

                double h = new Double(height.getText().toString());
                double w = new Double(weight.getText().toString());
                bmi = w / (h * h);

                double final_result = exchangeResult(bmi);
                if (bmi < 16) {
                    show.setText("您的身高体重指数是：" + final_result + "  " + "极度偏瘦,注意加强营养哦");
                } else if (bmi >= 16 && bmi < 18.5) {
                    show.setText("您的身高体重指数是：" + final_result + "  " + "偏瘦，注意平衡营养膳食呦");
                } else if (bmi >= 18.5&& bmi <25) {
                    show.setText("您的身高体重指数是：" + final_result + "  " + "正常，哇哦不错呦");
                } else if (bmi >= 25 && bmi < 30) {
                    show.setText("您的身高体重指数是：" + final_result + "  " + "偏胖，平时要多运动哈");
                } else if (bmi >= 30 && bmi < 35) {
                    show.setText("您的身高体重指数是：" + final_result + "  " + "肥胖，加强体育锻炼噢");
                } else if (bmi >= 35 && bmi < 40) {
                    show.setText("您的身高体重指数是：" + final_result + "  " + "重度肥胖，要管住嘴迈开腿喔");
                } else if (bmi > 40) {
                    show.setText("您的身高体重指数是：" + final_result + "  " + "极度肥胖，小胖纸要励志减肥了哈");
                }
            }
        });
    }

    public double exchangeResult(double result){
        double first =result*100;
        double second = (int) first;
        double second_first = first-second;

        if(second_first>0.5){
            second++;
        }

        double jieguo = (double)second/100;
        return jieguo;
    }
}
