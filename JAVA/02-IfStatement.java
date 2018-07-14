import java.util.Scanner;
class IfStatement
{
    static String decide (int a)
    {
        int age = a;
        if (age > 18 || age == 18)
            return "You are an adult. ";
        else if (age > 12)
            return "You are a teenager. ";
        else
            return "You are a child. ";
    }
    public static void main (String [] args)
    {
        System.out.println("Input your age. ");
        Scanner scn = new Scanner(System.in);
        int age = Integer.parseInt
        (
            scn.nextLine()
        );
        System.out.println
        (
            decide(age)
        );
    }
}
