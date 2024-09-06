package Coding;

import java.util.ArrayList;
import java.util.HashSet;

public class Missing_No {
    public static void main(String [] args){
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(0);
        ar.add(0);
        ar.add(0);
        ar.add(0);
        ar.add(3);
        ar.add(2);
        ar.add(1);
        ar.sort(null);

        int expected_no = ar.get(0);
        for(int i=0;i<ar.size();i++){
            while(ar.get(i)!=expected_no){
                System.out.println("The missing number is " + expected_no);
                expected_no++;
            }
            expected_no++;
        }
    }
}
