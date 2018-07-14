import java.util.Scanner;
class GetUserInput
{
    public static void main(String [] args)
    {
        System.out.println("Input what you love. ");
        Scanner scn = new Scanner(System.in);
        System.out.println
        (
            "I love " +
            scn.nextLine +
            ". "
        );
    }
}
