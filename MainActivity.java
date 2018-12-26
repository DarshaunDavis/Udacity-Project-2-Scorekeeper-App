package com.darshaundavis.footballcraze;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    float teamACompPass = 0;
    float teamAMissPass = 0;
    float teamAPassRate = 0;
    int teamBScore = 0;
    float teamBCompPass = 0;
    float teamBMissPass = 0;
    float teamBPassRate = 0;
    int resetScore = 0;

    /**
     * Displays score for Team A.
     */
    public void displayForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays completed passes for Team A.
     */
    public void displayCompletedTeamA (float complete) {
        TextView completeView = (TextView) findViewById(R.id.team_a_com_passes);
        completeView.setText(String.valueOf(complete));
    }

    /**
     * Displays missed passes for Team A.
     */
    public void displayMissedTeamA (float missed) {
        TextView missedView = (TextView) findViewById(R.id.team_a_missed_passes);
        missedView.setText(String.valueOf(missed));
    }

    /**
     * Displays pass completion rate for Team A.
     */
    public void displayCompletionRateTeamA (float rate) {
        TextView rateView = (TextView) findViewById(R.id.team_a_com_rate);
        rateView.setText(String.valueOf(rate));
    }

    /**
     * Displays score for Team B.
     */
    public void displayForTeamB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays completed passes for Team B.
     */
    public void displayCompletedTeamB (float complete) {
        TextView completeView = (TextView) findViewById(R.id.team_b_com_passes);
        completeView.setText(String.valueOf(complete));
    }

    /**
     * Displays missed passes for Team B.
     */
    public void displayMissedTeamB (float missed) {
        TextView missedView = (TextView) findViewById(R.id.team_b_missed_passes);
        missedView.setText(String.valueOf(missed));
    }

    /**
     * Displays pass completion rate for Team B.
     */
    public void displayCompletionRateTeamB (float rate) {
        TextView rateView = (TextView) findViewById(R.id.team_b_com_rate);
        rateView.setText(String.valueOf(rate));
    }

    /**
     * These methods are called when the score buttons are pressed for Team A
     */
    public void teamASafety (View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void teamAFieldGoal (View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void teamATouchDown (View view) {
        teamAScore = teamAScore + 6;
        displayForTeamA(teamAScore);
    }

    public void teamA1Point (View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void teamA2Points (View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    /**
     * These methods are called when the pass buttons are pressed for Team A
     */
    public void teamACompleted (View view) {
        teamACompPass = teamACompPass + 1;
        teamAPassRate = (teamACompPass / (teamACompPass + teamAMissPass)) * 100;
        displayCompletedTeamA(teamACompPass);
        displayCompletionRateTeamA(teamAPassRate);
    }

    public void teamAMissed (View view) {
        teamAMissPass = teamAMissPass + 1;
        teamAPassRate = (teamACompPass / (teamACompPass + teamAMissPass)) * 100;
        displayMissedTeamA(teamAMissPass);
        displayCompletionRateTeamA(teamAPassRate);
    }

    /**
     * These methods are called when the score buttons are pressed for Team B
     */
    public void teamBSafety (View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void teamBFieldGoal (View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void teamBTouchDown (View view) {
        teamBScore = teamBScore + 6;
        displayForTeamB(teamBScore);
    }

    public void teamB1Point (View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    public void teamB2Points (View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    /**
     * These methods are called when the pass buttons are pressed for Team B
     */
    public void teamBCompleted (View view) {
        teamBCompPass = teamBCompPass + 1;
        teamBPassRate = (teamBCompPass / (teamBCompPass + teamBMissPass)) * 100;
        displayCompletedTeamB(teamBCompPass);
        displayCompletionRateTeamB(teamBPassRate);
    }

    public void teamBMissed (View view) {
        teamBMissPass = teamBMissPass + 1;
        teamBPassRate = (teamBCompPass / (teamBCompPass + teamBMissPass)) * 100;
        displayMissedTeamB(teamBMissPass);
        displayCompletionRateTeamB(teamBPassRate);
    }

    /**
     * This method is called when the reset button is pressed.
     *
     */
    public void ResetScore (View view) {
        teamAScore = 0;
        teamBScore = 0;
        teamACompPass = 0;
        teamAMissPass = 0;
        teamAPassRate = 0;
        teamBCompPass = 0;
        teamBMissPass = 0;
        teamBPassRate = 0;
        displayForTeamA(teamAScore);
        displayCompletedTeamA(teamACompPass);
        displayMissedTeamA(teamAMissPass);
        displayCompletionRateTeamA(teamAPassRate);
        displayForTeamB(teamBScore);
        displayCompletedTeamB(teamBCompPass);
        displayMissedTeamB(teamBMissPass);
        displayCompletionRateTeamB(teamBPassRate);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
