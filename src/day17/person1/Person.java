package day17.person1;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String sex;
    private String nationality;

    public Person(String firstName, String lastName, String passportId, int age, String sex, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }

    public Person() {


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setFirstName() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("firstName : ");
            firstName = scanner.next();
        }while (firstName.length() < 3 || firstName.length() > 15);
    }

    public void setLastName() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("lastName : ");
            lastName = scanner.next();
        }while (lastName.length() < 6 || lastName.length() > 20);
    }

    public void setPassportId() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("passportId : ");
            passportId = scanner.next();
        }while (passportId.length() != 8 || !(passportId.substring(2, passportId.length()).replaceAll("[0-9]","").equals("")) || !(passportId.substring(0, 2).equals("AN")));
    }

    public void setAge() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("age : ");
            age = scanner.nextInt();
        }while (age < 18 || age > 99);
    }

    public void setSex() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("sex : ");
            sex = scanner.next();
        }while (!(sex.compareToIgnoreCase("male") == 0 || sex.compareToIgnoreCase("female") == 0));
    }

    public void setNationality() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("nationality : ");
            nationality = scanner.next();
        }while (nationality.equals(null));
    }
    void display(){
        System.out.println(firstName + "  " + lastName + "  " + passportId + "  " + age + "  " + sex + "  " + nationality);
    }
}
