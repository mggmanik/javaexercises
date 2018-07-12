import java.util.Scanner;

public class ex3 {

    public static void main(String[] args)
    {
        String word;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the word: ");
        word = in.next();

        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
            {
                System.out.println("Vowel");
            }
            else
                if(Character.isDigit(word.charAt(i)))
                {
                    System.out.println("Not a letter");
                }
            else
            {
                System.out.println("Constant or a special character");
            }
        }
    }
}
