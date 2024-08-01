package Basics;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

/*Every time this class in executed it shows different registration test data
 as we can repeat using one, there will be an error of existing user
 */

public class GenerateTestData {

    Faker faker = new Faker();

    String gender = "Male";
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String dob = faker.date().birthday().toString();
    String email = faker.address().fullAddress();
    String company = faker.company().name();
    String password = faker.internet().password();
    String confirmPassword = password;


    @Test
    public void Tests(){
        System.out.println(gender);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(dob);
        System.out.println(email);
        System.out.println(company);
        System.out.println(password);
        System.out.println(confirmPassword);
    }
}