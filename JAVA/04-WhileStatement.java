class WhileStatement
{
    public static void main (String [] args)
    {
        int i, j, k, c;
        i = 0;
        j = 1;
        c = 0;
        while(i < 100)
        {
            System.out.println
            (
                "fib(" +
                c + 
                ") = " + 
                i
            );
            k = j;
            j = i + j;
            i = k;
            c += 1;
        }
    }
}
