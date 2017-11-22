package tasks;

public class Task4 {
    public static void main(String[] args) {
        int number = 421;
        StringBuilder asd = new StringBuilder();

        while (number != 0) {
            float rest = number % 2;
            if(rest > 0){
               asd.append("1");
            }else{
                asd.append("0");
            }
            number /= 2;
        }
        System.out.println(asd);
        System.out.println(Integer.toString(421, 2));
    }
}
