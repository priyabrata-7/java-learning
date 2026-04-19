package com.example.geometry;
import java.util.Scanner;

public class circle {
    public int r;
    public final double pi =3.141;
    public void setvalue(){
        System.out.println("enter the radiuds");
        Scanner input = new Scanner(System.in);
        r=  input.nextInt();
    }

}
