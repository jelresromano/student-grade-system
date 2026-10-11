public class Student {
    String name;
    double grade1, grade2, grade3;

    public Student(String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double calculateGrades() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public void checkResult() {
        if (calculateGrades() >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public void displayInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Average: " + calculateGrades());
    }
}
