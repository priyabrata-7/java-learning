import java.util.Scanner;
public class Positve {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        if(n==0){
            System.out.println(" number is zero");
        }
        else if(n>0){
            System.out.println("the number is positive");

        }
        else{
            System.out.println("the number is negative");
        }
    }
}