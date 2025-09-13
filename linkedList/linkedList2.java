package linkedList;
import linkedList.Node;

public class linkedList2{

    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node findMidV2(Node head)
    {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(Node head)
    {
        if(head == null || head.next == null)
        {
            return true;
        }

        //Step 1: Find the middle of the linked list
        Node midNode = findMid(head);

        //Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Step 3: Compare the first half and the reversed second half
        Node left = head;
        Node right = prev;

        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false; // no cycle
    }

    public Node removeCycle(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle (Floyd’s)
        boolean cycleExists = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }

        if (cycleExists) {
            // Step 2: Place slow at head, keep fast at meeting point
            slow = head;
            Node prev = null;

            // Step 3: Move slow and fast one step at a time until they meet
            while (slow != fast) {
                prev = fast;   // keep track of last node in cycle
                slow = slow.next;
                fast = fast.next;
            }

            // Step 4: Break the cycle
            prev.next = null;
        }

        return head;
    }

    public Node mergeSort1(Node head1, Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head)
    {
        //Base Case
        if(head == null || head.next == null)
        {
            return head;
        }

        //Step1 : Find middle node in ll
        Node midNode = findMidV2(head);

        //Step2 : Divide LL in 2 parts
        Node rightHalf = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHalf);

        //Step3: merge both sorted LL half
        return mergeSort1(newLeft, newRight);
    }

    public Node zigZagLL(Node head)
    {
        //Step1 : find mid
        Node mid = findMidV2(head);

        //Step2 : reverse second half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;

        //Step3: Make ll zigzag
        Node leftTemp, rightTemp;
        while(head != null && rightHead != null)
        {
            leftTemp = head.next;
            rightTemp = rightHead.next;

            head.next = rightHead;
            rightHead.next = leftTemp;

            head = leftTemp;
            rightHead = rightTemp;
        }
        return head;
    }
}
