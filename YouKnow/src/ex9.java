import java.util.Scanner;

public class ex9 {

    public static void main(String[] args)
    {
        String orgStr;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        orgStr = in.next();
        System.out.println("The reversed String is: "+reverse(orgStr));
    }

    public static String reverse(String str)
    {
        String revStr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            revStr+=str.charAt(i);
        }
        return revStr;
    }
}
