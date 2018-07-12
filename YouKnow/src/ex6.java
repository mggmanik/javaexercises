import java.util.Scanner;

public class ex6 {

    public static void main(String[] args)
    {
        char s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        s = in.next().charAt(0);

        if(s>=65 && s<=90)
        {
            System.out.println("Capital Letter");
        }
        else if (s>=97 && s<=122)
        {
            System.out.println("Small Letter");
        }
        else if (s>=48 && s<=57)
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Symbol");
        }
    }
}
