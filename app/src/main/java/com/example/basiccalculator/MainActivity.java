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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean addFunc, subFunc, multFunc, divFunc, eqFunc;

    float total, numTwo;

    TextView textView, signView, formulaView;
    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonPlus, buttonEquals, buttonClear, buttonZero,buttonMinus, buttonMult, buttonDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFunc=false;
        subFunc = false;
        multFunc = false;
        divFunc = false;
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
        buttonZero = findViewById(R.id.buttonZero);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMult = findViewById(R.id.buttonMult);

        buttonEquals = findViewById(R.id.buttonEquals);
        buttonClear = findViewById(R.id.buttonClear);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonZero.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonZero:
                if(textView.getText().toString()!="0"){
                    textView.setText(textView.getText()+"0");
                }
                break;
            case R.id.buttonOne:
                textView.setText(textView.getText()+"1");
                break;
            case R.id.buttonTwo:
                textView.setText(textView.getText()+"2");
                break;
            case R.id.buttonThree:
                textView.setText(textView.getText()+"3");
                break;
            case R.id.buttonFour:
                textView.setText(textView.getText()+"4");
                break;
            case R.id.buttonFive:
                textView.setText(textView.getText()+"5");
                break;
            case R.id.buttonSix:
                textView.setText(textView.getText()+"6");
                break;
            case R.id.buttonSeven:
                textView.setText(textView.getText()+"7");
                break;
            case R.id.buttonEight:
                textView.setText(textView.getText()+"8");
                break;
            case R.id.buttonNine:
                textView.setText(textView.getText()+"9");
                break;
            case R.id.buttonClear:
                total=0;
                textView.setText(null);
                formulaView.setText(null);
                signView.setText(null);
                addFunc=false;subFunc=false;multFunc=false;divFunc=false;eqFunc=false;
                break;
            case R.id.buttonPlus:
                checkPreviousSign();
                addFunc = true;
                signView.setText(signView.getText().toString()+"+");
                break;
            case R.id.buttonMinus:
                checkPreviousSign();
                subFunc = true;
                signView.setText(signView.getText().toString()+"-");
                break;
            case R.id.buttonMult:
                checkPreviousSign();
                multFunc = true;
                signView.setText(signView.getText().toString()+"x");
                break;
//            case R.id.buttonDiv:
//                checkPreviousSign();
//                divFunc = true;
//                signView.setText(signView.getText().toString()+"x");
//                break;
            case R.id.buttonEquals:
                checkPreviousSign();
                textView.setText(formulaView.getText());
                eqFunc = true;
                break;
        }
    }

    public void checkPreviousSign(){
        float tempNum = Float.parseFloat(textView.getText().toString());
        if(addFunc){
            total+=tempNum;
            signView.setText(signView.getText().toString()+tempNum);

            formulaView.setText(Float.toString(total));
            textView.setText(null);
            addFunc = false;
        }
        else if(subFunc){
            total-=tempNum;
            signView.setText(signView.getText().toString()+tempNum);
            formulaView.setText(Float.toString(total));
            textView.setText(null);
            subFunc = false;
        }
        else if(multFunc){
            total*=tempNum;
            signView.setText(signView.getText().toString()+tempNum);
            formulaView.setText(Float.toString(total));
            textView.setText(null);
            multFunc = false;
        }
        else if(divFunc){
            total/=tempNum;
            signView.setText(signView.getText().toString()+tempNum);
            formulaView.setText(Float.toString(total));
            textView.setText(null);
            divFunc = false;
        }
        else if(eqFunc){
            signView.setText(null);
            signView.setText(textView.getText());
            textView.setText(null);
            eqFunc = false;
        }
        else{
            total+=tempNum;

            signView.setText(signView.getText().toString()+tempNum);
            textView.setText(null);
        }
    }



}