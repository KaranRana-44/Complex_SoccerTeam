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
        double term1= this.real*other.real-this.imaginary*other.imaginary;
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

    public static void main(String[] args) {
        Complex c1= new Complex(8.0,6.0);
        Complex c2= new Complex(9.0,-6.0);
        Complex c3= new Complex(-1.0,-2.0);
        Complex c4= new Complex(-0.5,8.0);
        Complex c5= new Complex(0.3);
        Complex c6= new Complex(0,-4);
        System.out.println("abs");
        System.out.println("complex number "+ c1+" abs is "+c1.abs());
        System.out.println("complex number "+ c3+" abs is "+c3.abs());
        System.out.println("complex number "+ c5+" abs is "+c5.abs());
        System.out.println("add");
        System.out.println(c2+" + "+ c3 + " = " + c2.add(c3));
        System.out.println(c2+" + 3.5" + " = " + c2.add(3.5));
        System.out.println(c3+" + "+ c1 + " = " + c3.add(c1));
        System.out.println("multiply");
        System.out.println(c4+" * "+c5+ " = "+c4.multiply(c5));
        System.out.println(c6+" * "+c1+ " = "+c6.multiply(c1));
        System.out.println(c4+" * 2.3" + " = "+c4.multiply(2.3));
        System.out.println(c6+" * 4.4" + " = "+c6.multiply(4.4));


        // write your code here
    }

}
