import java.util.Scanner;
public class recurssion{
    public static void main(String[] args){
        int x;
        System.out.println("Enter the number ");
        Scanner input = new Scanner(System.in);
        x= input.nextInt();
        long result = fact (x);
        if(result==0){
            System.out.println("factorial of the number is not found ");
        }
        else{
            System.out.println("the factorial of the number is "+ result);
        }
    }
    public static long fact(int a){
        if (a>0){
            return a * fact(a-1);
        }
        else if (a==0) {
            return 1;
        }
        else{
            return 0;
        }
    }
}