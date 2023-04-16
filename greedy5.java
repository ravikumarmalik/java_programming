/*
you are giving n pairs of numbers. I n every pair, the first number is always smaller than the
second number. A pairs (c,d) can come after pair (a,b) if b<c.
find the longest chain which can be formed from a given set if pairs.



 */

import java.util.Arrays;
import java.util.Comparator;

public class greedy5 {
    public static void main(String[] args) {//O(n logn)
        int[][] pairs={{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
       int chainLength=1;
       int chainEnd=pairs[0][1];//this is my last selected pair end//chain end

        for (int i=0;i<pairs.length; i++){
            if (pairs[i][0]>chainEnd){
                chainLength++;

                chainEnd=pairs[i][1];
            }
        }
        System.out.println("the maximum length of chain:"+chainLength);



    }
}
