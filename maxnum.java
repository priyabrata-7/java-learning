import java.util.Scanner;
public class maxnum{
    int x;
    int y;
    public void setvalue (int a,int b){
        x=a;
        y=b;
    }
    public void calculate(){
        if(x>y){
            System.out.println("x is bigger");
        } else if (x==y) {
            System.out.println("x and y are same value ");
        } else  {
            System.out.println("y is bigger");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= input.nextInt();
        System.out.println("enter the 2nd number ");
        int b= input.nextInt();
        maxnum obj = new maxnum();
        obj.setvalue(a,b);
        obj.calculate();

    }
}