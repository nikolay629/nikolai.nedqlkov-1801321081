package uni.fmi.models;


import uni.pl.fmi.service.InsertGradeService;

public class InsertGradesScreenModel {
    private String subjectTeach;
    private String subjectGrade;
    private String firstName;
    private String lastName;
    private String grade;
    private String message;

    public void openScreen() {
        System.out.println("Отворен е прозорец за въвеждане на оценка от преподавател");
    }

    public void addSubjectTeach(String subjectTeach) {
        this.subjectTeach = subjectTeach;
    }

    public void addSubjectGrade(String subjectGrade) {
        this.subjectGrade = subjectGrade;
    }

    public void addStudentName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addGrade(String grade) {
        this.grade = grade;
    }

    public void clickAddButton() {
        message = InsertGradeService.Insert(subjectTeach, subjectGrade, firstName, lastName, grade);
    }

    public String getMessage() {
        return message;
    }
}
