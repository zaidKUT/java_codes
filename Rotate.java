package Coding;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotate{
    public static void main(String [] args){
        ArrayList<Integer> Ro = new ArrayList<>();
        Ro.add(1);
        Ro.add(5);
        Ro.add(4);
        Ro.add(2);
        Ro.add(10);
        Ro.add(5);
        System.out.println("before rotation " +Ro);
        Scanner sc = new Scanner(System.in);
        int rotate = sc.nextInt();
        rotate = rotate%Ro.size();
        int temp;
        for(int i=0;i<rotate;i++){
            temp = Ro.get(0);
            Ro.remove(0);
            Ro.add(temp);
            

        }
        sc.close();
        System.out.println("Rotated list is " +Ro);


        
    }
}