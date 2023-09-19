import java.util.Scanner;

public class VariableOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int output1 = 0;
        String output2 = "";
        int output3 = 10;
        String output4 = "";



        System.out.print("Please enter an integer as variable 'a': ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            output1++;
        }

        System.out.print("Please enter an integer between 0 and 30 as variable 'b': ");
        int b = scanner.nextInt();
        if (b >= 10 && b <= 20) {
            output2 = "Sweet!";
        } else if (b < 10) {
            output2 = "Less!";
        } else {
            output2 = "More!";
        }

        System.out.print("Please enter an integer between 0 and 100 as variable 'credits': ");
        int credits = scanner.nextInt();

        System.out.print("Please enter a boolean (true/false) as variable 'isBonus': ");
        boolean isBonus = scanner.nextBoolean();
        if (credits >= 50 && !isBonus) {
            output3 -= 2;
        } else if (credits < 50 && !isBonus) {
            output3--;
        }

        System.out.print("Please enter an integer between 0 and 50 as variable 'd': ");
        int d = scanner.nextInt();
        System.out.print("Please enter an integer between 0 and 500 as variable 'time': ");
        int time = scanner.nextInt();
        if (d % 4 == 0 && time <= 200) {
            output4 = "Check";
        } else if (time > 200) {
            output4 = "Time out";
        } else {
            output4 = "Run Forest Run!";
        }

        System.out.println("Output1: " + output1);
        System.out.println("Output2: " + output2);
        System.out.println("Output3: " + output3);
        System.out.println("Output4: " + output4);

        scanner.close();
    }
}