import java.util.*;
public class dice{
    public static void main(String[] args){
        Random ra = new Random();
        int num = ra.nextInt(7);
        System.out.println("enter 'roll' to rolll the dice  ");
        Scanner sc = new Scanner(System.in);
        String ro= sc.nextLine();
        if (ro.equals("roll")){
            System.out.println(num);
        }

    }
}
