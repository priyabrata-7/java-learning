import java.util.*;
public class pi {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THE VALUE OF THE RADIYUS ");
        double r = sc.nextDouble();
        double area = Math.PI*r*r;
        System.out.println(area);

    }
}