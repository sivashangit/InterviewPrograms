package org.example.persistent1;

public class ArrayIntersection {

    static void mth1(){
        int[] i={1,2,3,5};
        int[] j={1,2,3,4};

        for(int n=0;n<i.length;n++){

            for (int m=0;m<j.length;m++){

                if(i[n]==j[m]){

                    int commen=i[n];
                    System.out.println(commen);
                }
            }
        }


    }

    public static void main(String[] args) {
mth1();
    }
}
