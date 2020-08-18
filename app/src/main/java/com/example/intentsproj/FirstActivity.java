package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button Btn_Ok;
    EditText number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn_Ok = findViewById(R.id.okBtn);

        number1 = findViewById(R.id.Number1);
        number2 = findViewById(R.id.Number2);

        LayoutInflater li = getLayoutInflater();

        final View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));




        Btn_Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Toast toast = Toast.makeText(getApplicationContext(),"Sending Message",Toast.LENGTH_SHORT);
                //toast.show();



                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("number1",num1);
                intent.putExtra("number2",num2);
                startActivity(intent);



                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();

            }
        });
    }


}