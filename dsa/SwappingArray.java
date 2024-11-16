import java.util.Arrays;

public class SwappingArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
            System.out.print(Arrays.toString(arr));
        System.out.println();

        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }
        static void swap(int[] arr,int index1,int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
