import java.util.Scanner;
public class amstrong{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
                int n = input.nextInt();
        int sum=0;
        int temp =n;
        while(temp!=0){
            int r =temp%10;
            sum = sum+(r*r*r);
            temp=temp/10;

        }
        if(sum==n)
            System.out.println("number is amstrong");
        else
            System.out.println("number is not amstrong");
    }
}