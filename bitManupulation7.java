public class bitManupulation7 {
    public static void main(String[] args) {
        /*
        check number is odd or even.....!!!
        LSB->1(ODD)
        MSB->0(EVEN)
        0->000
        1->001
        2->010
        3->011
        4->100
        5->101
        6->110
        7->111

        check 3 is even or odd
        ex-
        3->011
         we need to perform AND operation to check this one
         ->always taking 1 as a bitmask(001)
         now- 3-> (011 & 001)->001(LSB 1 that means 3 odd number)

         4->100
         ->always taking 1 as a bitmask(001)
         (100 & 001)->000(msb 0 that means 4 is even number)
         */

       int n=4;
        int bitMask=1;
        if ((n & bitMask)==0){
            System.out.println("this is even number");
        }else {
            System.out.println("this is odd number");//this is even number
        }

    }
}
