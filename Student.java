
public class Student {
    private String name;
    private int age;
    private double gpa;

public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGpa() {

        if (gpa > 3) {
            return " excellent";
        }

        else if (gpa <= 3) {
            return "good";

        }

        else
            return "needs improvment";

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
        if (gpa <= 4.0 && gpa >= 0.0) {
            this.gpa = gpa;
        } else
            System.out.println("error: gpa must be between 0 and 4");
    }

}
