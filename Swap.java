import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of 1st number");
        int x= input.nextInt();
        System.out.println("enter the 2nd number");
        int y=input.nextInt();
        System.out.println("after swappin");
        x = x+y;
        y = x-y;
        x =x-y;
        System.out.println(x);
        System.out.println(y);


    }
}