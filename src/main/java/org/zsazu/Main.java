package org.zsazu;

public class Main {
    public static void main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();
        try {
            CarLoanCalculator car = new CarLoanCalculator(10000, 3, 5, 2000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Fraction half = new Fraction(1,2);
        Fraction third = new Fraction(1,3);
        System.out.println(half.add(third));
        System.out.println(calculator.add(5,7));
        System.out.println(calculator.subtract(45,11));
        System.out.println(calculator.multiply(half.denominator(),third.numerator()));
    }
}