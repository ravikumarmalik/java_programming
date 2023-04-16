import java.util.*;
public class months {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("print the Months name");

            System.out.print("enter the number-");
            int month=sc.nextInt();

        switch (month) {
            case 1-> System.out.println("january");
            case 2 -> System.out.println("february");
            case 3 -> System.out.println("march");
            case 4 -> System.out.println("april");
            case 5 -> System.out.println("may");
            case 6 -> System.out.println("jun");
            case 7 -> System.out.println("juy");
            case 8 -> System.out.println("august");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("october");
            case 11 -> System.out.println("novmber");
            case 12 -> System.out.println("december");
            default -> System.out.println("ohh enter the wrong number please try again........");
        }
        }
    }


