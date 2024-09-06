package Coding;

class recur{
    void recrs(int x){
    if(1>x){
        return;
    }
    System.out.println("open" + x);
    recrs(x-1);
    System.out.println("closed" + x);

}
    
}

public class Open {
    public static void main(String [] args){
        recur re = new recur();
        re.recrs(5);
    }
    
}
