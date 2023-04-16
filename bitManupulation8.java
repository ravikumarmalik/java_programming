public class bitManupulation8 {
    public static int getIthBit(int n, int i) {
        //1.GET ith BIT
        int bitMask=1<<i;
        if ((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,3));
        /*
        1.GET ith BIT
        2.SET ith BIT
        3.CLEAR ith BIT

         1.ex- 10->1010 check with ith bit 2 (0 or 1)
         need to use left shift operator


         */

    }
}
