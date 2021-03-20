package com.shubh.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    private WorkoutExpert expert = new WorkoutExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindWorkout(View view){
        TextView workouts = (TextView)findViewById(R.id.workout);

        Spinner workouttype = (Spinner)findViewById(R.id.workouttype);

        String workout = String.valueOf(workouttype.getSelectedItem());
//        workouts.setText(workout);

        List<String> workoutlist = expert.getWorkouts(workout);

        StringBuilder workoutformat = new StringBuilder();
        for(String work : workoutlist){
            workoutformat.append(work).append('\n');
        }
        workouts.setText(workoutformat);
    }
}