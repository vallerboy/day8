import java.util.ArrayDeque;
import java.util.Queue;

public class SomeQueue {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.add("test");
        queue.add("to moje zdanie");
        queue.add("to twoje zdanie");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        //zwraca ale nie usuwa, rzuca exception gdy kolejka pusta
        //queue.element()

        //zwraca ale nie usuwa, nie rzuca exception, ale zwraca null
        //queue.peek()

        //zwraca i usuwa, nie rzuca exception jesli pusta
        //queue.poll()

        //zwraca i usuwa, rzuca exception jesli pusta
        //queue.remove();

        // Dodaje i exception
        //queue.add()

        //Dodaje i brak exception
        //queue.offer()

        ArrayDeque<String> queue1 = new ArrayDeque<>();
        queue1.add("hejo");
        queue1.add("hejo1");
        queue1.add("hejo2");
        queue1.add("hejo3");

        System.out.println(queue1.pollLast());
        System.out.println(queue1.pollLast());
        System.out.println(queue1.pollLast());
        System.out.println(queue1.pollLast());
    }
}
