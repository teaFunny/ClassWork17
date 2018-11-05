package com.alevel;

public class Car {
    Wheel[] wheels= new Wheel[4];
    Motor motor;

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    boolean canDrive(){
        return (motor.getOilLevel() > 10 && motor.getTemperature() < 450);
    }
}
