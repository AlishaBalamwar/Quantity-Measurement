package com.bridgelabz.quantitymeasurement;

import java.util.function.Function;

public enum Temperature implements MeasurementUnits {
    FAHRENHEIT(true), CELCIUS(false);

    final Function<Double, Double> degFToCelcius = (Double degF) -> (degF.doubleValue() - 32) * 5 / 9;
    final Function<Double, Double> degCToCelcius = (Double degC) -> degC.doubleValue();

    final Function<Double, Double> convertionValue;

    private Temperature(Boolean isFahrenhiet) {
        if (isFahrenhiet)
            this.convertionValue = degFToCelcius;
        else
            this.convertionValue = degCToCelcius;
    }

    /**
     * @param value-> getting value
     * @return -> convert to base unit and return
     */
    @Override
    public double convertToBaseUnit(double value) {
        return convertionValue.apply(value);
    }

    /**
     * @return-> Returns that it support addition
     */
    @Override
    public boolean supportAddition() {
        return false;
    }
}
