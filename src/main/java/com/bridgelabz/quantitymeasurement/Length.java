package com.bridgelabz.quantitymeasurement;

/**
 * enum implements an interface
 */
public enum Length implements MeasurementUnits {
    FEET(12.0), INCH(1.0);

    private final double convertionValue;

    private Length(double convertionValue) {
        this.convertionValue = convertionValue;
    }

    /**
     * @param value-> getting value
     * @return -> convert to base unit and return
     */
    @Override
    public double convertToBaseUnit(double value) {
        return value * convertionValue;
    }
}
