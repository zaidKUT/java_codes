package Coding;

import java.util.ArrayList;

public class Armax {
    public static void main(String args[]){
    ArrayList<Integer> la = new ArrayList<>();
    la.add(10);
    la.add(12);
    la.add(8);
    la.add(76);
    la.add(4);
    System.out.println(la);
    int min = la.get(0);
    int max = la.get(la.size()-1);
    for(int i=0;i<la.size();i++){
        if(la.get(i)<min){
            min = la.get(i);
        }
        else if(la.get(i)>max){
            max = la.get(i);
        }
    }
    System.out.println("The minimum value in the list is "+min);
    System.out.println("The maximum value in the list is "+max);

    
    }

}
