package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Calculator {

    public double sum(List<? extends Number> array) {
        double result = 0.0;
        for (Number number : array) {
            result += number.doubleValue();
        }
        return result;
    }

    public double multiply(List<? extends Number> array) {
        double result = 1.0;
        for (Number number : array) {
            result *= number.doubleValue();
        }
        return result;
    }

    public double division(List<? extends Number> array) {
        double result = array.get(0).doubleValue();
        for (Number number : array) {
            result /= number.doubleValue();
        }
        return result;
    }

    public String binary(List<? extends Number> array) {
        StringBuilder binaryResult = new StringBuilder();
        for (Number number: array) {
            if (number instanceof Integer){
                binaryResult.append(Integer.toBinaryString(number.intValue())).append(", ");
            }
/*
            Если число имеет дробную часть, например это double/float, то мы сначала переводим целую часть в
            двоич.систему, потом переводим дробную часть. Для того чтобы
*/

            else if (number instanceof Double) {
                int intPart = (int) number.doubleValue();
                double doublePart = number.doubleValue() - intPart;

                binaryResult.append(Integer.toBinaryString(intPart)).append(".");
                StringBuilder doubleStringPart = new StringBuilder();
                for (int i = 0; i < 8; i++) {
                    doublePart *= 2;
                    doubleStringPart.append((int) doublePart);
                    doublePart -= (int) doublePart;
                }
                binaryResult.append(doubleStringPart).append(", ");
            }
        }
        return binaryResult.toString();
    }
}
