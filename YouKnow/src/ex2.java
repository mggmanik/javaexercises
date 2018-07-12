import java.util.Scanner;

public class ex2 {

    public static void main(String[] args)
    {
        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        num = in.nextInt();

        if(num % 2 == 0 && (num>20 && num<30))
        {
            System.out.println("Jerry");
        }
        else if(num % 2 != 0 && (num>20 && num<30))
        {
            System.out.println("Tom");
        }
        else {
            System.out.println("Oops! Dosen't exist between 20 and 30");
        }
    }
}
