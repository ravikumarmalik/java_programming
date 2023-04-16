public class diagonalsZeros {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("All diagonals are zeros.....!!!");

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i==j){
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

All diagonals are zeros.....!!!
0 2 3
4 0 6
7 8 0



 */
