import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = "";
        String mNumber = "";
        String menuChoice = "";

        ssn = SafeInput.getRegExString(
                in,
                "Enter your SSN",
                "^\\d{3}-\\d{2}-\\d{4}$");

        mNumber = SafeInput.getRegExString(
                in,
                "Enter your UC M number",
                "^(M|m)\\d{5}$");

        menuChoice = SafeInput.getRegExString(
                in,
                "Enter menu choice [O/S/V/Q]",
                "^[OoSsVvQq]$");

        System.out.println("\nYour SSN is " + ssn);
        System.out.println("Your UC M number is " + mNumber);
        System.out.println("Your menu choice is " + menuChoice);
    }
}