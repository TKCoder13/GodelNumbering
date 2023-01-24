
public class Prime 
{
    
    public Prime() 
    {

    }

    public static boolean isPrime(int n) throws IllegalArgumentException {
        if (n == 1) 
        {
            return false;
        } else if (n==2)
        {
            return true;
        }
        for (int i = 2; i < n; i++) 
        {
            if (n % i == 0) { //check for divisors other than 1 and p
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long n) throws IllegalArgumentException {
        long one = 1;
        long two = 2;
        if (n == one) 
        {
            return false;
        } else if (n == two)
        {
            return true;
        }
        for (long i = 2; i < n; i++) 
        {
            if (n % i == 0) { //check for divisors other than 1 and p
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int num) 
    {
        int in = num;
        if (in > 2)
        {
            boolean primeNotFound = true;
            while (primeNotFound)
            {
                in += 2;
                primeNotFound = !Prime.isPrime(in);
            }
            return in;
        } else if (in == 2)
        {
            in = num + 1;
            return in;
        } else
        {
            in = 2;
            return in;
        }
    }   

    // public int[] primeFactors(long e) //this will be for reverting e back to prime numbers
    // {
    //     long p = e;
    //     int[] primeFactors = new int[100];
    //     int index = 0;
    //     primeFactors[index++] = 1;
    //     if (p == 1) {
    //         int[] one = new int[1];
    //         one[0] = 1;
    //         return one;
    //         System.out.println("This is not a ")
    //     } else if (isPrime(p)) 
    //     {
    //         primeFactors[1] = p;
    //         return primeFactors;
    //     } else 
    //     {
    //         for (int i = 2; i <= p; i++) 
    //         {
    //             if (p % i == 0) 
    //             {
    //                 primeFactors[index++] = i;
    //             }
    //         }
    //     }
    //     int[] output = new int[index];
    //     for (int i = 0; i < index; i++) 
    //     {
    //         output[i] = primeFactors[i];
    //     }
    //     return output;
    // }

    public static int[] primeFactors(long e)
    {
        long input = e;
        int primeTester = Prime.nextPrime(0);
        int[] listOfFactors = new int[100];
        int endCount = 0;
        long half = input / 2;
        int temp = 0;
        if (input % 2 == 0)
        {
            for (long i = 0; i <= input / 2; i++)
            {
                while (input % primeTester == 0)
                {
                    input /= primeTester;
                    listOfFactors[temp++] = primeTester;
                    endCount++;
                }
                primeTester = Prime.nextPrime(primeTester);
            }
        } else 
        {
            for (long i = 0; i <= (input + 1) / 2; i++)
            {
                while (input % primeTester == 0)
                {
                    input /= primeTester;
                    listOfFactors[temp++] = primeTester;
                    endCount++;
                }
                primeTester = Prime.nextPrime(primeTester);
            }
        }
        int[] output = new int[endCount];
        for (int i = 0; i < endCount; i++)
        {
            output[i] = listOfFactors[i];
        }
        return output;
    }
}