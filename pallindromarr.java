import java.util.Scanner;
public class pallindromarr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = input.nextInt();
        int[] arr =new int[n];
        System.out.println("enter the number of element");
        for( int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        int[] brr=new int[n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-1-j){
                    brr[i]=arr[j];
                    break;
                }


            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==brr[i]){
                c++;
            }
        }
      if(c==n){
          System.out.println("array is pallindrom");
      }
      else{
          System.out.println("not pallindrom");
      }
    }
}