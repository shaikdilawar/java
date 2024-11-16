import java.util.ArrayList;
import java.util.Scanner;


//if the array size is not fixed
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
//        list.add(10);
//        list.add(12);
//        list.add(15);
//        list.add(20)
//        list.add(10);
//        list.add(12);
//        list.add(15);
//        list.add(20);

//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
        list.add(sc.nextInt());
        }
        //Directly printing the list
      //  System.out.println(list);   //ArrayList has a built-in toString() method

        //If you want to print each element on a new line, use a for loop
        for (int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }

        //enhanced for loop
//        for (int num : list)
//        {
//            System.out.println(list);
//        }
    }
}
