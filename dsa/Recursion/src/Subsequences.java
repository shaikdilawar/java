import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    static void subseq(int idx, List<Integer> ds, int[] arr){
            if(idx>= arr.length){
                System.out.println(ds);
                return;
            }

            ds.add(arr[idx]);
        // --- "Pick" the element ---
        // Add the element at the current index to the subsequence.
            subseq(idx+1,ds,arr);

        //Remove the element to explore the "not pick" path.
             ds.remove(ds.size()-1);

        // --- "Not Pick" the element ---
        // Make a recursive call without adding the current element.
             subseq(idx+1,ds,arr);


    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> ds = new ArrayList<>();
        subseq(0,ds,arr);
    }
}
