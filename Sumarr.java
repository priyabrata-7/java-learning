import java.util.Scanner;
public class Sumarr {
    public static void main(String[] args){
         int sum=0;
        Scanner input= new Scanner(System.in);
        System.out.println("enter the size");
        int n = input.nextInt();
       int[] arr = new int[n];
       System.out.println("enter the element of array");
       for(int i=0;i<n;i++){
           arr[i]= input.nextInt();
           sum= sum +arr[i];
       }
      System.out.println(sum);

    }
}