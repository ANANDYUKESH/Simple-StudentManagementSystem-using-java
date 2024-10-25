import java.util.*;

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();

    // Student class
    static class Student {
        private String id;
        private String name;
        private int age;

        public Student(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Age: " + age;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;

        while (ch != 3) {
            disme();
            System.out.println("Enter number from above choice:");
                ch = sc.nextInt();
                sc.nextLine(); // Consume newline left-over
                switch (ch) {
                    case 1:
                        adds(sc);
                        break;
                    case 2:
                        vis();
                        break;
                    case 3:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
            }

    // Display menu
    public static void disme() {
        System.out.println("Welcome to the Student Management System");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Exit");
    }

    // Add student method
    private static void adds(Scanner sc) {
        System.out.println("Enter Student ID:");
        String id = sc.nextLine();

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student Age:");
        int age = sc.nextInt();


        Student s = new Student(id, name, age);
        students.add(s);
        System.out.println("Student added successfully..!");
    }

    // View students method
    private static void vis() {
        System.out.println("All Students:");
        for (Student a : students) {
            System.out.println(a);
        }
    }
}
