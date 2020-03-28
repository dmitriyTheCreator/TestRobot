package com.company.dima.litvinenko.robot.hands.right_hand;

import com.company.dima.litvinenko.robot.hands.Hand;

public class R2D2RightHand implements Hand, RightHand {
    @Override
    public void write() {
        System.out.println("I am writing with a pencil");
    }

    @Override
    public String pickUp() {
        return "Pick up something light";
    }

    @Override
    public String weapon() {
        return "Laser pistol";
    }
}
