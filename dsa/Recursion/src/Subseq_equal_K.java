import java.util.ArrayList;
import java.util.List;

public class Subseq_equal_K {
    static  void subseq(int idx, List<Integer> ds, int sum, int target, int[] arr){
        if(idx==arr.length) {
            if(target ==sum){
                System.out.println(ds);
            }
            return;
        }

        ds.add(arr[idx]);

        //pick
        sum = sum + arr[idx];
        subseq(idx+1,ds,sum, target,arr);

        ds.remove(ds.size()-1);

        //not - pick
        sum = sum - arr[idx];
        subseq(idx+1,ds,sum, target,arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int target =2;
        List<Integer> ds = new ArrayList<>();
        subseq(0,ds,0, target,arr);
    }
}
