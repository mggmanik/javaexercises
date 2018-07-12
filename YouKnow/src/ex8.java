import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        int num,guess;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a target number between 1-50: ");

   do {
        num = in.nextInt();
        if (num >= 1 && num <= 50) {
            System.out.println("Carry On !!");
            System.out.println("Now guess a number between the range(1-50): ");

            guess = in.nextInt();

            while (guess != num)
            {

                if (guess < num && guess >= 1) {
                    System.out.println("Number guessed is less than original number. Guess again");
                }
                else if (guess > num && guess <= 50) {
                    System.out.println("Number guessed is more than original number. Guess again");
                }
                else {
                    System.out.println("Told you out of limit won't work! Guess again");
                }

                guess = in.nextInt();

                if (guess == num) {
                    System.out.println("Number guessed matches the original number.");
                }
            }

        } else {
            System.out.println("Oops!! Outside the limit. You need to enter again!");
        }
       }while (num>50);
    }
}
