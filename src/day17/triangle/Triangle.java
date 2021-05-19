package day17.triangle;

import java.util.Scanner;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void check(){
        if(isTriangleValid(sideA, sideB, sideC)){
            if(checkScuare(sideA, sideB, sideC)){
                if (sideA > sideC && sideA > sideB){
                    System.out.println("square=" + calculate(sideB, sideC));
                }else if (sideB > sideA && sideB > sideC){
                    System.out.println("square=" + calculate(sideA, sideC));
                }else {
                    System.out.println("square=" + calculate(sideA, sideB));
                }
            }else {
                System.out.println("perimetr=" + calculate(sideA, sideB, sideC));
            }
        }else {
            System.out.println("not valid triangle :");
        }
    }
    public double calculate(double sideA, double sideB){
        return (sideA * sideB) / 2;
    }
    public int calculate(int sideA, int sideB, int sideC){
        return (sideA + sideB + sideC);
    }
    public boolean checkScuare(int sideA, int sideB, int sideC){
        if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2) ||Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2) ||Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2)){
            return true;
        }
        return false;
    }
    private boolean isTriangleValid(int sideA, int sideB, int sideC){
        if(sideA+sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA){
            return true;
        }
        return false;
    }
    public void setSideA() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("A = ");
            sideA = scanner.nextInt();
        }while (sideA < 1 || sideA > 20);
    }

    public void setSideB() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("B = ");
            sideB = scanner.nextInt();
        }while (sideB < 1 || sideB > 20);
    }

    public void setSideC() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("C = ");
            sideC = scanner.nextInt();
        }while (sideC < 1 || sideC > 20);
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }
}
