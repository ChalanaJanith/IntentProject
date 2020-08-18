package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText Snumber1,Snumber2;
    TextView viewResult;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Snumber1 = findViewById(R.id.Stext1);
        Snumber2 = findViewById(R.id.Stext2);
        viewResult = findViewById(R.id.TextViewCal);

        add = findViewById(R.id.addBtn);
        sub = findViewById(R.id.subBtn);
        mul = findViewById(R.id.mulBtn);
        div = findViewById(R.id.DivBtn);

        String num1 = getIntent().getStringExtra("number1");
        String num2 = getIntent().getStringExtra("number2");

        Snumber1.setText(num1);
        Snumber2.setText(num2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberOne = Integer.parseInt(Snumber1.getText().toString());
                int numberTwo = Integer.parseInt(Snumber2.getText().toString());
                int add = numberOne + numberTwo;
                viewResult.setText((numberOne)+ "+" +(numberTwo)+"="+(add));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberOne = Integer.parseInt(Snumber1.getText().toString());
                int numberTwo = Integer.parseInt(Snumber2.getText().toString());
                int sub = numberOne - numberTwo;
                viewResult.setText((numberOne)+ "-" +(numberTwo)+"="+(sub));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberOne = Integer.parseInt(Snumber1.getText().toString());
                int numberTwo = Integer.parseInt(Snumber2.getText().toString());
                int mul = numberOne * numberTwo;
                viewResult.setText((numberOne)+ "*" +(numberTwo)+"="+(mul));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberOne = Integer.parseInt(Snumber1.getText().toString());
                int numberTwo = Integer.parseInt(Snumber2.getText().toString());
                int div = numberOne / numberTwo;
                viewResult.setText((numberOne)+ "/" +(numberTwo)+"="+(div));
            }
        });
    }
}