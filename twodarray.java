import java.util.Scanner;
public class twodarray {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the value of the raw");
        int r = input.nextInt();
        System.out.println("enter the value of the coloum");
        int c= input.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("enter the element of array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= input.nextInt();
            }
        }
        System.out.println("enter the target element");
        int tar = input.nextInt();

        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j]==tar){
                    System.out.println("element found at"+"raw"+r+"colum"+c);
                    break;
                }

            }
        }
    }
}