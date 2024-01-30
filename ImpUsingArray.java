public class ImpUsingArray {
    static class Queue {
        int size;
        int arr[];
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full. Cannot enqueue element " + data);
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue element.");
                return;
            }
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }


        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display(); // Output: Queue: 1 2 3

        queue.dequeue();
        queue.display(); // Output: Queue: 2 3

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6); // Trying to enqueue when queue is already full


    }
}