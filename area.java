package com.example.util;

import com.example.geometry.circle;

public class area {
    public static void main(String[] args){
        circle obj = new circle();
        obj.setvalue();
        double a= obj.pi* obj.r*obj.r;
        System.out.println("the are of the circle is ="+" "+a);
    }
}
