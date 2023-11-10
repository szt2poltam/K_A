import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
    }
}

class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +
                " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}

class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super("Jane Doe", 30, "female");
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +
                " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}

class Mentor extends Person {
    String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super("Jane Doe", 30, "female");
        this.level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
    }
}

class Cohort {
    String name;
    List<Student> students;
    List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " +
                mentors.size() + " mentors.");
    }
}

public class Campus {
    public static void main(String[] args) {
        Cohort awesomeCohort = new Cohort("AWESOME");

        Student student1 = new Student("Mark", 46, "male", null);
        student1.getGoal();
        awesomeCohort.addStudent(student1);

        Student student2 = new Student();
        student2.getGoal();
        awesomeCohort.addStudent(student2);

        Student student3 = new Student("John Doe", 20, "male", "BME");
        student3.getGoal();
        student3.introduce();
        awesomeCohort.addStudent(student3);

        Student student4 = new Student("Jane Doe", 30, "female", "The School of Life");
        student4.getGoal();
        student4.introduce();
        student4.skipDays(3);
        awesomeCohort.addStudent(student4);

        Mentor mentor1 = new Mentor("Gandhi", 148, "male", "senior");
        mentor1.getGoal();
        mentor1.introduce();
        awesomeCohort.addMentor(mentor1);

        Mentor mentor2 = new Mentor();
        mentor2.getGoal();
        mentor2.introduce();
        awesomeCohort.addMentor(mentor2);

        Sponsor sponsor1 = new Sponsor("Jane Doe", 30, "female", "Google");
        sponsor1.introduce();
        sponsor1.hire();
        sponsor1.getGoal();

        Sponsor sponsor2 = new Sponsor();
        sponsor2.introduce();
        sponsor2.hire();
        sponsor2.getGoal();

        awesomeCohort.info();
    }
}
