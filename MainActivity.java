package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numOne;
    private EditText numTwo;
    private TextView answerValue;
    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numOne = (EditText) findViewById(R.id.inputOne);
        numTwo = (EditText) findViewById(R.id.inputTwo);
        answerValue = (TextView) findViewById(R.id.answer);
        addButton = findViewById(R.id.add);
        subtractButton = findViewById(R.id.subtract);
        multiplyButton = findViewById(R.id.multiply);
        divideButton = findViewById(R.id.divide);

        addButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                double num1 = Double.parseDouble(numOne.getText().toString());
                double num2 = Double.parseDouble(numTwo.getText().toString());
                double sum = num1 + num2;
                answerValue.setText("Answer: " + String.valueOf(sum));
                answerValue.setVisibility(View.VISIBLE);
            }
        });

        subtractButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                double num1 = Double.parseDouble(numOne.getText().toString());
                double num2 = Double.parseDouble(numTwo.getText().toString());
                double difference = num1 - num2;
                answerValue.setText("Answer: " + String.valueOf(difference));
                answerValue.setVisibility(View.VISIBLE);
            }
        });
        multiplyButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                double num1 = Double.parseDouble(numOne.getText().toString());
                double num2 = Double.parseDouble(numTwo.getText().toString());
                double multiply = num1 * num2;
                answerValue.setText("Answer: " + String.valueOf(multiply));
                answerValue.setVisibility(View.VISIBLE);
            }
        });
        divideButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                double num1 = Double.parseDouble(numOne.getText().toString());
                double num2 = Double.parseDouble(numTwo.getText().toString());
                double quotient = num1 / num2;
                answerValue.setText("Answer: " + String.valueOf(quotient));
                answerValue.setVisibility(View.VISIBLE);
            }
        });
    }
}