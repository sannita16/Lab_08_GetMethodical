import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int maxDays = 31;

        year = SafeInput.getRangedInt(in,
                "Enter your birth year",
                1950,
                2015);

        month = SafeInput.getRangedInt(in,
                "Enter your birth month",
                1,
                12);

        switch(month)
        {
            case 2:
                maxDays = 29;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;

            default:
                maxDays = 31;
                break;
        }

        day = SafeInput.getRangedInt(in,
                "Enter your birth day",
                1,
                maxDays);

        hour = SafeInput.getRangedInt(in,
                "Enter your birth hour",
                1,
                24);

        minute = SafeInput.getRangedInt(in,
                "Enter your birth minute",
                1,
                59);

        System.out.println("\nYour birth date is "
                + month + "/" + day + "/" + year);

        System.out.println("Your birth time is "
                + hour + ":" + minute);
    }
}
