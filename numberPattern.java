public class numberPattern {


        public static void main(String[] args)
        {
            for (int i = 0; i < 6; i++)
            {
                int number = 1;
                System.out.printf("%" + (6 - i) * 2 + "s", "");
                for (int j = 0; j <= i; j++)
                {
                    System.out.printf("%4d", number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }


