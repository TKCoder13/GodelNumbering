
// import java.util.Scanner;
import java.lang.Math;

public class GodelNumbering 
{
    public static void main(String args[]) 
    {
        int[] input = {7,6,5,4,3,2,1};
        int len = input.length;
        int[] primeNums = new int[len];
        int testNum = 0;
        for (int i = 0; i < len; i++)
        {
            primeNums[i] = Prime.nextPrime(testNum);
            testNum = primeNums[i];
            System.out.println("This is prime #" + (i+1) + ": " + primeNums[i]);
        }
        System.out.println(); 
        long e = 1;
        for (int i = 0; i < len; i++)
        {
            e *= (long)(Math.pow(primeNums[i], input[i]));
            System.out.println("e = " + e + " at primeNums index " + i);
        }
        System.out.println(); //skips a line
        //Everything above is for the input to get to e.
        //Everything below is for e to get to the input.
        // int[] tempPrimeFactors = Prime.primeFactors(e);
        int[] eOutput = Prime.primeFactors(e);
        int[] finalOutput = new int[len];

        System.out.print("{");
        int index = 0;
        for (int i = 0; i < eOutput.length - 1; i++)
        {
            System.out.print(eOutput[i] + ",");
        }
        System.out.println(eOutput[eOutput.length - 1] + "}");
        System.out.println();
        for (int i = 0; i < eOutput.length; i++)
        {
            if (primeNums[index] == eOutput[i])
            {
                finalOutput[index]++;
            } else
            {
                index++;
                if (primeNums[index] == eOutput[i])
                {
                    finalOutput[index]++;
                }
            }
        }
        System.out.println("The Final Product is: ");
        System.out.print("{");
        for (int i = 0; i < finalOutput.length - 1; i++)
        {
            System.out.print(finalOutput[i] + ",");
        }
        System.out.print(finalOutput[finalOutput.length - 1] + "}");
    }
}