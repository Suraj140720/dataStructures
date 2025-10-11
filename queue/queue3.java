public class queue3 {
    
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    //Check if Queue is empty
    public boolean isEmpty(){
        return head == null && tail == null;
    }   

    //Add in Queue
    public void add(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Remove from Queue
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.data;
        if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
        return front;
    }

    //Peek in Queue 
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
}
