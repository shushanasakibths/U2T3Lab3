import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = scan.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();
        System.out.println("Please enter your grad year: ");
        int gradYear = scan.nextInt();

        Student student1 = new Student(firstName, lastName, gradYear);


        int userOption = 0;

        // loop until user choose option 6
        while (userOption != 6) {
            System.out.println();
            System.out.println("Main menu:");
            System.out.println("1. Update graduation year");
            System.out.println("2. Add test score");
            System.out.println("3. View test average");
            System.out.println("4. View highest score");
            System.out.println("5. View all student info");
            System.out.println("6. Exit");

            System.out.print("Enter option: ");
            userOption = scan.nextInt();
            scan.nextLine();

            if (userOption == 1) {
                System.out.println("Enter your grad year: ");
                gradYear = scan.nextInt();
                scan.nextLine();
                student1.setGradYear(gradYear);
                student1 = new Student(firstName, lastName, gradYear);
            }
            if (userOption == 2) {
                System.out.println("Enter new test score: ");
                double testScore = scan.nextDouble();
                scan.nextLine();
                student1.addTestScore(testScore);
            }
            if (userOption == 3) {
                System.out.println("Average Test Score: " + student1.averageTestScore());
            }
            if (userOption == 4) {
                System.out.println("Highest test score: "  + student1.getHighestTestScore());
            }
            if (userOption == 5) {
                student1.printStudentInfo();
            }
            if (userOption != 1 && userOption != 2 && userOption != 3 && userOption != 4 && userOption != 5  && userOption != 6) {
                System.out.println("Invalid option, try again!");
            }
        }
        System.out.println("Goodbye!");
        }
}
