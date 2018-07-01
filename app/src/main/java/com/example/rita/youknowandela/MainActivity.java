package com.example.rita.youknowandela;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    boolean answerFirst;
    boolean answerSecond2;
    boolean answerThird;
    boolean answerFirst1;
    boolean answerThird1;
    boolean answerFourth;
    boolean answerFirst2;
    boolean answerSecond1;
    boolean answerThird2;
    boolean answerFourth1;


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

        Toast toast = Toast.makeText(context, getNameOfGenius()+text, duration);
        toast.show();

    }
    //Method to get the name of user
    //Method names begin usually with verbs

    public String getNameOfGenius() {
        EditText nameOfPerson = (EditText) findViewById(R.id.name);
        Editable name = nameOfPerson.getText();

        return name.toString() + " ";
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

    public void checkbox(View view) {
        CheckBox firstAnswer = (CheckBox)  findViewById(R.id.jeremy);
        answerFirst1 = firstAnswer.isChecked();

        CheckBox thirdAnswer = (CheckBox)  findViewById(R.id.sass);
        answerThird1 = thirdAnswer.isChecked();

        CheckBox fourthAnswer = (CheckBox) findViewById(R.id.aboyeji);
        answerFourth = fourthAnswer.isChecked();
    }

    public void checkbox1(View view) {
        CheckBox firstAnswer1 = (CheckBox) findViewById(R.id.computer);
        answerFirst2 = firstAnswer1.isChecked();

        CheckBox secondAnswer1 = (CheckBox) findViewById(R.id.program);
        answerSecond1 = secondAnswer1.isChecked();

        CheckBox thirdAnswer1 = (CheckBox) findViewById(R.id.outsourcing);
        answerThird2 = thirdAnswer1.isChecked();

        CheckBox fourthAnswer1 = (CheckBox) findViewById(R.id.software);
        answerFourth1 = fourthAnswer1.isChecked();
    }

    public int getTotalScore(){
        int totalScore = 0;
        if(answerFirst){
            totalScore = 20;
        }
//        else{
//            totalScore = 0;
//        }
        if(answerSecond2) {
            totalScore += 20;

        }

        if(answerThird)  {
            totalScore += 20;
        }

        if(answerFirst1 && answerThird1 && answerFourth){
            totalScore += 20;
        }

        if(answerFirst2 && answerSecond1 && answerThird2 && answerFourth1){
            totalScore += 20;
        }

        return totalScore;
    }


    public String displayMessage(int totalScore){
         String message = "your total score is " + totalScore + "!!";

        return message;
    }

}