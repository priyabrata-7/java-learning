import java.util.Scanner;
public class shroted{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = input.nextInt();
        int []arr = new int[n];
        int c =0;
        System.out.println("enter the element of array");
        for( int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if (arr[i] > arr[i+1]) {
                c++;
                break;
            }

        }
        if(c==1){
            System.out.println("the arrayis not shorted");
        }
        else{
            System.out.println("array is shorted");
        }
    }
}