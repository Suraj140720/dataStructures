package stacks;
import java.util.ArrayList;

//Stack Implementation using ArrayList
public class stacks1 {
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public void printList(){
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void push(int data){
        list.add(data);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return list.get(list.size() - 1);
    }
}
