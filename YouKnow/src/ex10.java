import java.util.Collections;
import java.util.Scanner;

public class ex10 {

    public static void main(String[] args)
    {
        int num;
        String str,subStr="",subsubStr="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = in.next();
        System.out.println("Enter the repition number");
        num = in.nextInt();

        for(int i=str.length()-1;i>=str.length()-num;i--)
        {
            subStr+=str.charAt(i);
        }
        for(int i=subStr.length()-1;i>=0;i--)
        {
            subsubStr+=subStr.charAt(i);
        }
        System.out.print("\nThe output string is: "+str);
        for(int i=0;i<num;i++)
        {
            System.out.print(subsubStr);
        }
    }
}
