package com.example.rita.youknowandela;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean answerFirst;
    boolean answerSecond2;
    boolean answerThird;
    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getNameOfGenius();
    }

    public void doneButton(View view) {
        int score = getTotalScore();
        displayMessage(score);

        Context context = getApplicationContext();
        CharSequence text = displayMessage(score);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    //Method to get the name of user
    //Method names begin usually with verbs

    public Editable getNameOfGenius() {
        EditText nameOfPerson = (EditText) findViewById(R.id.name);
        Editable name = nameOfPerson.getText();

        return name;
    }
    public void radioButton(View view) {
        RadioButton firstAnswer = (RadioButton) findViewById(R.id.brilliance);
        answerFirst = firstAnswer.isChecked();

    }

    public void radioButton1(View view) {
        RadioButton secondAnswer = (RadioButton) findViewById(R.id.may);
        answerSecond2 = secondAnswer.isChecked();
    }

    public void radioButton2(View view) {
        RadioButton thirdAnswer = (RadioButton)  findViewById(R.id.newyork);
        answerThird = thirdAnswer.isChecked();
    }

    public int getTotalScore() {
        if(answerFirst && ){
            totalScore = 10;
        }
        else{
            totalScore = 0;
        }
        if(answerSecond2) {
            totalScore =  10;
        }
        else{
            totalScore = 0;
        }
        return totalScore;
    }


    public String displayMessage(int totalScore){
         String message = "The total score is " + totalScore;

        return message;
    }
}