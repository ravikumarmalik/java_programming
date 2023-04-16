public class bitManupulation6 {
    public static void main(String[] args) {
        /*
        right shift operator

        (5=6>>2)
        6->000110

        000001
         */
        int a=6;
        System.out.println(a>>2);//1(which is 000001)
        System.out.println(a>>1);//3
        System.out.println(a>>7);//0
    }
}
