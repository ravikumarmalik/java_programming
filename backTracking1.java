public class backTracking1 {
    public static void ChangeArray(int[] arr,int i,int val) {
        //base
        if (i==arr.length){
            printArray(arr);
            return;
        }

        //recursion
        arr[i]=val;
        ChangeArray(arr,i+1,val+1);
        arr[i]=arr[i]-2;//backTracking

    }

    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr=new int[5];
        ChangeArray(arr,0,1);//o(n)
        printArray(arr);

    }
}

/*
1 2 3 4 5
-1 0 1 2 3

backTracking- backTracking means follow the any path from starting but meanwhile path goes stop then that condition we will back and search another path.

types of back tracking
1.Decision:-find out the problem and that problem has exit solution or not.
2.Optimization:-find out the best solution from multiple cases.
3.Enumeration:-find to how much possible combination solution of that problem.

 */
