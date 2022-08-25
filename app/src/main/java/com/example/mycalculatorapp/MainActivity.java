package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    //https://www.youtube.com/watch?v=DLtlJohaYTI
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.num1);
    }

    /*
     All of these following methods are called by a button click
     */
    public void findSum(View view){
        EditText number1 = findViewById(R.id.num1);
        EditText number2 = findViewById(R.id.num2);
        TextView numSum = findViewById(R.id.answer);

//        if(TextUtils.isEmpty(editText.getText().toString())){
//            Toast.makeText(MainActivity.this, "No empty field allowed.", Toast.LENGTH_SHORT).show();
//        }
//        else{
//            Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
//        }
//
//        if(number1.getText().toString().equals("") || number2.getText().toString().equals("")){
//
//        }

        double num1 = Integer.parseInt((number1.getText().toString()));
        double num2 = Integer.parseInt((number2.getText().toString()));
        double sum = num1 + num2;

        numSum.setText("" + sum);
    }

    public void findProduct(View view){
        EditText number1 = findViewById(R.id.num1);
        EditText number2 = findViewById(R.id.num2);
        TextView numProd = findViewById(R.id.answer);

        double num1 = Integer.parseInt((number1.getText().toString()));
        double num2 = Integer.parseInt((number2.getText().toString()));
        double product = num1 * num2;

        numProd.setText("" + product);
    }

    public void findQuotient(View view){
        EditText number1 = findViewById(R.id.num1);
        EditText number2 = findViewById(R.id.num2);
        TextView numQuo = findViewById(R.id.answer);

        double num1 = Integer.parseInt((number1.getText().toString()));
        double num2 = Integer.parseInt((number2.getText().toString()));
        double quotient = num1 / num2;

        numQuo.setText("" + quotient);
    }

    public void findDifference(View view){
        EditText number1 = findViewById(R.id.num1);
        EditText number2 = findViewById(R.id.num2);
        TextView numDiff = findViewById(R.id.answer);

        double num1 = Integer.parseInt((number1.getText().toString()));
        double num2 = Integer.parseInt((number2.getText().toString()));
        double difference = num1 - num2;

        numDiff.setText("" + difference);
    }
}