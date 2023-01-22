
// import java.util.Scanner;
import java.lang.Math;

public class GodelNumbering 
{
    public static void main(String args[]) 
    {
        int[] input = {2,2,2,3,1,2,3,3,1,1,1,1,1,11};
        int len = input.length;
        int[] primeNums = new int[len];
        int testNum = 0;
        for (int i = 0; i < len; i++)
        {
            primeNums[i] = Prime.nextPrime(testNum);
            testNum = primeNums[i];
            System.out.println(primeNums[i]);
        }
        // long e = 1;
        // for (int i = 0; i < len; i++)
        // {
        //     e *= (long)(Math.pow(primeNums[i], input[i]));
        //     System.out.println(e);
        // }
    }
}