
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

    public int[] primeFactors(int p) //this will be for reverting e back to prime numbers
    {
        int[] primeFactors = new int[p];
        int index = 0;
        primeFactors[index++] = 1;
        if (isPrime(p)) 
        {
            primeFactors[1] = p;
            return primeFactors;
        } else 
        {
            for (int i = 2; i <= p; i++) 
            {
                if (p % i == 0) 
                {
                    primeFactors[index++] = i;
                }
            }
        }
        int[] output = new int[index];
        for (int i = 0; i < index; i++) 
        {
            output[i] = primeFactors[i];
        }
        return output;
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
}