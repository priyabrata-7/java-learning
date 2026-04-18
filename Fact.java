import java .util.Scanner;
public class Fact{
    public static void main(String[] args){
        factorial();
    }
     static void factorial(){
        int x,i,f=1;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number which factorial you want");
        x = input.nextInt();
        for( i=1;i<=x;i++){
            f = f*i;
        }
        System.out.println("factorial is"+ f);
    }
}