import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++){
            names.add( "Oskar"+i);
        }
        long stop = System.currentTimeMillis();


        LinkedList<String> names1 = new LinkedList<>();
        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++){
            names1.add( "Oskar"+i);
        }
        long stop1 = System.currentTimeMillis();

        System.out.println("Czas ArrayListy przy dodawaniu: " + (stop - start));
        System.out.println("Czas LinkedListy przy dodawaniu: " + (stop1 - start1));


        long start2 = System.currentTimeMillis();
        for (int i = 250000; i < 1000 + 250000; i++) {
            names.get(i);
        }
        long stop2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        for (int i = 250000; i < 1000 + 250000; i++) {
            names1.get(i);
        }
        long stop3 = System.currentTimeMillis();


        System.out.println("Czas get ArrayListy: " + (stop2 - start2));
        System.out.println("Czas get LinkedListy: " + (stop3 - start3));

    }
}
