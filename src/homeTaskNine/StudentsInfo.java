package homeTaskNine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class StudentsInfo {

    public static void main(String[] args) {
        List<Student> groupOfStudents = new ArrayList<>();
        groupOfStudents.add(new Student("Anastasia", "Parkhomchik", 22, 8.8));
        groupOfStudents.add(new Student("Mariya", "Kamliuk", 22, 9.5));
        groupOfStudents.add(new Student("Dmitriy", "Nasevich", 27, 8.0));
        groupOfStudents.add(new Student("Anton", "Podobed", 24, 8.4));
        groupOfStudents.add(new Student("Mariya", "Balabanovich", 22, 7.8));

        System.out.println(findBestStudent(groupOfStudents).toString());
        showResultsOfAllSorts(groupOfStudents);
    }

    private static Student findBestStudent(List<Student> students) {
        ListIterator<Student> listIterator = students.listIterator();
        Student bestStudent = new Student();

        while (listIterator.hasNext()) {
            Student currentStudent = listIterator.next();
            if (currentStudent.getAverageMark() > bestStudent.getAverageMark()) {
                bestStudent = currentStudent;
            }
        }

        return bestStudent;
    }

    private static class StudentFirstNameComparator implements Comparator<Student> {

        private StudentSecondNameComparator studentSecondNameComparator = new StudentSecondNameComparator();

        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getFirstName().compareTo(o2.getFirstName());
            if (result == 0) {
                result = studentSecondNameComparator.compare(o1, o2);
            }

            return result;
        }

    }

    private static class StudentSecondNameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getSecondName().compareTo(o2.getSecondName());
        }

    }

    private static class StudentAgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge().compareTo(o2.getAge());
        }

    }

    private static class StudentAverageMarkComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.getAverageMark().compareTo(o1.getAverageMark());
        }

    }

    private static void showResultsOfAllSorts(List<Student> groupOfStudents) {
        groupOfStudents.sort(new StudentFirstNameComparator());
        System.out.println("\n1-st + 2-nd name sort:");
        for (Student student : groupOfStudents) {
            System.out.println(student.toString());
        }

        groupOfStudents.sort(new StudentAgeComparator());
        System.out.println("\nAge sort:");
        for (Student student : groupOfStudents) {
            System.out.println(student.toString());
        }

        groupOfStudents.sort(new StudentAverageMarkComparator());
        System.out.println("\nAverage mark sort:");
        for (Student student : groupOfStudents) {
            System.out.println(student.toString());
        }
    }
}