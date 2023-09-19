public class CodingHoursCalculator {
    public static void main(String[] args) {
        int dailyCodingHours = 6;
        int workdaysPerWeek = 5;
        int weeksInSemester = 17;
        int averageWorkHoursWeekly = 52;
        int totalCodingHours = dailyCodingHours * workdaysPerWeek * weeksInSemester;
        int totalWorkHours = averageWorkHoursWeekly * weeksInSemester;

        double percentageCodingHours = ((double) totalCodingHours / totalWorkHours) * 100;

        System.out.println("Total hours spent on coding in a semester: " + totalCodingHours);
        System.out.println("Percentage of coding hours in the semester: " + percentageCodingHours + "%");
    }
}