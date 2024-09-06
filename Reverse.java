package Coding;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        
        System.out.println("Original ArrayList: " + numbers);
        reverseArrayList(numbers);
        System.out.println("Reversed ArrayList: " + numbers);
    }
    
    public static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}

