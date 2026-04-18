import java.util.Scanner;
public class Aria {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the braeth of the tringle");
        int x = input.nextInt();
        System.out.println("enter the haight");
        int y = input.nextInt();
        float a =0.5f*x*y;
        System .out.println(" area is " + a);
        //java me agr mujhe koi float ki value chahiye to mujhe use pahele flot diclar karna padega
    }
}