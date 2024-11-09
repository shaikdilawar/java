import java.util.ArrayList;
import java.util.List;

public class Lists{
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(4);
        num.add(5);
        System.out.println(num);
        System.out.println(num.indexOf(4));
    }
}