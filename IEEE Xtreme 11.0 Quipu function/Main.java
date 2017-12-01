package Quipu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numofD = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
      //  long[] darr = new long[numofD];
        int[] arr = new int[numofD];

        for(int j = 0 ; j < numofD ; j++) {
            arr[j] = function(a,b,sc.nextLong());
        }
//
//        for(int j = 0 ; j < numofD ; j++) {
//            function(a , b, darr[j]);
//        }

        for(int g: arr){
            System.out.println(g);
        }


        sc.close();
    }

   static int function(long a,long b,long d) {

        ArrayList<Long> sumList = new ArrayList<>();
        int sumd = 0;

        for (long i = a; i <= b; i++) {
            long g = findDivisors(i, d);
            sumList.add(g);
        }

        for (long t : sumList) {
            sumd += t;
        }
//        System.out.println(sumd);
        return sumd;

    }


//    static boolean isDivisible( long n , long d){
//        return n%d == 0;
//    }

    static int findDivisors(long num , long d){

        ArrayList<Long> al = new ArrayList<>();
        for (long i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                al.add(i);
            }
        }
        al.add((long)1);
        al.add(num);
        int size = al.size();
        for(int r  = 0 ; r < size ; r++){
            if(al.get(r)%d == 0){
                al.remove(r);
                size = al.size();
            }
        }
        return al.size();

    }


}
