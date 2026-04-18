import java.util.Scanner;
public class pallin{
    public static void main( String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the number");
        n = input.nextInt();
        int rev=0;
        int temp =n;
        while (temp!=0){
            int r =temp%10;
            rev=rev*10+r;
            temp = temp/10;
        }
        if(n==rev)
            System.out.println("pallindrom");
        else
            System.out.println("not pallindrom");

    }
}