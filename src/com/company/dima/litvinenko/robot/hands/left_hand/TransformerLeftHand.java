package com.company.dima.litvinenko.robot.hands.left_hand;

import com.company.dima.litvinenko.robot.hands.Hand;

public class TransformerLeftHand implements Hand, LeftHand {
    @Override
    public String pickUp() {
        return "Pick up something heavy";
    }

    @Override
    public String weapon() {
        return "Sword";
    }

    @Override
    public boolean sensorInWrist() {
        return false;
    }
}
