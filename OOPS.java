public class OOPS {

    public static class Student {
        String name;
        int roll;
        double CGPA;
    }
    public static void main(String[] args) {

        
        Student s1 = new Student(); // s1 is a student 1 object
        s1.name = "Saransh Raj"; // student 1 assigning name
        s1.roll = 23;   // student 1 assigning roll
        s1.CGPA = 8.01; // student 1 assigning CGPA

        System.out.println("Name : "+s1.name + ", roll : "+s1.roll+", CGPA : "+s1.CGPA);

    }
}
