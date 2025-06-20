package lab4;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am a student at " + school + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("MOHSIN", 19, "SALIM HABIB University");
        student.introduce();
    }
}
