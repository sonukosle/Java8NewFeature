package test;

public interface defaultMethodExample {

//    public void say();

    default public void display(){

        System.out.println("This is display method from default method interface");
    }
    default public void display2(){

        System.out.println("This is display2 method from default method interface");
    }
}
