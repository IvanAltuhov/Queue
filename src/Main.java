import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()){
            Person person = queue.poll();
            int quantityTickets = person.getQuantityTickets();
            if (quantityTickets > 0){
                --quantityTickets;
                System.out.printf("%s %s идет на аттракцион, у него осталось %d билетов\n ", person.getName(),person.getSurName(),quantityTickets);
                person.setQuantityTickets(quantityTickets);
                queue.add(person);
            }
        }

    }

    private static List<Person> generateClients() {
       return List.of(
               new Person("Андрей", "Цуканов", 5 ),
               new Person("Александр", "Волков", 3),
               new Person("Максим", "Сухой", 1),
               new Person("Владимир", "Лугов", 4),
               new Person("Василий", "Иванов", 2)
       );
    }
}
