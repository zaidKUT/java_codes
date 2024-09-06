package Coding;

import java.util.ArrayList;

public class Duplicate {
    public static void main(String [] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(2);
    list.add(2);
    list.add(1);
    list.add(1);
    System.out.println("Before removing duplicates "+ list);
    removeDuplicates(list);
    System.out.println("After removing duplicate elements "+ list);
    }

    static void removeDuplicates(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            Integer za = list.get(i);

            for(int j=i+1;j<list.size();j++){
                if (za.equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}