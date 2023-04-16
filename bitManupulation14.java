public class bitManupulation14 {
    public static int countOf1(int n) {
        int count=0;
        while (n>0){
            if ((n&1) !=0){
                count++;
            }
            n=n>>1;
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(countOf1(10));//1010 which is 2's 1
        System.out.println(countOf1(11));//1011 which is 3's 1
        System.out.println(countOf1(12));//1100 which is 2's 1
        System.out.println(countOf1(13));//1101 which is 3's 1

    }
}
/*
no's of 1's
2
3
2
3

 */
