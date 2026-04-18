import java.util.Scanner;
public class password{
    public static void main(String[] args){
        String x;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a strong password ");
        x= input.nextLine();
        String y;
        System.out.println("enter the password to go ");
        y= input.nextLine();
        while(!x.equals(y)){
            System.out.println("you enter the wrong pasword");
            System.out.println("again enter the password");
            y=input.nextLine();
        }
        System.out.println("welcom to my world");

    }
}