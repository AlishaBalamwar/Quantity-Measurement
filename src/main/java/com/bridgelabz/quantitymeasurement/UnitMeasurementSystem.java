package com.bridgelabz.quantitymeasurement;

/**
 * @author Hp
 */
public class UnitMeasurementSystem {

    private MeasurementUnits unit;
    private double value;

    public UnitMeasurementSystem(MeasurementUnits unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * @param thatUnit -> is the reference where we convert and compare the values
     * @return
     */
    public boolean compare(UnitMeasurementSystem thatUnit) {
        if (this.unit.equals(thatUnit.unit))
            return this.equals(thatUnit);
        return Double.compare(this.unit.convertToBaseUnit(this.value), thatUnit.unit.convertToBaseUnit(thatUnit.value)) == 0;
    }

    /**
     * @param thatUnit-> it is the reference
     *                   Here we compare the class and does it support addition
     * @return-> Returns the added value in base unit
     */
    public double add(UnitMeasurementSystem thatUnit) {
        if (this.unit.getClass() != thatUnit.unit.getClass() ||
                !this.unit.supportAddition() || !thatUnit.unit.supportAddition())
            return 0.0;
        return this.unit.convertToBaseUnit(this.value) +
                thatUnit.unit.convertToBaseUnit(thatUnit.value);
    }

    /**
     * @param o -> object
     * @return ->Returns boolean value by comparing objects. If the objects are
     * same it returns true.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurementSystem unitMeasurementSystem = (UnitMeasurementSystem) o;
        return Double.compare(unitMeasurementSystem.value, value) == 0 && unit == unitMeasurementSystem.unit;
    }
}