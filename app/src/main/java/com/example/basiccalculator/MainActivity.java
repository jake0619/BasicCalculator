package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    boolean addFunc, newFunc;

    float total, numTwo;

    TextView textView, signView, formulaView;
    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonPlus, buttonEquals, buttonClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newFunc=true;
        addFunc=false;
        total = 0;
        textView = findViewById(R.id.mainText);
        formulaView = findViewById(R.id.formulaText);
        signView = findViewById(R.id.signText);

        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonClear = findViewById(R.id.buttonClear);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText()+"1");

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText()+"2");

            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText()+"3");

            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"+");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(null);

            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                signView.setText(textView.getText());



            }
        });

    }


}