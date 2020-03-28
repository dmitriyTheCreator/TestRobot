package com.company.dima.litvinenko.robot;

import com.company.dima.litvinenko.robot.body.Body;
import com.company.dima.litvinenko.robot.hands.Hand;
import com.company.dima.litvinenko.robot.hands.left_hand.LeftHand;
import com.company.dima.litvinenko.robot.hands.right_hand.RightHand;
import com.company.dima.litvinenko.robot.head.Head;
import com.company.dima.litvinenko.robot.head.ears.Ear;
import com.company.dima.litvinenko.robot.head.eyes.Eye;
import com.company.dima.litvinenko.robot.legs.Leg;
import com.company.dima.litvinenko.robot.legs.left_leg.LeftLeg;
import com.company.dima.litvinenko.robot.legs.right_leg.RightLeg;

public class RobotImplement implements Robot{
    private int battery;
    private String model;
    private Body body;
    private Head head;
    private Hand hands;
    private Leg legs;
    private RightLeg rightLeg;
    private LeftHand leftHand;
    private RightHand rightHand;
    private LeftLeg leftLeg;
    private Eye eyes;
    private Ear ears;

    public RobotImplement(int battery, String model, Body body, Head head) {
        this.battery = battery;
        this.model = model;
        this.body = body;
        this.head = head;
    }

    public Hand getHands() {
        return hands;
    }

    public void setHands(Hand hands) {
        this.hands = hands;
    }

    public Leg getLegs() {
        return legs;
    }

    public void setLegs(Leg legs) {
        this.legs = legs;
    }

    public RightLeg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(RightLeg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public LeftHand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(LeftHand leftHand) {
        this.leftHand = leftHand;
    }

    public RightHand getRightHand() {
        return rightHand;
    }

    public void setRightHand(RightHand rightHand) {
        this.rightHand = rightHand;
    }

    public LeftLeg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(LeftLeg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Eye getEyes() {
        return eyes;
    }

    public void setEyes(Eye eyes) {
        this.eyes = eyes;
    }

    public Ear getEars() {
        return ears;
    }

    public void setEars(Ear ears) {
        this.ears = ears;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public void move() {
        if(battery <= 15) {
            System.out.println("The battery is too low, need to eat");
        } else {
            System.out.println("The battery is sufficiently charged, I am ready to act");
        }
    }

    @Override
    public String communicate(String speech) {
        return "Whassup, bro?";
    }

    @Override
    public double calculate(double a, char c, double b) {
        double res = 0;
        if(c == '+'){
             res = a+b;
        } else if(c == '-'){
            res = a-b;
        } else if(c == '/'){
            res = a/b;
        } else if(c == '*'){
            res = a*b;
        }
        return res;
    }
}
