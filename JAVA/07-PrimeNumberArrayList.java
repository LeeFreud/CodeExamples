import java.lang.Integer;
import java.util.ArrayList;
class PrimeNumberArrayList
{
    static ArrayList<Integer> primeNum = new ArrayList<Integer>();
    static void printPrime(int x)
    {
        System.out.println
        (
            "primeNum(" +
            x +
            ") = " +
            primeNum.get(x)
        );
    }
    static boolean isPrime(int x)
    {
        for(Integer i: primeNum)
        {
            if ( x % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args)
    {
        Integer n;
        n = 2;
        primeNum.add(n);
        printPrime(0);
        for
        (
            n = 3;
            primeNum.size() < 1000;
            n += 1
        )
        {
            if
            (
                isPrime(n)
            )
            {
                primeNum.add(n);
                printPrime
                (
                    primeNum.size() - 1
                );
            }
        }
    }
}
