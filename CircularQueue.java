public class CircularQueue {
    static class Queue {
        int size;
        int arr[];
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public boolean isEmpty(){
            return rear==-1 && front == -1;
        }
        public boolean isFull(){
            return (rear+1)%size  == front;
        }
        public void add(int data){

            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            if(front == -1){
                front  = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;

        }
        public void delete(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            front = (front+1)%size;
        }
        public void display(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println("Elemnts of Stack is: ");
            if(front<rear){
                for(int i = front;i<arr.length;i++){
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
            else {
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i]);
                }

                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();

        q.delete();
        q.add(4);
        q.display();
    }
}
