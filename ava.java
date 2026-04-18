import java.util.Scanner;
public class ava {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n ;
        System.out.println(" enter the number how many fabonaci series you want ");
        n= obj.nextInt();
        int i;
        for(i=0;i<=n;i++){
            System.out.println(fabonaci(i));

        }

    }
    public static int fabonaci(int x){
        if(x==0)
            return 0;
        else if(x==1)
            return 1;
        else
            return fabonaci(x-1)+fabonaci(x-2);
    }
}