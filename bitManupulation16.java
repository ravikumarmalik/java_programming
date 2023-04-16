public class bitManupulation16 {
    public static void main(String[] args) {
        int x=3;
        int y=4;
        System.out.println("before swap:("+x+","+y+")");//before swap:(3,4)

        x=x^y;
        y=x^y;
        x=x^y;

        System.out.println("after swap:("+x+","+y+")");//after swap:(4,3)
    }
}
