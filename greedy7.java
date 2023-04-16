import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class greedy7 {
    static class job{
        int deadLine;
        int profit;
        int id;//0,1,2,3,4.......

        public job(int i,int d,int p){//constructor
            id=i;
            deadLine=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int[][] jobInformation={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs=new ArrayList<>();//job convert in to object



        for (int i=0; i<jobInformation.length;i++){
            jobs.add(new job(i,jobInformation[i][0],jobInformation[i][1]));
        }
        //lemma function
        //to sort any object in descending order
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit);//descending order of profit

        ArrayList<Integer> sequence=new ArrayList<>();
            int time=0;
        for (int i=0; i<jobs.size(); i++){
            job currentJob=jobs.get(i);
            if (currentJob.deadLine>time){
                sequence.add(currentJob.id);
                time++;
            }
        }
        System.out.println("maximum job:"+sequence.size());
        for (int i=0; i<sequence.size(); i++){
            System.out.print(sequence.get(i)+" ");
        }
        System.out.println();
    }
}
