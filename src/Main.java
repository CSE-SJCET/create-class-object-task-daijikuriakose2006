public class Main {
     public static class Student {
        String name;
        int rollNumber;
        char grade;

        public void displayDetails() {
            System.out.println("Name = " + name);
            System.out.println("Roll Number = " + rollNumber);
            System.out.println("Grade = " + grade);
        }
    }
      public static void main(String[] args) {
        Student student = new Student();

        student.name = "Daiji";
        student.rollNumber = 29;
        student.grade = 'A';

        student.displayDetails();
    }
}
