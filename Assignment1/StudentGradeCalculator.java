public class StudentGradeCalculator {
    // Variable declarations
    private String studentName;
    private String major;
    private String course;
    private double grade1;
    private double grade2;
    private double grade3;
    private double average;

    // Constructor for student information
    public StudentGradeCalculator(String studentName, String major, String course, double grade1, double grade2, double grade3) {
        this.studentName = studentName;
        this.major = major;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.average = calculateAverage();
    }

    // Method to calculate average grade
    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }
    public static void main(String[] args) {
        // Create new StudentGradeCalculator object and declare values
        StudentGradeCalculator student1 = new StudentGradeCalculator("Jack Loomis", "Computer Science", "Microeconomics", 90, 70, 47);

        // Formatted string with student information
        System.out.printf("%s is majoring in %s and has an average grade of %f in %s.\n", student1.studentName, student1.major, student1.average, student1.course);
        
        // Formatted string for conditional pass/fail statement
        if (student1.average >= 70) {
            System.out.printf("%s is passing their %s course!\n", student1.studentName, student1.course);
        } else {
            System.out.printf("%s is failing their %s course! They should probably study more.\n", student1.studentName, student1.course);
        }
    }
}

