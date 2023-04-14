package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly rw=new RWOnly();

      //  rw.Name="Aadil";
       // System.out.print(rw.name);
        //java: Name has private access in com.driver.RWOnly

        rw.setName("Aadil");
        System.out.print(rw.getName());


    }

}