package day17.person1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName();
        person.setLastName();
        person.setPassportId();
        person.setAge();
        person.setSex();
        person.setNationality();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getPassportId());
        System.out.println(person.getAge());
        System.out.println(person.getSex());
        System.out.println(person.getNationality());
        person.display();
    }
}
