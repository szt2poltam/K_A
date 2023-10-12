class Person {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Person(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public void printPerson() {
        System.out.println("Vezetéknév: " + firstName);
        System.out.println("Keresztnév: " + lastName);
        System.out.println("Születési idő: " + birthDate);
    }
}




class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Születési idő: " + year + "-" + month + "-" + day + "\n";
    }

    public void printDate() {
        System.out.println("Jelenlegi dátum: " + year + "-" + month + "-" + day + "\n");
    }
}

class Animal {

    private int numberOfLegs;
    private int numberOfEyes;
    private String name;

    public Animal(int numberOfLegs, int numberOfEyes, String name) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.name = name;
    }

    public void printAnimal() {
        System.out.println("Lábak száma: " + numberOfLegs);
        System.out.println("Szemek száma: " + numberOfEyes);
        System.out.println("Név: " + name);
    }
}



public class Main {
    public static void main(String[] args) {

        Date rajmisBirthDate = new Date(2003, 04, 26);
        Person rajmi = new Person("Rajmund", "Maróti", rajmisBirthDate);
        rajmi.printPerson();

        Date most = new Date(2023, 10, 12);
        most.printDate();

        Animal kutya = new Animal (4, 2, "Lujza");
        kutya.printAnimal();
    }
}
