package com.alevel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    private Car car;
    @Mock
    private Motor motor;

    @Before
    public void setUp(){
        car = new Car();
    }

    @Test
    public void canDriveTest() {
        when(motor.getOilLevel()).thenReturn(11);
        when(motor.getTemperature()).thenReturn(449);

        car.setMotor(motor);

        assertTrue(car.canDrive());
    }

    @Test
    public void canDriveTestShouldReturnFalseIfLowLevelOil() {
        when(motor.getOilLevel()).thenReturn(9);
        when(motor.getTemperature()).thenReturn(449);

        car.setMotor(motor);

        assertFalse(car.canDrive());
    }

}