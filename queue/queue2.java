//circular Queue using Arrays
public class queue2 {
    
    int arr[];
    int size;
    int front;
    int rear;

    queue2(int n){
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    //Check if Queue is empty
    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    //check if Queue is full
    public boolean isFull(){
        return (rear + 1) % size == front;
    }

    //Add in Queue
    public void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
        System.out.println(data + " is added to Queue");
    }

    //Remove from Queue
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        if(front == rear){
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    //Peek in Queue
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}
