package kyu8;

import java.math.BigDecimal;

/**
 * This code does not execute properly. Try to figure out why. (empty code was on start)
 */
public class Multiply {

    public static Double multiply(Double a, Double b) {
        BigDecimal bdA = BigDecimal.valueOf(a);
        BigDecimal bdB = BigDecimal.valueOf(b);
        return bdA.multiply(bdB).doubleValue();
    }
}
