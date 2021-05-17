package day16.employer;

public class Employer {
    String name;
    int age;
    String address;
    String workPlace;

    public Employer(String name){
        this.name = name;
    }
    public Employer(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Employer(String name, int age, String address, String workPlace){
        this.name = name;
        this.age = age;
        this.address = address;
        this.workPlace = workPlace;
    }
    public void print(){
        System.out.println("name is : " + name + "  age : " + age + "  address is : " + address);
    }
}