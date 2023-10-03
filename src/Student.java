public class Student {


    /* Instance Variables */
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;
    private int studentAge;

    private double highestTestScore;


    /* Constructor; see Note 1 below */
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0;
        testScoreCount = 0;
        highestTestScore = 0;
    }


    /* Getter Methods */
// Returns firstName
    public String getFirstName() {
        return firstName;


    }


    // Returns lastName
    public String getLastName() {
        return lastName;
    }

    public double getHighestTestScore() {
        return highestTestScore;
    }

    /* Setter Methods */
// Sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }


    /* All Other Methods */
// Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public void addTestScore(double newTestScore) {
        testScoreCount++;
        accumulatedTestScores += newTestScore;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }


    // Returns true if the student’s average test score is greater
// than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        return averageTestScore() >= 65;
    }


    // Returns the Student’s average test score as the
// quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        double averageTestScore = accumulatedTestScores / testScoreCount;
        return averageTestScore;
    }


    // NEW METHOD
    public boolean meetTestRequirement() {
        return testScoreCount >= 5;
    }


    // NEW METHOD
    public void studentAge(int newStudentAge) {;
        studentAge = newStudentAge;
    }


    // this method prints the students full name, grad year, test average,
// and whether they are passing (see Note 3 below)
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Highest test score: "  + highestTestScore);
        System.out.println("Meets test requirement: " + meetTestRequirement());
        System.out.println("Is passing: " + isPassing());
    }
}


