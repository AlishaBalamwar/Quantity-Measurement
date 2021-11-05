package com.bridgelabz.quantitymeasurement;

/**
 * Defining an interface
 */
public interface MeasurementUnits {
    public double convertToBaseUnit(double value);

    public boolean supportAddition();
}
