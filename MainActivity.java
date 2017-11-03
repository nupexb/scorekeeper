package com.example.android.usafootball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    final int extraPointA = 1;
    final int extraPointB = 1;
    final int fieldGoalA = 3;
    final int fieldgoalB = 3;
    final int touchDownA = 6;
    final int touchDownB = 6;
    final int safetyA = 2;
    final int safetyB = 2;
    final int twoPointA = 2;
    final int twoPointB = 2;
    final int scoreReset = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when the buttons are clicked
     */
    public void incrementExtraPointA(View view){
        //increment score by 1
        scoreTeamA = scoreTeamA + extraPointA;
        displayForTeamA(scoreTeamA);
    }
    public void incrementExtraPointB(View view){
        //increment score by 1
        scoreTeamB = scoreTeamB + extraPointB;
        displayForTeamB(scoreTeamB);
    }
    public void incrementFieldGoalA(View view){
        //increment score by 3
        scoreTeamA = scoreTeamA + fieldGoalA;
        displayForTeamA(scoreTeamA);
    }
    public void incrementFieldGoalB(View view){
        //increment score by 3
        scoreTeamB = scoreTeamB + fieldgoalB;
        displayForTeamB(scoreTeamB);
    }
    public void incrementTouchDownA(View view){
        //increment score by 6
        scoreTeamA = scoreTeamA + touchDownA;
        displayForTeamA(scoreTeamA);
    }
    public void incrementTouchDownB(View view){
        //increment score by 6
        scoreTeamB = scoreTeamB + touchDownB;
        displayForTeamB(scoreTeamB);
    }
    public void incrementSafetyA(View view){
        //increment score by 2
        scoreTeamA = scoreTeamA + safetyA;
        displayForTeamA(scoreTeamA);
    }
    public void incrementSafetyB(View view){
        //increment score by 2
        scoreTeamB = scoreTeamB + safetyB;
        displayForTeamB(scoreTeamB);
    }
    public void incrementTwoPointA(View view){
        //increment score by 2
        scoreTeamA = scoreTeamA + twoPointA;
        displayForTeamA(scoreTeamA);
    }
    public void incrementTwoPointB(View view){
        //increment score by 2
        scoreTeamB = scoreTeamB + twoPointB;
        displayForTeamB(scoreTeamB);
    }
    public void scoreReset(View view){
        //Reset scores to zero
        scoreTeamA = scoreReset;
        scoreTeamB = scoreReset;
        displayForTeamA(scoreReset);
        displayForTeamB(scoreReset);
    }
}
