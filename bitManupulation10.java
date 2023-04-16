public class bitManupulation10 {
    public static int clearnIthBit(int n,int i) {
        int bitMask=~(1<<i);

        return n & bitMask;

    }
    public static void main(String[] args) {
        System.out.println(clearnIthBit(10,1));//8

    }
}
/*
3.CLEAR ith BIT
n=10        1010  clear i=1  1<<i which is 0010
then perform NOT operation ~(1<<i)->1101
then 1010 & 1101->1000(which is 8)

         */

