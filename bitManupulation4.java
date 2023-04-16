public class bitManupulation4 {

    /*
    BINARY 1'S COMPLEMENT(~)
    LSB->0(+VE)
    MSB->1(-VE)
    1->0
    0->1
    5->101
    5(~)->010
     */

    public static void main(String[] args) {
        int a=5;
        System.out.println(~a);//-6
        System.out.println(~0);//-1
    }
}
