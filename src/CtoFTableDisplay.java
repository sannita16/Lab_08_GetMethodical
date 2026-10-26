public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.printf("%10s %15s%n",
                "Celsius",
                "Fahrenheit");

        System.out.println("---------------------------");

        for(double celsius = -100; celsius <= 100; celsius++)
        {
            System.out.printf("%10.1f %15.1f%n",
                    celsius,
                    CtoF(celsius));
        }
    }


    public static double CtoF(double Celsius)
    {
        double fahrenheit = 0;

        fahrenheit = (Celsius * 9.0 / 5.0) + 32;

        return fahrenheit;
    }
}