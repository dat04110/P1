package queue.array;

class QueueArray {
    private int[] queue;  // Array to store queue elements
    private int front, rear, capacity;  // Front and rear pointers, capacity

    // Constructor to initialize the queue
    public QueueArray(int size) {
        queue = new int[size];  // Create array with given size
        capacity = size;
        front = 0;
        rear = -1;
    }

    // Enqueue operation (add an element)
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + data);
            return;
        }
        queue[++rear] = data;  // Increment rear and insert element
        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation (remove an element)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Nothing to dequeue.");
            return -1;
        }
        int removedElement = queue[front];  // Retrieve front element
        front++;  // Move front pointer forward
        return removedElement;
    }

    // Peek operation (view front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];  // Return front element
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Check if queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main method to test queue
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5); // Create queue of size 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        queue.display();
    }
}
