//Queue using Arrays
public class queue1 {
    
    int arr[];
    int size;
    int rear;

    queue1(int n)
    {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    //Check if Queue is empty
    public boolean isEmpty(){
        return rear == -1;
    }

    //Add in Queue
    public void add(int data){
        if(rear == size - 1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
        System.out.println(data + " is added to Queue");
    }

    //Remove from Queue
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];

        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }

        rear--;
        return front;
    }

    //Peek in Queue
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }
}
