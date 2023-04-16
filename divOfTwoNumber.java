/*
public class divOfTwoNumber {
    public static void main(String[] args) {
        int a=9;
        int b=2;
        int div=a/b;
        System.out.println(div);
    }
}

 */
import java.util.*;
class div{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number....");

        System.out.print("enter the 1st number-");
        int a=sc.nextInt();

        System.out.print("enter the 2nd number-");
        int b=sc.nextInt();

        int div=a/b;
        System.out.println("total result of div="+div);


    }
}
