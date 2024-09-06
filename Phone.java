package Coding;

interface Android{
    void gaming();
    void camera();
}

interface Iphone{
    void ui();
    void editing();
}

class OnePlus implements Android{
    public void gaming(){
        System.out.println("120 fps gaming");
    }
    public void camera(){
        System.out.println("4K camera");
    }
}

class Samsung implements Android{
    public void gaming(){
        System.out.println("90 fps gaming");
    }
    public void camera(){
        System.out.println("8k 200x zoom camera");
    }
}

class IphoneSe implements Iphone{
    public void ui(){
        System.out.println("2021 version ui");
    }
    public void editing(){
        System.out.println("fast editing");
    }
}

class Iphonemini implements Iphone{
    public void ui(){
        System.out.println("2024 latest ui");
    }
    public void editing(){
        System.out.println("4k ultra fast editing");
    }
}

class SuperPhone implements Android,Iphone{
    public void gaming(){
        System.out.println("Best gaming 144 fps");
    }
    public void camera(){
        System.out.println("Ultra HDR camera 1000 MP");
    }
    public void ui(){
        System.out.println("Best futuristic UI");
    }
    public void editing(){
        System.out.println("Ultra fast editing wihtout lag");
    }
}

public class Phone {
    public static void main(String [] args){
        Android ph1 = new OnePlus();
        System.out.println("OnePlus features ");
        ph1.camera();
        ph1.gaming();
        Android ph2 = new Samsung();
        System.out.println("\n Samsung Features");
        ph2.camera();
        ph2.gaming();
        Iphone ph3 = new IphoneSe();
        System.out.println("\n Iphone SE features");
        ph3.editing();
        ph3.ui();
        Iphone ph4 = new Iphonemini();
        System.out.println("\n Iphone mini Features");
        ph4.editing();
        ph4.ui();
        SuperPhone sp = new SuperPhone();
        System.out.println("\n Super Phone Featurs");
        sp.camera();
        sp.editing();
        sp.gaming();
        sp.ui();

    }
    
}
