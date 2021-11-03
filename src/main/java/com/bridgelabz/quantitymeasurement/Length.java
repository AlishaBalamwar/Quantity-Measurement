package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

/**
 * @author Hp
 */
public class Length {

    enum Unit {FEET, INCH};

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
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
        Length length = (Length) o;
        return java.lang.Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}