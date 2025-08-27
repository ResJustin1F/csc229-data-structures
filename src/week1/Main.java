package week1;

class Person {
    String name; 
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    
}

class Student extends Person{

    String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public
    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I am a student of " + major + ".");
    }


}
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", 20);
        p.introduce();

        Student s = new Student("Bob", 21, "Computer Science");
        s.introduce();
    }
}
