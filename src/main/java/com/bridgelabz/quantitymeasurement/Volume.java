package com.bridgelabz.quantitymeasurement;

public enum Volume {

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

    /**
     * @return-> Returns that it support addition
     */
    @Override
    public boolean supportAddition() {
        return true;
    }

}
