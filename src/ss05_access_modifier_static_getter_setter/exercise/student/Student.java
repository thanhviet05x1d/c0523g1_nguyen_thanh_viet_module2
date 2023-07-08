package ss05_access_modifier_static_getter_setter.exercise.student;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // public: truy cập được
    // private: không truy cập được
    // protected: truy cập được
    // default: truy cập được


    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return this.classes;
    }

}
