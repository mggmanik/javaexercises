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
            a[i]=in.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);

        for(int i=0;i<n;i++)
        {
            try
            {
                Integer.parseInt(String.valueOf(a[i]));
                System.out.println(a[i] + " is a valid integer number!");
            }
            catch (NumberFormatException e)
            {
                System.out.println(a[i] + " is not a valid integer number!");
            }
        }
    }
}
