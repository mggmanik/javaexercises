import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int numOrg, numDup, a = 0, x, sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        numOrg = in.nextInt();
        numDup = numOrg;

        while (numOrg>0)
        {
            x = numOrg % 10;

            if(x % 2 == 0)
            {
                sum = sum + x;
            }

            a = a * 10 + x;
            numOrg = numOrg/10;
        }

        if(a == numDup && sum>25)
        {
            System.out.println(numDup+" is palindrome and the sum of even numbers is greater than 25");
        }
        else
            if(a == numDup && sum<=25)
            {
             System.out.println(numDup+" is palindrome and the sum of even numbers is less than 25");
            }
        else
            {
                System.out.println(numDup+ "is not palindrome");
            }

    }
}
