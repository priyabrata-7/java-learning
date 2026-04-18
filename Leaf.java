import java.util.Scanner;
public class Leaf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the year");
        int y = input.nextInt();
        if((y%4==0&&y%100!=0)||(y%400==0)){
            System.out.println("leaf year");
        } else {
            System.out.println("not leaf year");
        }

    }
}