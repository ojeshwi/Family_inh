
package model;

        import java.util.ArrayList;

public class Children {
    public Children(String name, int grade, int age){
        name = name;
        id = id;
        age = age;
    }
    String name;
    int grade;
    int age;
    ArrayList hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList hobbies) {
        this.hobbies = hobbies;

        public Children(String name, int grade, int age, ArrayList hobbies) {
            this.name = name;
            this.grade = grade;
            this.age = age;
            this.hobbies = hobbies;
        }
    }
}

