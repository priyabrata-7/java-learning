import java.util.Scanner;
public class Odd{
    public static void main(String[] args){
        int sum=0,i;
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the last digit odd number ");
        int n = input.nextInt();
        for(i=1;i<=n;i=i+2){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}