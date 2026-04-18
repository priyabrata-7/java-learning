import java.util.Scanner;
public class Table{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number which table you want");
        int n = input.nextInt();
        int mult=0;
        for(int i = 1;i<11;i++){
             mult= n*i;
            System.out.println(5 + " x " + i + " = " + mult);
        }

    }
}