package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,6,6,isManual,"racing",2);
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        int gear;
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            gear = 1;
            super.stop();
            super.changeGear(gear);

        }
        //for all other cases, change the gear accordingly
        if(newSpeed >=1 && newSpeed<= 50){
            gear = 1;
            super.changeGear(gear);
        }
        if(newSpeed >=51 && newSpeed<= 100){
            gear = 2;
            super.changeGear(gear);
        }
        if(newSpeed >=101 && newSpeed<= 150){
            gear = 3;
            super.changeGear(gear);
        }
        if(newSpeed >=151 && newSpeed<= 200){
            gear = 4;
            super.changeGear(gear);
        }
        if(newSpeed >=201 && newSpeed<= 250){
            gear = 5;
            super.changeGear(gear);
        }
        if(newSpeed > 250){
            gear = 6;
            super.changeGear(gear);
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
