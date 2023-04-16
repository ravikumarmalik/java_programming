/*

Given two array A and B of equal length n . pair each element of array A to an element in array A to an element
in array B, such that sum S of absolute differences af all the pairs is minimum.

 */


import java.util.Arrays;

public class greedy4 {
    public static void main(String[] args) {//O(n logn)
        int[] a={4,1,8,7};
        int[] b={2,3,6,5};

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff=0;

        for (int i=0; i<b.length;i++){
            minDiff +=Math.abs(a[i]-b[i]);//abs=absolute value
        }
        System.out.println("minimum absolute difference of pairs:"+minDiff);

    }
}
