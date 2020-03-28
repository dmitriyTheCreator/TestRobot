package com.company.dima.litvinenko.robot.hands.right_hand;

import com.company.dima.litvinenko.robot.hands.Hand;

public class TransformerRightHand implements Hand, RightHand {
    @Override
    public void write() {
        System.out.println("I am writing with a pen");
    }

    @Override
    public String pickUp() {
        return "Pick up something heavy";
    }

    @Override
    public String weapon() {
        return "Rifle";
    }
}
