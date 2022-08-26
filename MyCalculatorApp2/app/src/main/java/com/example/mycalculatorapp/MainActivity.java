package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private ImageButton add;
    private TextView result;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.Number1);
        num2 = (EditText) findViewById(R.id.Number2);
        add = (ImageButton) findViewById(R.id.plus_button);
        ImageButton subtract = (ImageButton) findViewById(R.id.minus_button);
        ImageButton multiply = (ImageButton) findViewById(R.id.multiply_button);
        ImageButton divide = (ImageButton) findViewById(R.id.divide_button);
        ImageButton percent = (ImageButton) findViewById(R.id.percent);
        result = (TextView) findViewById(R.id.ResultTextView);

        /*
        I watched a video on Youtube for how to add two user-inputted numbers. I changed
        the code inside each method according to the desired operation.
         */

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int sum = number1 + number2;
                result.setText("Result: " + String.valueOf(sum));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int difference = number1 - number2;
                result.setText("Result: " + String.valueOf(difference));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int product = number1 * number2;
                result.setText("Result: " + String.valueOf(product));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Integer.parseInt(num1.getText().toString());
                double number2 = Integer.parseInt(num2.getText().toString());
                double quotient = number1 / number2;
                result.setText("Result: " + String.valueOf(quotient));
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                This method essentially means that number1 % of number2 is percent
                 */
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                double percent = number1 * number2 * 0.01;
                result.setText("Result: " + String.valueOf(percent));
            }
        });
    }
}