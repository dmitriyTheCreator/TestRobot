package com.company.dima.litvinenko.robot;

import com.company.dima.litvinenko.robot.body.Body;
import com.company.dima.litvinenko.robot.head.Head;

public class RobotImplement implements Robot{
    private int battery;
    private String model;
    private Body body;
    private Head head;

    public RobotImplement(int battery, String model, Body body, Head head) {
        this.battery = battery;
        this.model = model;
        this.body = body;
        this.head = head;
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
