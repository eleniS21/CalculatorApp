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
    EditText num1;
    EditText num2;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // will find EditText that has num1 id
        num1 = (EditText) findViewById(R.id.num1);

        // this will find an EditText called num2
        num2 = (EditText) findViewById(R.id.num2);

        // Finds an EditText with the id of answer
        result = (TextView) findViewById(R.id.answer);
    }


    //All of these following methods are called by a button click
    //Takes the two numbers the user inputs and calculates the sum
    public void findSum(View view){

        int a = 0;
        int b = 0;

        //Checks to see if the users first value is null
        // if so, that value will be set to 0.
        //https://stackoverflow.com/questions/51831210/calculator-error-when-try-to-sum-an-integer-with-an-empty-field
        // This is the link to where I found the code for the try catch.
            try {

                //extracts int
                a = Integer.parseInt(num1.getText().toString().trim());
            } catch (NumberFormatException e) {

                //Pop up message letting users know that they entered an invalid value
                //https://www.youtube.com/watch?v=DLtlJohaYTI
                //Used this link for the Toast message
                Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();

            }

            // Checks if the users second value is null
            try {
                b = Integer.parseInt(num2.getText().toString().trim());
            } catch (NumberFormatException e) {
                Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
            }


        int sum2 = a + b;

            //sets the TextView to print out the sum
        result.setText("" + sum2);
    }

    //Takes the two numbers the user inputs and calculates the product
    public void findProduct(View view){
        int a = 0;
        int b = 0;

        //Checks for user input error for first value
        try {
            a = Integer.parseInt(num1.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        // Looks for null in second value
        try {
            b = Integer.parseInt(num2.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        int prod = a * b;

        //sets TextView to print out product
        result.setText("" + prod);

    }

    //Takes the two numbers the user inputs and calculates the quotient
    public void findQuotient(View view){
        int a = 0;
        int b = 0;

        //Checks for possible empty first value from user
        try {
            a = Integer.parseInt(num1.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        //Looks for empty second value from user
        try {
            b = Integer.parseInt(num2.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        int quot = a / b;

        //sets the TextView to print out the quotient
        result.setText("" + quot);
    }

    //Takes the two numbers the user inputs and calculates the difference
    public void findDifference(View view){
        int a = 0;
        int b = 0;

        //Checks for null error in first value
        try {
            a = Integer.parseInt(num1.getText().toString().trim());
        } catch (NumberFormatException e) {
            //notifies user they have to enter a value
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        //Checks for a null error in the users second value
        try {
            b = Integer.parseInt(num2.getText().toString().trim());
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "No empty field allowed.\n\t\tValue set to 0.", Toast.LENGTH_SHORT).show();
        }

        int diff = a - b;

        //sets TextView to print out the difference of the values
        result.setText("" + diff);
    }
}