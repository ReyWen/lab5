package ua.lviv.iot.lab2.hierarchy;

import lombok.*;

public class SkippingRope extends Machine {
    private int frequencyPerMinute;
    public SkippingRope(int cashPerMinute, int caloriesPerMinute, int exerciseTime, String name, int frequencyPerMinute) {
        super(cashPerMinute, caloriesPerMinute, exerciseTime, name);
        this.frequencyPerMinute=frequencyPerMinute;
    }

    @Override
    public String doExercise() {
        return "You have to do this exercise ("+this.getName()+") for "+ this.getExerciseTime()+ " minutes and you will lose "+
                this.getCaloriesPerMinute()*this.getExerciseTime()+" calories.";
    }
}
