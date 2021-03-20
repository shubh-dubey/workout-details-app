package com.shubh.workout;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {

    List<String> getWorkouts ( String workouttypes){

   List<String> workout = new ArrayList<String>();

        if(workouttypes.equals("Push-ups")) {
            workout.add("Incline Clapping");
            workout.add("Decline Clapping");
            workout.add("Normal Push-ups");
            workout.add("Alternating Push-ups");

        }else if(workouttypes.equals("Chest")){

            workout.add("Chest Press : 4x20 reps");
            workout.add("Incline Fly : 4x12 reps");
            workout.add("Dumbell Floor Press : 4x20 reps ");
            workout.add("Incline Dumbell Press : 4x14 reps");
            workout.add("Decline Dumbell press : 4x14 reps");
            workout.add("Dumbell Pullover : 4x20 reps");
            workout.add("Standing Upward Fly : 4x20 reps");
            workout.add("Cable Fly : 3x12 reps");

   }else if(workouttypes.equals("Biceps And Arms")){

            workout.add("Invert Row : 4x20 reps");
            workout.add("Alternate Bicep curl : 4x20 reps");
            workout.add("Bicep curl : 4x20 reps");
            workout.add("Skull Crusher : 4x10 reps");
            workout.add("Concentration Curls : 4x10 reps");
            workout.add("Barbel Curl : 4x20");
            workout.add("Arms Tension : 4x20 reps");

   }else if(workouttypes.equals("Abs")){



   }else if(workouttypes.equals("Shoulder And Triceps")){

            workout.add("Tricep Kickback : 2x20 reps");
            workout.add("Tricep Extension : 2x20 reps");
            workout.add("Tricep Dips : 2x20 reps");
            workout.add("Rope Extension : 4x14 reps");
            workout.add("Shoulder Press : 4x14 reps");
            workout.add("Lateral Raise : 4x14 reps");
            workout.add("Bar Upright Row : 4x14 reps");
            workout.add("Lateral Front Raise : 4x14 reps");
            workout.add("Single Arm Overhead Press : 4x14 reps");
            workout.add("Pull-ups");



   }else if(workouttypes.equals("Back")){

   }else if(workouttypes.equals("Legs")){

   }
   return workout;

    }
}
