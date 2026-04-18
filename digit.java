import java.util.Scanner;
public class digit{
    public static void main(){
        sum();
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int x = input.nextInt();
        int s =0;

        while (x!=0){
            int r = x%10;
            s = s+r;
            x=x/10;


        }
        System.out.println(s);
    }
}