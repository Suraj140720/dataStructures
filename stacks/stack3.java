package stacks;
import java.util.Stack;

public class stack3 {

    public void printStack(Stack<Integer> s){
         while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public String reverseString(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public int[] stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i = 1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                span[i] = i + 1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
        return span;
    }

    public int[] nextGreaterElement(int arr[]){
        int[] nge = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        nge[arr.length - 1] = -1;
        s.push(arr[arr.length - 1]);

        for(int i = arr.length - 2; i >= 0; i--){
            while(!s.isEmpty() && arr[i] >= s.peek()){
                s.pop();
            }

            if(s.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return nge;
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == '(' || c == '[' || c == '{')
            {
                st.push(c);
            }else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                if((st.peek() == '(' && c == ')')
                    || (st.peek() == '{' && c == '}')
                    || (st.peek() == '[' && c == ']'))
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        
        if(st.isEmpty())
        {
            return true;
        }
        return false;
    }

    public boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch== ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
}
