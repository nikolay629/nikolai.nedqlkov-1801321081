package uni.pl.fmi.service;

import uni.pl.fmi.Journal;
import uni.pl.fmi.Student;
import uni.pl.fmi.Subject;
import uni.pl.fmi.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InsertGradeService {

    public static String Insert(String subjectTeach, String subjectGrade, String firstName, String lastName, String grade) {

        List<Student> studentList = GetStudent();

        if(grade.isEmpty()){
            return "Полето за оценката е празно, въведете оценка между 2 и 6";
        }
        int gradeNumber = Integer.parseInt(grade);
        if(gradeNumber > 6){
            return "Оценката е по-голяма от 6, въведете оценка между 2 и 6";
        }
        if(gradeNumber < 2){
            return "Оценката е по-малка от 2, въведете оценка между 2 и 6";
        }
        if(!subjectTeach.equals(subjectGrade)){
            return "Нямате право да добавяте оценки по този предмет";
        }
        boolean checkStudent = studentList.stream().anyMatch(student ->
            student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)
        );

        if(!checkStudent){
            return "Няма такъв потребител, моля опитайте пак!";
        }
        return "Успешно въведохте оценката";
    }

    public static List<Student> GetStudent(){
        Student student = new Student();
        student.setFirstName("Иван");
        student.setLastName("Иванов");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        return studentList;
    }

}
