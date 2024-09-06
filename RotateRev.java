package Coding;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateRev {
    public static void main(String[] args) {
        ArrayList<Integer> Ro = new ArrayList<>();
        Ro.add(1);
        Ro.add(5);
        Ro.add(4);
        Ro.add(2);
        Ro.add(10);
        Ro.add(5);
        System.out.println("Before rotation "+ Ro);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of positions to rotate: ");
        int rotate = sc.nextInt();

        int size = Ro.size();
        rotate = rotate % size; 

        if (rotate < 0) {
            rotate += size; 
        }

        reverse(Ro, 0, size - 1);
        reverse(Ro, 0, rotate - 1);
        reverse(Ro, rotate, size - 1);

        System.out.println("Rotated list is " + Ro);
        sc.close();
    }

    public static void reverse(ArrayList<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
        
    }
}

