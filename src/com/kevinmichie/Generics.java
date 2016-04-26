package com.kevinmichie;

public class Generics{

    public static<T extends Comparable<T>> T findMax(T a,T b ){
        /* T is some type of data that extends Comparable that
        means it has the able to compare the values.
         */

        int n = a.compareTo(b);
        if(n<0){
            return b; //B would be Maximum
        }else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 2));
        System.out.println(findMax(2, 2));

        System.out.println();

        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("hello", "there"));

        //This will not work.
        //Generics k = new Generics();
        //System.out.println(findMax(k,k));

    }

}
