public class ImpUsingLL {
   public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node front;
    public static Node rear;

    void insert(int data){
        Node newN = new Node(data);
        if(front == null){
            front = newN;
            newN.next =  front;
            rear = front;
            return;
        }
        rear.next = newN;
        newN.next = front;
        rear = newN;
    }
    void delete(){
        if(front == null){
            System.out.println("UNDERFLOW");
            return;
        }
        else if(front.next == null){
            front = rear = null;
            return;
        }
        front = front.next;
        rear.next = front;
        return;

    }
    void display(){
        if(front==null){
            System.out.println("Queue is Empty");
        }
        Node temp = front;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp!=front);
        System.out.println();

    }
    public static void main(String[] args) {
        front = rear = null;
        ImpUsingLL queue = new ImpUsingLL();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.display();
        queue.delete();
        queue.display();
    }
}
