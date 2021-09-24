package com.example.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickAddFunction(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        Integer num1 = Integer.parseInt(myTextField1.getText().toString());
        Integer num2 = Integer.parseInt(myTextField2.getText().toString());
        Integer solution = num1 + num2;
        Log.i("Info", "solution is " + solution);
        goToActivity2(solution.toString());
    }

    public void clickSubtractFunction(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        Integer num1 = Integer.parseInt(myTextField1.getText().toString());
        Integer num2 = Integer.parseInt(myTextField2.getText().toString());
        Integer solution = num1 - num2;
        goToActivity2(solution.toString());
    }

    public void clickMultiplyFunction(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        Integer num1 = Integer.parseInt(myTextField1.getText().toString());
        Integer num2 = Integer.parseInt(myTextField2.getText().toString());
        Integer solution = num1 * num2;
        goToActivity2(solution.toString());
    }

    public void clickDivideFunction(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        Integer num1 = Integer.parseInt(myTextField1.getText().toString());
        Integer num2 = Integer.parseInt(myTextField2.getText().toString());
        Integer solution = num1 / num2;
        goToActivity2(solution.toString());
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}