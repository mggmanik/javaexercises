import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ex7 {

    public static void main(String[] args)
    {
        int num,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = in.nextInt();

        int length = String.valueOf(num).length();

        int[] a = new int[length];

        int i = 0;
        while(num>0 && i<length)
        {
            a[i]=num%10;
            if(a[i]%2==0)
            {
                sum+=a[i];
            }
            num/=10;
            i++;
        }

        Arrays.sort(a);

        for(int m=0; m<a.length/2; m++)
        {
            int temp = a[m];
            a[m] = a[a.length -m -1];
            a[a.length -m -1] = temp;
        }

        System.out.print("Sorted number in non-increasing order: ");
        for(int n : a)
        {
            System.out.print(n);
        }

        System.out.println("\nSum of even numbers: "+sum);

        if(sum>15)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }


}
