import java.util.*;
public class NumberGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("\t \t \t ***NUMBER GUESSING GAME***");
        System.out.println("Rules : This number guessing game generates a random number for you to guess." +
                "\n \t \tYou would be given *5 TRIES* to guess the number correctly.");
        System.out.println("Wanna try your luck (Y/N)?  ");
        char ch = sc.next().charAt(0);
        while (ch=='Y' || ch=='y')
        {
            play(sc, random);
            System.out.println("Wanna try your luck again (Y/N)? ");
            char ch1 = sc.next().charAt(0);
            if (ch1 == 'n' || ch1 == 'N')
            {
                break;
            }
        }
        System.out.println("Thanks for playing! Goodbye.");
    }


    public static void play(Scanner sc, Random random)
    {
        int rn = random.nextInt(100) + 1;
        System.out.println("Guess the number : ");
        int count = 5;
        int count1 = 0;
        while(count>0)
        {
            int guess = sc.nextInt();
            count1++;
            count--;
            if (guess == rn)
            {
                System.out.println("Yay! You got it right!");
                System.out.println("It took you " + count1 + " tries to guess the answer!");
                return;
            }
            else if (guess > rn)
            {
                System.out.println("Too high!");
                System.out.println("Chances remaining : " + count);
                if(count == 0)
                {
                    break;
                }
                System.out.println("Give it another try : ");
            }
            else
            {
                System.out.println("Too low!");
                System.out.println("Chances remaining : " + count);
                if(count == 0)
                {
                    break;
                }
                System.out.println("Give it another try : ");
            }
        }
        System.out.println("Sorry, you've run out of tries. The correct number was: " + rn);
    }
}
