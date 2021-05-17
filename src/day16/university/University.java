package day16.university;

import java.util.Scanner;

public class University {
    String name;
    int countOfStudents;
    int maxCountOfStudents;
    int maxAgeOfStudent;
    int minAgeOfStudent;

    public University(String name, int countOfStudents, int maxCountOfStudents, int maxAgeOfStudent, int minAgeOfStudent) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.maxAgeOfStudent = maxAgeOfStudent;
        this.minAgeOfStudent = minAgeOfStudent;
    }
    public void printInfo(){
        System.out.println("name is : " + name + "\n" + "count Of Students : " + countOfStudents + "\n" + "max Count OfStudents : " + maxCountOfStudents + "\n" + "max Age Of Student : " + maxAgeOfStudent + "\n" + "min Age Of Student : " + minAgeOfStudent);
    }
    public boolean checkAge(int age){
        if(age <= maxAgeOfStudent && age >= minAgeOfStudent){
            return true;
        }
        return false;
    }

    public void admission(){
        printInfo();
        Scanner scanner = new Scanner(System.in);
        int masnagitutyun, age;
        System.out.println("@ntreq masnagitutyunn");
        System.out.println("Applied Mathematics -- 1");
        System.out.println("Computer science -- 2");
        System.out.println("hogebanutyun -- 3");
        System.out.print("tarberak : ");
        masnagitutyun = scanner.nextInt();
        if(masnagitutyun >= 1 && masnagitutyun <= 3){
            System.out.print("input your age : ");
            age = scanner.nextInt();
            if (checkAge(age)){
                register();
            }else {
                System.out.println("voch hamapatasxan tariq");
            }
        }else {
            System.out.println("chunenq aydpisi tarberak");
        }
        display();
    }
    public void register(){
        ++countOfStudents;
    }
    public void display(){
        System.out.println("name is : " + name + "\n" + "count Of Students : " + countOfStudents + "\n" + "max Count OfStudents : " + maxCountOfStudents + "\n" + "max Age Of Student : " + maxAgeOfStudent + "\n" + "min Age Of Student : " + minAgeOfStudent);
    }
}