import java.util.PriorityQueue;
import java.util.Queue;

class ClientService {
    public static void main(String[] args) {
        Queue<Client> clientQueue = new PriorityQueue<>();

        clientQueue.offer(new Client("grażynka",5));
        clientQueue.offer(new Client("kokoszko",9));
        clientQueue.offer(new Client("tyryryry",2));
        clientQueue.offer(new Client("dumbo",0));

        System.out.println(clientQueue);

        System.out.println("Metoda peek() (1): " + clientQueue.peek());
        System.out.println("Metoda peek() (2): " + clientQueue.peek());

        System.out.println("Metoda poll() (1): " + clientQueue.poll());
        System.out.println("Metoda poll() (2): " + clientQueue.poll() + "\n");

        System.out.println("Stan kolejki: " + clientQueue);
        System.out.println("Peek " + clientQueue.peek());
        System.out.println("Stan kolejki: " + clientQueue);
        System.out.println("Poll " + clientQueue.poll());
        System.out.println("Stan kolejki: " + clientQueue);
    }
}