package homeTaskNine;

public class Student {

    private String firstName;
    private String secondName;
    private Integer age;
    private Double averageMark;

    public Student(String firstName, String secondName, Integer age, Double averageMark) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public Student() {
        this.firstName = "Empty";
        this.secondName = "Empty";
        this.age = 0;
        this.averageMark = 0.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }
}
