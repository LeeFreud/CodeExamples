class ForStatement
{
    public static void main (String [] args)
    {
        int i; int a = 0; int b = 1; int s;
        for
        (
            i = 0;
            i < 10;
            i += 1
        )
        {
            System.out.println
            (
                "fib("+
                i + 
                ") = " +
                a
            );
            s = b;
            b = a + b;
            a = s;
        }
    }
}
