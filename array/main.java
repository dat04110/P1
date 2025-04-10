package queue.array;

public class main { // Class name capitalized as per Java convention
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5); // Create queue with capacity 5

        queue.enqueue(5);   // Add 5
        queue.enqueue(8);   // Add 8
        queue.enqueue(10);  // Add 10

        System.out.println("Queue:");
        queue.display();    // Print initial queue

        System.out.println("Dequeued: " + queue.dequeue()); // Remove front element (5)
        System.out.println("Queue after dequeue:");
        queue.display();    // Print queue after dequeue
    }
}