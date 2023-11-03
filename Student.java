public class Student extends Person {
    public String getClassroom() {
        return classroom;
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    private String classroom;
    public Student(int id, String name, int age, boolean parent_permission) {
        super(id, name, age, parent_permission);
    }
}

