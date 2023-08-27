class Task {
    private String name;
    private int age;
    private char grade;

    public Student (String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

class Undergraduate extends Student {
    private String major;

    public Undergraduate(String name, int age, char grade, String major) {
        super(name, age, grade);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + " Undergraduate{" +
                "major='" + major + '\'' +
                '}';
    }
}

class Postgraduate extends Student {
    private String researchTopic;

    public Postgraduate(String name, int age, char grade, String researchTopic) {
        super(name, age, grade);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String toString() {
        return super.toString() + " Postgraduate{" +
                "researchTopic='" + researchTopic + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Undergraduate undergrad = new Undergraduate("Alice", 20, 'B', "Computer Science");
        Postgraduate postgrad = new Postgraduate("Bob", 25, 'A', "Machine Learning");

        System.out.println(undergrad);
        System.out.println(postgrad);
    }
}
