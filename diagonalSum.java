public class diagonalSum {
    public static void diagonalSum(int[][] a) {
        int primary=0;
        int secondary=0;
        int n=4;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (i==j) {
                    primary = primary+a[i][j];

                } else if ((i+j)==n-1) {
                    secondary+=a[i][j];

                }

            }
        }
        //sum of principal diagonal
        System.out.println("sum of primary diagonal:"+primary);

        System.out.println("sum of primary diagonal:"+secondary);

    }
    public static void main(String[] args) {
        int[][] a={ { 8, 2, 13, 4 },
                { 9, 16, 17, 8 },
                { 1, 22, 3, 14 },
                { 15, 6, 17, 8 } };
        diagonalSum(a);
    }

}





















/*

sum of primary diagonal:35
sum of primary diagonal:58


 */
