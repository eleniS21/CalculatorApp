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

    //https://www.youtube.com/watch?v=DLtlJohaYTI try catch
    //https://stackoverflow.com/questions/4841228/after-type-in-edittext-how-to-make-keyboard-disappear keyboard
    //https://www.youtube.com/watch?v=MC-sSt5VDBc gradient background
    EditText num1;
    EditText num2;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.answer);
    }

    /*
     All of these following methods are called by a button click
     */
    public void findSum(View view){

        double a = 0;
        double b = 0;

        try {
            a = Integer.parseInt(num1.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();

        }
        try {
            b = Integer.parseInt(num2.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        double sum2 = a + b;

        result.setText("" + sum2);
    }

    public void findProduct(View view){
        double a = 0;
        double b = 0;

        try {
            a = Integer.parseInt(num1.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        try {
            b = Integer.parseInt(num2.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        double prod = a * b;

        result.setText("" + prod);

    }

    public void findQuotient(View view){
        double a = 0;
        double b = 0;

        try {
            a = Integer.parseInt(num1.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        try {
            b = Integer.parseInt(num2.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        double quot = a / b;

        result.setText("" + quot);
    }

    public void findDifference(View view){
        double a = 0;
        double b = 0;

        try {
            a = Integer.parseInt(num1.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        try {
            b = Integer.parseInt(num2.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        double diff = a - b;

        result.setText("" + diff);
    }
}