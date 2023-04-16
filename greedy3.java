import java.util.Arrays;
import java.util.Comparator;

public class greedy3 {
    public static void main(String[] args) {
        int[] val={60,100,120};
        int[] weight={10,20,30};
        int Tw=50;

        double ratio[][]=new double[val.length][2];

        //0th column=>index and 1st colm=>item ration

        for (int i=0; i< val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        //ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));


        int capacity =Tw;
        int finalVal=0;
        for (int i=ratio.length-1; i>=0; i--){
            int index = (int)ratio[i][0];
            if (capacity>=weight[index]){
                finalVal+=val[index];
                capacity -= weight[index];

            }else{
                //fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity=0;
            }
        }
        System.out.println("final value="+finalVal);
    }
}
