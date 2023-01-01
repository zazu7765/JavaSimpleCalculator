package org.zsazu;

public class Fraction {

    private final int numerator;
    private final int denominator;
    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public String toString(){
        return numerator+"/"+denominator;
    }

    public int numerator(){
        return numerator;
    }
    public int denominator(){
        return denominator;
    }
    private int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }
    public Fraction add(Fraction other){
        // calculate numerator by multiplying the other's denominator
        int newNumerator = this.numerator*other.denominator + other.numerator*this.denominator;
        // denominators are multiplied
        int newDenominator = this.denominator * other.denominator;
        // reduce fraction to it's lowest possible form
        int factor = gcd(newNumerator, newDenominator);
        // return new fraction
        return new Fraction(newNumerator/factor, newDenominator/factor);
    }
}
