import java.util.Scanner;
public class Gratest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value  a, b, c");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>b&&a>c){
            System.out.println(a +"is gratest");
        }
        else if(b>a&&b>c){
            System.out.println(b +"is gratest");

        }
        else{
            System.out.println(c +"is grtest");
        }
    }
}