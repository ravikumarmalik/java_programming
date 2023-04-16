public class continueStatement {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("continue");
    }
}

/*
1
3
5
7
9
continue

 */
