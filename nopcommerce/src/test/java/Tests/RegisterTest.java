package Tests;

import org.testng.annotations.Test;

public class RegisterTest extends Base{

    public void enterGenderTests(String gender) {
        registerPage.gender(gender);
    }

    @Test(dependsOnMethods = "enterGenderTests")
    public void enterFirstNameTest(String name) {
        registerPage.enterUsername(name);
    }

    @Test(dependsOnMethods = "enterFirstNameTest")
    public void enterLastNameTest(String surname) {
        registerPage.enterLastName(surname);
    }

    @Test(dependsOnMethods = "enterLastNameTest")
    public void enterDateOfBirth(String dob) {
        registerPage.enterDateOfBirthDay(dob);
    }

    @Test(dependsOnMethods = "enterDateOfBirth")
    public void enterDateOfMonth(String dom) {
        registerPage.enterDateOfBirthMonth(dom);
    }

    @Test(dependsOnMethods = "enterDateOfMonth")
    public void enterDateOfYear(String doy) {
        registerPage.enterDateOfBirthYear(doy);
    }

    @Test(dependsOnMethods = "enterDateOfYear")
    public void enterEmail(String email) {
        registerPage.enterEmail(email);
    }

    @Test(dependsOnMethods = "enterEmail")
    public void enterCompany(String company) {
        registerPage.enterCompany(company);
    }

    @Test(dependsOnMethods = "enterCompany")
    public void enterPassword(String pass) {
        registerPage.enterPassword(pass);
    }

    @Test(dependsOnMethods = "enterPassword")
    public void enterConfirmPassword(String confirmPass) {
        registerPage.enterConfirmPassword(confirmPass);
    }

    @Test(dependsOnMethods = "enterConfirmPassword")
    public void clickRegisterButton() {
        registerPage.clickRegisterButton();
    }
}