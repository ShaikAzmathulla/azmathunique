import java.lang.*;
import java.util.*;

public class guessingGame {
    public int numberGuessing() {
        Scanner ob = new Scanner(System.in);
        int a = (int)(Math.random() * 1001);
        int guess =0;
        int attempts = 0;
        System.out.println("Welcome to Number guessing game");
        System.out.println("I want u to guess a number");
        while (guess!=a) {
            System.out.print("Enter a Number : ");
            guess = ob.nextInt();
            attempts += 1;
            if ( guess<a) {
                System.out.println("too low");
            } else if (guess>a) {
                System.out.println("too high");
            } else {
                System.out.println("you guessed the correct number in "+attempts +" attempts");
            }
        }
     return a;}

    public static void main(String[ ]args) {
       guessingGame obj=new guessingGame();

       obj. numberGuessing();

    }
}