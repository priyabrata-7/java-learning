import java.util.Scanner;
public class prime {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        int c=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                c++;

            }



        }
        if(c==2){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }

    }
}