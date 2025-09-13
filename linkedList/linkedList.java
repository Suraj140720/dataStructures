package linkedList;

public class linkedList{
    public static void main(String[] args)
    {
        doublyLinkedList dll = new doublyLinkedList();
        dll.addFirst(3);    
        dll.addFirst(0);
        dll.addLast(5);
        dll.printDLL(dll.head);
        dll.reverse();
        dll.printDLL(dll.head);

        // NodeDLL head = dll.removeFirst(dll.head);
        // dll.printDLL(head);
        // System.out.println("Size: " + dll.size);
        // dll.removeLast(dll.head);
        // dll.printDLL(dll.head);
        // System.out.println("Size: " + dll.size);

        //    Node head = new Node(7);
        //     Node second = new Node(4);
        //     Node third = new Node(3);
        //     Node fourth = new Node(1);

        // Linking: 7 → 4 → 3 → 1
        // head.next = second;
        // second.next = third;
        // third.next = fourth;

        // Now make 1 → 4 (loop)
        //fourth.next = second;

        // linkedList2 list2 = new linkedList2();
        // linkedList1 list = new linkedList1();
        // list.addFirst(4);
        // list.addFirst(3);
        // list.addFirst(7);   
        // list.addFirst(0);
        // list.addFirst(9);
        // list.printList(list.head);
        // list.head = list2.mergeSort(list.head); 
        // list.printList(list.head);
        // list2.zigZagLL(list.head);
        // list.printList(list.head);

        // System.out.println(list2.removeCycle(head));
        // list.printList(head);

        // linkedList1 list = new linkedList1();
        // linkedList2 list2 = new linkedList2();
        // list.addLast(10);
        // list.addLast(20);
        // list.affFirst(5);
        // list.addInMiddle(2, 15);
        // list.addFirst(10);
        // list.addLast(20);
        // list.addLast(30);
        // list.printList();
        // System.out.println(list.size());
        // list2.findMid(list.head);
        // System.out.println("Middle Node: " + list2.findMid(list.head).data);
        // System.out.println("Is Palindrome: " + list2.isPalindrome(list.head));
        //list.removeFromLast(4);
        //System.out.println(list.size());
        //list.printList(); 
        // list.removeFirst();
        // list.printList();
        // list.removeLast();
        // list.printList(); 
        // System.out.println("Size of the list: " + list.size());
        // System.out.println(list.searchKey(15));
    }
}

