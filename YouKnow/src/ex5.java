import java.util.InputMismatchException;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args)
    {
        int n,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Specify the number of inputs: ");
        n=in.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            try
            {
            a[i]=in.nextInt();
            sum+=a[i];

            Integer.parseInt(String.valueOf(a[i]));
            System.out.println(a[i] + " is a valid integer number!");

        }
            catch (InputMismatchException e) {
                System.out.println("Not a valid integer number! Can't carry on further");
                break;
            }
        }
        System.out.println("The Sum is: "+sum);
    }
}
