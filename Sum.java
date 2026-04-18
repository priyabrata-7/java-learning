import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the value of x  :");
        int x= input.nextInt();
        System.out.println("enter the value iof y");
        int y= input.nextInt();
        int add=x+y;
        System.out.println(add);
    }
}