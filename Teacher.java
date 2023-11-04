public class Teacher extends Person {
    private String specialization;
    public Teacher(int id, String name, int age, boolean parent_permission, String specialization) {
        super(id, name, age, parent_permission);
        this.specialization = specialization;
    }
        public boolean can_use_services(){
            return true;

    }
}
