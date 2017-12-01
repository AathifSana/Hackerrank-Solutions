import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> dogArray = new ArrayList();
    static ArrayList<Integer> difArray = new ArrayList<>();

    public static void main(String[] args) {

    int testcases = sc.nextInt();

        for(int i = 0 ; i< testcases ; i++){

            int dogs = sc.nextInt();
            int groups = sc.nextInt();

            for(int j= 0 ; j<dogs ; j++){
                dogArray.add(sc.nextInt());
            }

            Collections.sort(dogArray);


            for(int k = 1 ; k < dogs ; k++){
                difArray.add(dogArray.get(k) - dogArray.get(k-1));
            }

            Collections.sort(difArray);

            for(int r = 0 ; r < groups-1 ; r++){
                difArray.remove(difArray.size()-1);
            }
            int sum = 0;
            for(int y : difArray){
                sum+= y;
            }

            dogArray.removeAll(dogArray);
            difArray.removeAll(difArray);

            System.out.println(sum);

        }
    }
}

