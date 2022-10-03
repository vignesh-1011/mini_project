package collections.org;


import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        
        Stack<Integer> stack=new Stack<Integer>();
        
        stack.push(67);
        stack.push(90);
        stack.push(66);
        stack.push(33);
        
        System.out.println(stack);
        
        stack.pop();
        
        System.out.println(stack);
        
        System.out.println(stack.remove(1));
        System.out.println(stack);

    }

}