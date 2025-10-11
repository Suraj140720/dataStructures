public class queue {
    public static void main(String[] args)
    {

        //Queue using linked list
        queue3 q = new queue3();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        while(!q.isEmpty()){
            System.out.println(q.peek() + " is removed from Queue");
            q.remove();
        }
        System.out.println(q.peek());
        q.add(7);
        System.out.println(q.peek());

        // queue2 q = new queue2(5);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);
        // while(!q.isEmpty()){
        //     System.out.println(q.peek() + " is removed from Queue");
        //     q.remove();
        // }
        // System.out.println(q.peek());
        // q.add(7);
        // System.out.println(q.peek());

        //Queue using arrays

        // queue1 q = new queue1(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);

        // while(!q.isEmpty()){
        //     System.out.println(q.peek() + " is removed from Queue");
        //     q.remove();
        // }

        // System.out.println(q.peek());
    }
}
