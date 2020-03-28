package com.company.dima.litvinenko;

import com.company.dima.litvinenko.robot.Robot;
import com.company.dima.litvinenko.robot.RobotImplement;
import com.company.dima.litvinenko.robot.body.Body;
import com.company.dima.litvinenko.robot.body.R2D2Body;
import com.company.dima.litvinenko.robot.body.TransformerBody;
import com.company.dima.litvinenko.robot.hands.Hand;
import com.company.dima.litvinenko.robot.hands.left_hand.R2D2LeftHand;
import com.company.dima.litvinenko.robot.hands.left_hand.TransformerLeftHand;
import com.company.dima.litvinenko.robot.hands.right_hand.R2D2RightHand;
import com.company.dima.litvinenko.robot.hands.right_hand.TransformerRightHand;
import com.company.dima.litvinenko.robot.head.Head;
import com.company.dima.litvinenko.robot.head.R2D2Head;
import com.company.dima.litvinenko.robot.head.TransformerHead;
import com.company.dima.litvinenko.robot.head.ears.TransformerEar;
import com.company.dima.litvinenko.robot.head.eyes.R2D2Eye;
import com.company.dima.litvinenko.robot.legs.Leg;
import com.company.dima.litvinenko.robot.legs.left_leg.R2D2LeftLeg;
import com.company.dima.litvinenko.robot.legs.left_leg.TransformerLeftLeg;
import com.company.dima.litvinenko.robot.legs.right_leg.R2D2RightLeg;
import com.company.dima.litvinenko.robot.legs.right_leg.TransformerRightLeg;

public class Main {

    public static void main(String[] args) {
        R2D2Body r2D2Body = new R2D2Body();
        R2D2Head r2D2Head = new R2D2Head();
        TransformerBody transformerBody = new TransformerBody();
        TransformerHead transformerHead = new TransformerHead();
        R2D2LeftLeg r2D2LeftLeg = new R2D2LeftLeg();
        TransformerRightLeg transformerRightLeg = new TransformerRightLeg();
        TransformerRightHand transformerRightHand = new TransformerRightHand();
        R2D2LeftHand r2D2LeftHand = new R2D2LeftHand();
        R2D2Eye r2D2Eye = new R2D2Eye();
        TransformerEar transformerEar = new TransformerEar();

        Body[] bodies = new Body[]{new R2D2Body(), new TransformerBody()};
        for (int i = 0; i < bodies.length; i++) {
            System.out.println(bodies[i].lvl_armor());
        }

        transformerHead.think();
        r2D2Head.think();

        Hand[] hands = new Hand[]{new R2D2LeftHand(), new R2D2RightHand(),
                new TransformerLeftHand(), new TransformerRightHand()};
        for (int i = 0; i < hands.length; i++) {
            System.out.println(hands[i].weapon());
            System.out.println(hands[i].pickUp());
        }

        Leg[] legs = new Leg[]{new R2D2LeftLeg(), new R2D2RightLeg(),
                new TransformerLeftLeg(), new TransformerRightLeg()};
        for (int i = 0; i < legs.length; i++) {
            System.out.println(legs[i].march());
        }

        Robot robot1 = new RobotImplement(95, "R1", r2D2Body,transformerHead);
        Robot robot2 = new RobotImplement(11, "R2", transformerBody,r2D2Head);

    }
}
