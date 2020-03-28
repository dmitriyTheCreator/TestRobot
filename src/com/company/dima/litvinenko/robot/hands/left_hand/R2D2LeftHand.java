package com.company.dima.litvinenko.robot.hands.left_hand;

import com.company.dima.litvinenko.robot.hands.Hand;

public class R2D2LeftHand implements Hand, LeftHand{
    @Override
    public String pickUp() {
        return "Pick up something light";
    }

    @Override
    public String weapon() {
        return "Knife";
    }

    @Override
    public boolean sensorInWrist() {
        return false;
    }
}
