package uni.fmi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uni.fmi.models.InsertGradesScreenModel;

public class InsertGradesStep {

    InsertGradesScreenModel screenModel = new InsertGradesScreenModel();

    @Given("^Преподавателя отваря екран за въвеждане на оценка$")
    public void openScreen() throws Throwable {
        screenModel.openScreen();
    }

    @When("^Преподавателя въведе предмет по който преподава \"([^\"]*)\"$")
    public void insertSubjectTeach(String subjectTeach) throws Throwable {
        screenModel.addSubjectTeach(subjectTeach);
    }

    @When("^Въведе предмет по който нанася оценка \"([^\"]*)\"$")
    public void insertSubjectGrade(String subjectGrade) throws Throwable {
        screenModel.addSubjectGrade(subjectGrade);
    }

    @When("^Въведе ученик с първо име \"([^\"]*)\" и фамилно име \"([^\"]*)\"$")
    public void insertStudent(String firstName, String lastName) throws Throwable {
        screenModel.addStudentName(firstName, lastName);
    }

    @When("^Въведе оценка \"([^\"]*)\"$")
    public void insertGrade(String grade) throws Throwable {
        screenModel.addGrade(grade);
    }

    @When("^Натисна върху бутона за добавяне на оценката$")
    public void clickAddButton() throws Throwable {
        screenModel.clickAddButton();
    }

    @Then("^Вижда съобщение \"([^\"]*)\"$")
    public void checkMessage(String message) throws Throwable {
        String resultMessage = screenModel.getMessage();
        Assert.assertEquals(message, resultMessage);
    }

}
