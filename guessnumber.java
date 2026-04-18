import java.util.*;
public class guessnumber{
    public static void main(String[] args){
        Random obj = new Random();
        int num = obj.nextInt(10)+1;
        Scanner input = new Scanner(System.in);
        int guess;
        System.out.println("guess the correct number ");
        guess = input.nextInt();
        while (guess!=num) {

            if (guess > num) {
                System.out.println("your guess is biger than the number ");
            } else  {
                System.out.println("your guess is less then the number");

            }
             System.out.println("you emter again")  ;
            guess= input.nextInt();

        }
      System.out.println("you win");
    }
}