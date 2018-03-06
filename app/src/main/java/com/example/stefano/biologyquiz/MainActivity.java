package com.example.stefano.biologyquiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    int correctAnswers; //In Java, global variables will automatically default to zero
    int second_answer = 3; //Mitocondria
    int third_answer = 5; //Fecondation
    int fourth_answer = 7; //Cloroplast
    int seventh_answer = 12; //Cell Wall
    String eighth_answer = "Apoptosis";
    String ninth_answer = "Cytoplasm";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Check box questions ---------------------------------*/

    //1st question: check_box type
    private boolean question1() {
        CheckBox check1 = findViewById(R.id.quest1_first);
        CheckBox check2 = findViewById(R.id.quest1_second);
        CheckBox check3 = findViewById(R.id.quest1_third);

        if (check1.isChecked() && !check2.isChecked() && !check3.isChecked()) {
            return true;
        }
        return false;
    }

    //5th question: check_box type
    private boolean question5() {
        CheckBox check1 = findViewById(R.id.quest5_first);
        CheckBox check2 = findViewById(R.id.quest5_second);
        CheckBox check3 = findViewById(R.id.quest5_third);

        if (check1.isChecked() && check2.isChecked() && !check3.isChecked()) {
            return true;
        }
        return false;
    }

    //6th question: check_box type
    private boolean question6() {
        CheckBox check1 = findViewById(R.id.quest6_first);
        CheckBox check2 = findViewById(R.id.quest6_second);
        CheckBox check3 = findViewById(R.id.quest6_third);

        if (check1.isChecked() && check2.isChecked() && !check3.isChecked()) {
            return true;
        }
        return false;
    }

    //10th question: check_box type
    private boolean question10() {
        CheckBox check1 = findViewById(R.id.quest10_first);
        CheckBox check2 = findViewById(R.id.quest10_second);
        CheckBox check3 = findViewById(R.id.quest10_third);

        if (check1.isChecked() && check2.isChecked() && check3.isChecked()) {
            return true;
        }
        return false;
    }

    /*Radio button questions -------------------------------------*/

    //2nd question: radio button type
    private boolean question2() {
        RadioGroup radioGroup = findViewById(R.id.quest2_radio);
        if (radioGroup.getCheckedRadioButtonId() == second_answer) {
            return true;
        }
        return false;
    }

    //3rd question: radio button type
    private boolean question3() {
        RadioGroup radioGroup = findViewById(R.id.quest3_radio);
        if (radioGroup.getCheckedRadioButtonId() == third_answer) {
            return true;
        }
        return false;
    }

    //4th question: radio button type
    private boolean question4() {
        RadioGroup radioGroup = findViewById(R.id.quest4_radio);
        if (radioGroup.getCheckedRadioButtonId() == fourth_answer) {
            return true;
        }
        return false;
    }

    //7th question: radio button type
    private boolean question7() {
        RadioGroup radioGroup = findViewById(R.id.quest7_radio);
        if (radioGroup.getCheckedRadioButtonId() == seventh_answer) {
            return true;
        }
        return false;
    }

    /*Edit text button questions ---------------------------------- */

    //8th question: edit text type
    private boolean question8() {
        EditText editText = findViewById(R.id.quest8);
        return editText.getText().toString().trim().equalsIgnoreCase(eighth_answer);
    }

    //9th question: edit text type
    private boolean question9() {
        EditText editText = findViewById(R.id.quest9);
        return editText.getText().toString().trim().equalsIgnoreCase(ninth_answer);
    }

    public void submitAnswer(View view) {

        correctAnswers = 0;

        if (question1() == true) {
            correctAnswers++;
        }
        if (question2() == true) {
            correctAnswers++;
        }
        if (question3() == true) {
            correctAnswers++;
        }
        if (question4() == true) {
            correctAnswers++;
        }
        if (question5() == true) {
            correctAnswers++;
        }
        if (question6() == true) {
            correctAnswers++;
        }
        if (question7() == true) {
            correctAnswers++;
        }
        if (question8() == true) {
            correctAnswers++;
        }
        if (question9() == true) {
            correctAnswers++;
        }
        if (question10() == true) {
            correctAnswers++;
        }

        if (correctAnswers <= 3) {
            Toast.makeText(this, "You got just " + correctAnswers + " answers! You need to study more!", Toast.LENGTH_LONG).show();
        } else if (correctAnswers > 3 && correctAnswers <= 6) {
            Toast.makeText(this, "You got " + correctAnswers + " answers! You need to study more!", Toast.LENGTH_LONG).show();
        } else if (correctAnswers >= 7 && correctAnswers < 10) {
            Toast.makeText(this, "You got " + correctAnswers + " answers! Almost perfect", Toast.LENGTH_LONG).show();
        } else if (correctAnswers == 10) {
            Toast.makeText(this, "You got " + correctAnswers + " answers! Biology Guru!", Toast.LENGTH_LONG).show();
        }
    }
}

