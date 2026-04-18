import java.util.Scanner;
public class book{
    String name;
    int price;
    String author;
    static int totalbook=0;
    void setvalue(String n,String a,int p){
        name=n;
        author=a;
        price=p;
        totalbook=totalbook+1;

    }
    void display(){
        System.out.println("the name of the book is:"   +      name  );
        System.out.println("the pice of the book is: "  +      price);
        System.out.println("the author name is :" +            author);
        System.out.println("the total nmumber of book is "+ totalbook);
    }

    void abc(){
     Scanner input = new Scanner(System.in);
     System.out.println("enter the book name ");
     String n = input.nextLine();
     System.out.println("enter the author name ");
     String a = input.nextLine();
     System.out.println("enter the book price ");
     int p = input.nextInt();
     setvalue(n,a,p);
     display();
    }
    public static  void main(String[] args){
        book obj=new book();
        obj.abc();
    }

}