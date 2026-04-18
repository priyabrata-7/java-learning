import java.util.Scanner;
public class Break {
    public static void main(String[] args){
        String a;
        Scanner obj =new Scanner(System.in);
        while (true){
            System.out.println(" enter what you want to write(type exit to stop writing)");
            a=obj.nextLine();
           if(a.equals("exit")){
               System.out.println("sorry you cant write ");
               break;
           }
            System.out.println(" you enter "+a);
        }
        obj.close();
    }
}