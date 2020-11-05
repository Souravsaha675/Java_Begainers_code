package com.challenge;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void acclerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop();
            changedGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changedGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changedGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changedGear(3);
        } else {
            changedGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
