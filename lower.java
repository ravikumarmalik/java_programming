public class lower {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Upper triangular matrix..!!!");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
              if (i<j){
                    System.out.print("0"+" ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}



















/*

Upper triangular matrix..!!!
1 0 0
4 5 0
7 8 9

-------------------------------------------

public class lower {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Upper triangular matrix..!!!");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
              if (i>j){
                    System.out.print("0"+" ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}

Lower triangular matrix..!!!
1 2 3
0 5 6
0 0 9



 */
