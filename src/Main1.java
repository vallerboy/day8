import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> someList = new LinkedList<>();
        someList.add("Hejo!");
        someList.add("Witaj!");

        printList(someList);
    }

    public static void printList(List<String> someList){
        for (String s : someList) {
            System.out.println(s);
        }
    }
}
