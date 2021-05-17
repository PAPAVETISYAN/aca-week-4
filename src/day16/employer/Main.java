package day16.employer;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Employer("Pap", 25);
        Employer employer1 = new Employer("Narek", 26, "Erevan", "ACA");
        employer.print();
        System.out.println();
        employer1.print();
    }
}
