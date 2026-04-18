import java.util.Scanner;
public class course {
    String c;
    int rno;
    static int maxnumber=0;
    void setvalue(String cn,int rn){
     c = cn;
     rno=rn;
    }
    void student(){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the course name");
        String coursename= obj.nextLine();
        System.out.println("enter the student number");
        int n = obj.nextInt();
        if(coursename.equals("bca")){
            maxnumber=10;
            if(n>maxnumber) {
                System.out.println("sit is not avalabe ");
            }
                else{
                    System.out.println("sit is avalable ");
                }


        }

    }
    void dispaly(){
        System.out.println("class name"+c);
        System.out.println("roll numbr"+rno);
    }
    void abc(){
        Scanner obj =new Scanner(System.in);
        System.out.println("enter the class name");
        String cn = obj.nextLine();
        System.out.println("enter the roll number");
        int rn= obj.nextInt();
        setvalue(cn,rn);
        student();
        dispaly();
    }
    public static void main(String[] args){
        course obj1 = new course();
        obj1.abc();
    }

}