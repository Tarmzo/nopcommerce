package Utils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class GererateTestData {

    static Faker faker = new Faker();

    public static String firstName = faker.name().username();
    public static String number = faker.internet().password();
    public static String appName = faker.app().name();

    @Test
    public void testFaker(){
        System.out.println(firstName);
        System.out.println(number);
        System.out.println(appName);
    }
}
