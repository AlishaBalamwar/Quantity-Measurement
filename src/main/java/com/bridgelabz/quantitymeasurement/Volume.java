package com.bridgelabz.quantitymeasurement;

public enum Volume implements MeasurementUnits {
    GALLON(3.78), LITRE(1.0), MILILITRES(0.001);

    private final double convertionValue;

    private Volume(double convertionValue) {
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
