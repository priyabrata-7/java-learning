import java.util.Scanner;
public class reversearr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = input.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element of the array");
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}