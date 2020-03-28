package com.company.dima.litvinenko.robot.legs.right_leg;

import com.company.dima.litvinenko.robot.legs.Leg;

public class TransformerRightLeg implements Leg, RightLeg {
    @Override
    public String march() {
        return "Right!";
    }

    @Override
    public void kick() {
        System.out.println("I pass!");
    }
}
