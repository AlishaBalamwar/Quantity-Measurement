package com.bridgelabz.quantitymeasurement;

public enum Weight implements MeasurementUnits {
    KILOGRAM(1.0), MILLIGRAM(0.001), TONNE(1000.0);

    private final double convertionValue;

    private Weight(double convertionValue) {
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

    /**
     * @return-> Returns that it support addition
     */
    @Override
    public boolean supportAddition() {
        return true;
    }
}
