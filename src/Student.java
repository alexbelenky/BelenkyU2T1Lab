public class Student {
    private String name;
    private double gpa;

    public Student(String n, double g){
        name = n;
        gpa = g;
    }

    public void isStudentPassing(){
        if(gpa > 2.0) {
            System.out.println("The student : " + name + " is passing with a gpa of " + gpa);
        }else {
            System.out.println("The student : " + name + " is not passing with a gpa of " + gpa);
        }
    }
}
