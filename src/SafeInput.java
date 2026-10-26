import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

        }while(retString.length() == 0);

        return retString;
    }


    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not: " + trash);
            }

        }while(!done);

        return retVal;
    }


    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + ": ");

            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number, not: " + trash);
            }

        }while(!done);

        return retVal;
    }


    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();

                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value between " + low + " and " + high + ".");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not: " + trash);
            }

        }while(!done);

        return retVal;
    }


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value between " + low + " and " + high + ".");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number, not: " + trash);
            }

        }while(!done);

        return retVal;
    }


    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";
        boolean done = false;
        boolean retVal = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();

            if(response.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if(response.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter Y or N.");
            }

        }while(!done);

        return retVal;
    }


    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("Invalid input. Try again.");
            }

        }while(!done);

        return retVal;
    }


    public static void prettyHeader(String msg)
    {
        int totalWidth = 60;
        int insideWidth = 54;

        // Top row
        for(int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }

        System.out.println();

        // Calculate spaces needed to center message
        int leftSpaces = (insideWidth - msg.length()) / 2;
        int rightSpaces = insideWidth - msg.length() - leftSpaces;

        // Middle row
        System.out.print("***");

        for(int i = 0; i < leftSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for(int i = 0; i < rightSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        // Bottom row
        for(int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }

        System.out.println();
    }
}