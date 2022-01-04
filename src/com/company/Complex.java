package com.company;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double r, double i) {
        real = r;
        imaginary = i;

    }

    public Complex(double r) {
        this(r, 0.0);
    }

    public String toString()
    {

        String s= real+" + "+imaginary+"i";

        return s;
    }


    public double abs() {
        double r2 = Math.pow(this.real, 2);
        double i2 = Math.pow(this.imaginary, 2);
        return (Math.sqrt(r2 + i2));
    }

    public Complex add(Complex other){
        double rAdd= this.real+other.real;
        double iAdd= this.imaginary+other.imaginary;
        Complex c= new Complex(rAdd,iAdd);
        return c;
    }
    public Complex add(double s){
        double rAdd= this.real+s;
        double iAdd= this.imaginary;
        Complex c= new Complex(rAdd,iAdd);
        return c;
    }

    public Complex multiply(Complex other){
        double term1= this.real*other.real-this.imaginary+other.imaginary;
        double term2= this.real*other.imaginary+this.imaginary*other.real;
        Complex c= new Complex(term1,term2);
        return c;
    }
    public Complex multiply(double s){
        double term1= this.real*s;
        double term2= this.imaginary*s;
        Complex c= new Complex(term1,term2);
        return c;
    }

//TODO: Add more imaginary numbers to test//

    public static void main(String[] args) {
        Complex c1= new Complex(3,4);
        Complex c2= new Complex(5,8);
        System.out.println(c1.abs());
        System.out.println(c1.add(c2));
        System.out.println(c1.add(4.5));
        System.out.println(c1.multiply(c2));
        System.out.println(c1.multiply(4.5));

        // write your code here
    }

}
