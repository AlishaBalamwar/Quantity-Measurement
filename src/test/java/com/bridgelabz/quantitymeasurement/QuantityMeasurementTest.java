package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenTwoSameFeetValueObject_ifEqual_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET, 0.0);
        Length length2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void whenGivenTwoDifferentFeetValueObject_shouldReturnFalse() {
        Length length1 = new Length(Length.Unit.FEET, 0.0);
        Length length2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(length1, length2);
    }
}
