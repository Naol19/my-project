 class Person {
     int id;
     String name="unknown";
     int age;
     boolean parent_permission=true;
    //constructor

    public Person(int id, String name, int age, boolean parent_permission) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean of_age(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public boolean can_use_services() {
        if (age >= 18 || parent_permission == true) {
        }
        return true;
    }
}

