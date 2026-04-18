import java.util.Scanner;
public class delite {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of the array");
        for(int i =0;i<n;i++){
            arr[i]= input.nextInt();
        }
        // search karna hei delite karna bala element
        System.out.println("enter the element which youn want to delite ");
        int element = input.nextInt();
        int index=-1;
        for( int i=0; i<n; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }

        }
        if(index==-1){
            System.out.println("element not exixt in the array");

        }
        else {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}