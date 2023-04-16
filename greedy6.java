/*
we are giving an infinite supply of denominations [1,2,5,10,20,50,100,500,2000]
find minimum numbers of coins/notes to make change for a value V.

v=121
ans =3(100+20+1)

v=590
ans =4(500+50+20+20)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class greedy6 {
    public static void main(String[] args) {
        Integer[] coins={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoin=0;
        int amount=590;

        ArrayList<Integer> ans= new ArrayList<>();

        for (int i=0;i<coins.length;i++){
            if (coins[i]<=amount){
                while (coins[i]<=amount){
                    countOfCoin++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }
        System.out.println("total (min) coins used ="+countOfCoin);
        for (int i=0; i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
