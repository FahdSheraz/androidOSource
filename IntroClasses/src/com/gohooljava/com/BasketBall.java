package com.gohooljava.com;

/**
 * Created by paulodichone on 3/3/17.
 */
public class BasketBall extends Ball {
    //Properties
    private boolean isNBA;
    private int capacity;



    //Behaviors
    public boolean isNBA() {

        if (isNBA == true) {
            return  true;
        }else {
            return false;
        }

    }

    //Override
    public void bounce() {
        System.out.println("Basketball Bouncing");

    }

}
