import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name = "";
        int number = 0;
        double decimal = 0;
        int rangedNumber = 0;
        double rangedDouble = 0;
        boolean yesNo = false;
        String ssn = "";


        // Part A
        name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Your name is " + name);


        // Part B
        number = SafeInput.getInt(in, "Enter an integer");
        System.out.println("You entered " + number);


        // Part C
        decimal = SafeInput.getDouble(in, "Enter a double");
        System.out.println("You entered " + decimal);


        // Part D
        rangedNumber = SafeInput.getRangedInt(in, "Enter a number", 1, 100);
        System.out.println("You entered " + rangedNumber);


        // Part E
        rangedDouble = SafeInput.getRangedDouble(in, "Enter a decimal number", 1.5, 10.5);
        System.out.println("You entered " + rangedDouble);


        // Part F
        yesNo = SafeInput.getYNConfirm(in, "Do you want to continue");
        System.out.println("Your answer returned " + yesNo);


        // Part G
        ssn = SafeInput.getRegExString(in,
                "Enter your SSN",
                "^\\d{3}-\\d{2}-\\d{4}$");

        System.out.println("You entered " + ssn);
    }
}