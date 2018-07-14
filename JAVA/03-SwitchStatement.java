import java.util.Scanner;
class SwitchStatement
{
    static String day(int i)
    {
        switch (i)
        {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Errorday";
        }
    }
    public static void main (String [] args)
    {
        System.out.println("Input an integer of 0-6.");
        Scanner scn = new Scanner(System.in);
        System.out.println
        (
            "I learn Java on every " +
            day
            (
                Integer.parseInt
                (
                    scn.nextLine()
                )
            ) +
            ". "
        );
    }
}
