package day16.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student [] array = new Student[5];
        array[0]=new Student(15,"Ando",15);
        array[1]=new Student(14,"Rafo",16);
        array[2]=new Student(18,"Hamo",14);
        array[3]=new Student(25,"Gago",12);
        array[4]=new Student(22,"Anun",19);
        Sort sort = new Sort();
        sort.sortName(array);
        sort.sortAge(array);
        sort.sortWeight(array);
    }
}
