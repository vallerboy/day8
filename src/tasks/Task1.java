package tasks;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() <= 6)
            numbers.add(random.nextInt(50 - 1) + 1);

        for (Integer number : numbers) {
            System.out.println(number);
        }
        //numbers.forEach(System.out::println);
    }
}
