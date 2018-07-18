class PrimeNumber
{
    static final int maxInd = 999;
    static int [] primeNum = new int[maxInd+1];
    static int primeInd;
    static boolean isPrime(int x)
    {
        int i;
        for
        (
            i = 0;
            i <= primeInd;
            i += 1
        )
        {
            if( x % primeNum[i] == 0)
            {
                return false;
            }
        }
        return true;
    }
    static void printPrime(int x)
    {
        System.out.println
        (
            "primeNum(" + 
            x +
            ") = " +
            primeNum[x]
        );
    }
    public static void main(String [] args)
    {
        primeNum[0] = 2;
        primeInd = 0;
        printPrime(0);
        int n = 3;
        while(primeInd <= maxInd)
        {
            if(isPrime(n))
            {
                primeNum[primeInd + 1] = n;
                primeInd += 1;
                printPrime(primeInd);
            }
            n += 1;
        }
    }
}
