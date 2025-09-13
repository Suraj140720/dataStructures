package linkedList;

public class doublyLinkedList {
    
    public static NodeDLL head;
    public static NodeDLL tail;
    public static NodeDLL prev;
    public static int size;

    //Add First DLL
    public NodeDLL addFirst(int data)
    {
        NodeDLL newNode = new NodeDLL(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return head;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        return head;
    }

    //Add Last DLL
    public NodeDLL addLast(int data)
    {
        NodeDLL newNode = new NodeDLL(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return head;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

        return head;
    }

    //Delete First
    public NodeDLL removeFirst(NodeDLL head)
    {
        if(head == null || head.next == null)
        {
            head = tail = null;
            return head;
        }

        head = head.next;
        head.prev = null;
        size--;

        return head;
    }

    //Remove last
    public NodeDLL removeLast(NodeDLL head)
    {
        size--;
        if(head == null || head.next == null)
        {
            head = tail = null;
            return head;
        }

        tail = tail.prev;
        tail.next = null;

        return head;
    }

    //Print Double Linked List
    public void printDLL(NodeDLL head)
    {
        NodeDLL temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Reverse DLL
    public void reverse()
    {
        NodeDLL prev = null;
        NodeDLL curr = tail = head;
        NodeDLL Next;

        while(curr != null)
        {
            Next = curr.next;
            curr.next = prev;
            curr.prev = Next;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }
}
