public class PersonalInformationPrinter {
    public static void main(String[] args) {

        String name = "Chin Lei";
        int age = 21;
        double heightInMeters = 1.65;
        boolean isMarried = false;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + heightInMeters + " meters");
        System.out.println("Marital Status: " + (isMarried ? "Married" : "Not Married"));
    }
}