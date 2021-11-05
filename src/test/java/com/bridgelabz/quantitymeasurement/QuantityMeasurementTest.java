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
    public void whenGiven0FeetAnd0Inch_shouldReturnNotEquals() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        Assert.assertNotEquals(unitMeasurementSystem1, unitMeasurementSystem2);
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

    @Test
    public void whenGiven2InchAnd5Centimeter_shouldReturnFalse() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.CENTIMETER, 5.08);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void whenGiven2InchValues_whenAdded_shouldReturnEqual() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        double addedValue = unitMeasurementSystem1.add(unitMeasurementSystem2);
        Assert.assertEquals(4.0, addedValue, 0.1);
    }

    @Test
    public void whenGiven1feetAnd2InchValues_whenAdded_shouldReturnEqual() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        double addedValue = unitMeasurementSystem1.add(unitMeasurementSystem2);
        Assert.assertEquals(14.0, addedValue, 0.5);
    }

    @Test
    public void whenGiven1feetAnd1FeetValues_whenAdded_shouldReturnEqual() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        double addedValue = unitMeasurementSystem1.add(unitMeasurementSystem2);
        Assert.assertEquals(24.0, addedValue, 0.5);
    }

    @Test
    public void whenGivenCentimeterAndInchValues_whenAdded_shouldReturnEqual() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Length.CENTIMETER, 2.5);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        double addedValue = unitMeasurementSystem1.add(unitMeasurementSystem2);
        Assert.assertEquals(3.0, addedValue, 0.5);
    }

    @Test
    public void whenGivenGallonAndLitreValues_shouldReturnTrue() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void whenGivenMillilitreAndLitreValues_shouldReturnTrue() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void whenGivenGallonAndLitreValues_whenAdded_shouldReturnEqual() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Volume.LITRE, 3.78);
        double addedValue = unitMeasurementSystem1.add(unitMeasurementSystem2);
        Assert.assertEquals(7.57, addedValue, 0.4);
    }

    @Test
    public void whenGivenMillilitreAndLitreValues_whenAdded_shouldReturnEqual() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Volume.MILLILITRE, 1000.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Volume.LITRE, 1.0);
        double addedValue = unitMeasurementSystem1.add(unitMeasurementSystem2);
        Assert.assertEquals(2.0, addedValue, 0.1);
    }

    @Test
    public void whenGivenMilligramAndKilogramValues_shouldReturnTrue() {
        UnitMeasurementSystem unitMeasurementSystem1 = new UnitMeasurementSystem(Weight.KILOGRAM, 1.0);
        UnitMeasurementSystem unitMeasurementSystem2 = new UnitMeasurementSystem(Weight.MILLIGRAM, 1000.0);
        boolean compareCheck = unitMeasurementSystem1.compare(unitMeasurementSystem2);
        Assert.assertTrue(compareCheck);
    }
}
