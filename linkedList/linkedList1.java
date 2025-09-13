package linkedList; 
import linkedList.Node;
public class linkedList1{

    public Node head;
    public Node tail;

    //Methods
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printList()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printList(Node head)
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size()
    {
        Node current = head;
        int count = 0;
        while(current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }

    public void addInMiddle(int index, int data)
    {
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i !=  index-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
    }

    public void removeLast()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null)
        {
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        while(temp.next != tail)
        {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    //find key in LL
    public boolean searchKey(int key)
    {
        Node current = head;
        while(current != null)
        {
            if(current.data == key)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //Reverse LL
    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head;
        Node Next;
        while(curr != null)
        {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }

    public void removeFromLast(int index)
    {
        index = size() - index;
        if(index == 0)
        {
            removeFirst();
            return;
        }
        Node temp = head;
        int i = 0;
        while(i !=  index-1)
        {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }
}