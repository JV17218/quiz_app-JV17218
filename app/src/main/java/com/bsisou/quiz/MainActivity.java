package com.bsisou.quiz;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare constants here


    // TODO: Declare member variables here:
Button trueButton;
Button falseButton;
TextView scoreTextView;
TextView questionTextView;
ProgressBar progressBar;
//Int variable to retrieve question from an array, and track which question is on display.
int index;
//In variable to that hold the question Id
int question;






    // TODO: to create question bank
    private TrueFalse[]  questionBank = new com.bsisou.quiz.TrueFalse[] {
            new TrueFalse(R.string.question_1, false),
            new TrueFalse(R.string.question_2, false),
            new TrueFalse(R.string.question_3, true),
            new TrueFalse(R.string.question_4, true),
            new TrueFalse(R.string.question_5, false),
            new TrueFalse(R.string.question_6, true),
            new TrueFalse(R.string.question_7, true),
            new TrueFalse(R.string.question_8, true),
            new TrueFalse(R.string.question_9, true),
            new TrueFalse(R.string.question_10, true),
            new TrueFalse(R.string.question_11, false),
            new TrueFalse(R.string.question_12, false),
            new TrueFalse(R.string.question_13, true)

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        trueButton = findViewById(R.id.true_button);
        falseButton = findViewById(R.id.false_button);
        questionTextView = findViewById(R.id.question_text_view);
        scoreTextView = findViewById(R.id.score);
        progressBar = findViewById(R.id.progress_bar);


        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Quiz", "True Button Pressed");
                Toast text_message = Toast.makeText(getApplicationContext(), "true clicked", Toast.LENGTH_SHORT);
                text_message.show();
                updateQuestion(); // update question after user clicks "True".
            }
        });

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Quiz", "True Button Pressed");
                updateQuestion(); // updates question after user clicks "False".
            }
        });

        question = questionBank[index].getQuestionID();
        questionTextView.setText(question);

        }

    public void updateQuestion() {
        index += 1; //so each time we answer (will call this method) and move to next question id in array
        question = questionBank[index].getQuestionID(); // get the question id of that item in the array
        questionTextView.setText(question); // sets the question view text to what the question is.
        index = (index + 1) % questionBank.length; // index 13 doesn't exist, which is what the program was doing.


    }
    }












