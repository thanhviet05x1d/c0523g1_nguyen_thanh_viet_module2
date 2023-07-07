package ss04_lop_doi_tuong_java.exercise;

import java.util.Scanner;

public class QuadraticEquationV {
    private double a;
    private double b;
    private double c;

    public QuadraticEquationV() {
    }

    public QuadraticEquationV(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-this.b + Math.pow(getDiscriminant(), 0.5) / (2 * this.a));
        } else {
            return 0;
        }
    }
    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-this.b - Math.pow(getDiscriminant(), 0.5) / (2 * this.a));
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Mời bạn nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Mời bạn nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquationV quadraticEquationV = new QuadraticEquationV(a, b, c);
        if (quadraticEquationV.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + quadraticEquationV.getRoot1());
            System.out.println("x2 = " + quadraticEquationV.getRoot2());
        } else if (quadraticEquationV.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm x1=x2=" + quadraticEquationV.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
