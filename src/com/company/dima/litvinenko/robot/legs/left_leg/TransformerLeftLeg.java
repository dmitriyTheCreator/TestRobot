package com.company.dima.litvinenko.robot.legs.left_leg;

import com.company.dima.litvinenko.robot.legs.Leg;

public class TransformerLeftLeg implements Leg, LeftLeg {
    @Override
    public String march() {
        return "Left!";
    }

    @Override
    public boolean presence() {
        return false;
    }
}
