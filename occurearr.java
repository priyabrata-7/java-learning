import java.util.Scanner;
public class occurearr {
    public static void main(String[] args){
        int c =0;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = input.nextInt();
        int []arr=new int[size];
        System.out.println("entr the element whic you want to search how many time");
        int n = input.nextInt();
        System.out.println("enter the element");
        for(int i=0;i<size;i++){
            arr[i]= input.nextInt();
            if(arr[i]==n){
                c++;
            }
        }
        System.out.println("the number "+n+"is occure"+c);

    }
}