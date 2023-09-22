public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Jackson", 2.1);
        Student student2 = new Student("Michal", 1.3);
        student1.isStudentPassing();
        student2.isStudentPassing();
    }
}
