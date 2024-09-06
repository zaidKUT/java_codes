package Coding;

public class Encap {
    private String name;
    private int age;
    
    public Encap(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        Encap obj = new Encap("John", 30);
        
        System.out.println("Details before modification:");
        obj.printDetails();
        
        obj.setName("Alice");
        obj.setAge(25);
        
        System.out.println("\nDetails after modification:");
        obj.printDetails();
    }
}

