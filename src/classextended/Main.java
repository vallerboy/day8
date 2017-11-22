package classextended;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Damian", "Kolodziej", 24);
        Person person1 = new Person("Kacper", "Kowalczyk", 32);

        if(person == person1){
            System.out.println("Sa takei same");
        }else{
            System.out.println("nie sa");
        }
    }
}
