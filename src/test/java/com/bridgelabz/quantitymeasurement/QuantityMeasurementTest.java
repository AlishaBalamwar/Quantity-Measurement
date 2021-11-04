package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenTwoSameFeetValueObject_ifEqual_shouldReturnTrue() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.FEET, 0.0);
        Assert.assertEquals(unitMeasurementSystem1, unitMeasurementSystem2);
    }

    @Test
    public void whenGivenTwoDifferentFeetValueObject_shouldReturnFalse() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assert.assertNotEquals(unitMeasurementSystem1, unitMeasurementSystem2);
    }

    @Test
    public void whenGivenTwoSameInchValueObjects_shouldReturnTrue() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        Assert.assertEquals(unitMeasurementSystem1, unitMeasurementSystem2);
    }

    @Test
    public void whenGivenTwoDifferentInchObjects_shouldReturnFalse() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.INCH, 1.0);
        Assert.assertNotEquals(unitMeasurementSystem1, unitMeasurementSystem2);
    }

    @Test
    public void whenGiven1FeetAnd1Feet_shouldReturnEquals() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assert.assertEquals(unitMeasurementSystem1, unitMeasurementSystem2);
    }

    @Test
    public void whenGiven0FeetAnd0Inch_shouldReturnEquals() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        Assert.assertEquals(unitMeasurementSystem1, unitMeasurementSystem2);
    }

    @Test
    public void whenGivenFeetAndInchObjects_shouldNotEquals() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.INCH, 1.0);
        unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertNotEquals(unitMeasurementSystem1, unitMeasurementSystem2);
    }

    @Test
    public void whenGivenFeetAnd12InchObjects_shouldTrue() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.INCH, 12.0);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void whenGiven3FeetAnd1Yard_shouldReturnTrue() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 3.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void whenGiven0FeetAnd0Yard_shouldReturnTrue() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.YARD, 0.0);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void whenGiven1FeetAnd1Yard_shouldReturnFalse() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void whenGiven1InchAnd1Yard_shouldReturnFalse() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.INCH, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void whenGiven36InchAnd1Yard_shouldReturnTrue() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.INCH, 36.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertTrue(compareCheck);
    }
}
