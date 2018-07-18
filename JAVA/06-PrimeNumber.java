class PrimeNumber
{
    static int [] primeNum = new int[100];
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
    static void print-prime(int x)
    {
        System.out.println
        (
            "primeNum(" + 
            primeInd +
            ") = " +
            primeNum[x]
        );
    }
    public static void main(String [] args)
    {
        primeNum[0] = 2;
        primeInd = 0;
        print-prime(0);
        int n = 3;
        while(primeInd <= 99)
        {
            if(isPrimen(n))
            {
                primeNum[primeInd + 1] = n;
                primeInd += 1;
                print-prime(primeInd);
            }
            n += 1;
        }
    }
}
