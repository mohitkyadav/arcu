package com.mky.android.arcu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsTeamA = 0;
    int pointsTeamB = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void three_points_A(View view) {
        pointsTeamA = pointsTeamA + 3;
        displayForTeamA(pointsTeamA);
    }

    public void two_points_A(View view) {
        pointsTeamA = pointsTeamA + 2;
        displayForTeamA(pointsTeamA);
    }

    public void one_point_A(View view) {
        pointsTeamA = pointsTeamA + 1;
        displayForTeamA(pointsTeamA);
    }

    private void displayForTeamA(int point) {
        TextView scoreTeamA = (TextView) findViewById(R.id.team_a_score);
        scoreTeamA.setText("" + point);
    }

    public void three_points_B(View view) {
        pointsTeamB = pointsTeamB + 3;
        displayForTeamB(pointsTeamB);
    }

    public void two_points_B(View view) {
        pointsTeamB = pointsTeamB + 2;
        displayForTeamB(pointsTeamB);
    }

    public void one_point_B(View view) {
        pointsTeamB = pointsTeamB + 1;
        displayForTeamB(pointsTeamB);
    }

    private void displayForTeamB(int point) {
        TextView scoreTeamB = (TextView) findViewById(R.id.team_b_score);
        scoreTeamB.setText("" + point);
    }

    public void reset_score(View view) {
        pointsTeamA = 0;
        pointsTeamB = 0;
        displayForTeamA(pointsTeamA);
        displayForTeamB(pointsTeamB);
    }
}

