package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
        TODO 1)расширить класс калькулятор на умножение
             2)расширить класс калькулятор на деление
             3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт -
             тут необходимо подумать как наилучшим образом реализовать, что будет если будут приниматься
             округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))

*/
//        Суммирование
        System.out.println("<---Суммирование--->");
        List<Integer> arrayInt = new ArrayList<>(Arrays.asList(1, 23, 22));
        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(arrayInt) = " + calculator.sum(arrayInt));
        List<Double> arrayDouble = new ArrayList<>(Arrays.asList(1.23,2.45,3.69,14.8905,5.0,6.0,7.0,8.0,9.1,10.9));
        System.out.println("calculator.sum(arrayDouble) = " + calculator.sum(arrayDouble));

//        Умножение
        System.out.println("<---Умножение--->");
        System.out.println("calculator.multiply(arrayInt) = " + calculator.multiply(arrayInt));
        System.out.println("calculator.multiply(arrayDouble) = " + calculator.multiply(arrayDouble));

//        Деление
        System.out.println("<---Деление--->");
        System.out.println("calculator.division(arrayInt) = " + calculator.division(arrayInt));
        System.out.println("calculator.division(arrayDouble) = " + calculator.division(arrayDouble));
//        Бинарный перевод
        System.out.println("<---Бинарный перевод--->");
        System.out.println("calculator.binary(arrayInt) = " + calculator.binary(arrayInt));
        System.out.println("calculator.binary(arrayDouble) = " + calculator.binary(arrayDouble));
    }
}