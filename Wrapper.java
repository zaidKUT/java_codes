package Coding;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String args []){
    ArrayList<Integer> l = new ArrayList<>();
    l.add(76);
    l.add(53);
    l.add(22);
    l.add(7);
    System.out.println(l.get(0));
    for(int i=0;i<l.size();i++){
        System.out.print(l.get(i) + " ");
        l.remove(new Integer(7));
    }
    System.out.println(l.iterator());
    System.out.println(l);
    }
}
