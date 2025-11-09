package Oops;

class Parent {
    public void displayParent() {
        System.out.println("parent");
    }
}

class Child extends Parent{
     public void dispalyChild(){
        System.out.println("children");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        Parent  p = new Parent();
        p.displayParent();

        System.out.println();


        Child ch = new Child();
        ch.dispalyChild();

        System.out.println();

        Parent c = new Child();
    
        c.displayParent();

        

    }

}
