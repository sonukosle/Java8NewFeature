package test;

import java.util.Date;
import java.util.function.Supplier;

public class SuplierDemo {

    public static void main(String[] args) {

//        SuplierDemo supD= new SuplierDemo();
//        System.out.println(supD.getDate());

        Supplier<Date> supplier =()->new Date();
        System.out.println("Calling from Supplier Interface : " +supplier.get());

    }

//    public Date getDate() {
//
//        return new Date();
//    }
}
