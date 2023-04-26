package org.example.persistent1;

@FunctionalInterface
interface sumInterface{

    public int sum(int i , int j);
    //public void display();

}

public class CustomFunctionalInterface {

    public static void main(String[] args) {
        sumInterface s=(i,j)->{return i+j;};

       // sumInterface s1=()-> System.out.println("welocme");
       // s1.display();

        int r=s.sum(4,4);
       System.out.println(r);
    }

}
