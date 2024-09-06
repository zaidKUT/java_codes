package Coding;

public class stack {
    int top = 0;

    void push(int n, int[] arr) {
        if (top == arr.length) {
            System.out.println("Stack overflow");
            return;
        }
        arr[top] = n;
        top++;
    }

    int pop(int[] arr) {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; // or throw an exception
        }
        top--;
        return arr[top];
    }

    int peek(int[] arr) {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return arr[top - 1];
    }

    boolean isEmpty() {
        return top == 0;
    }

    void display(int[] arr) {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

        public boolean isPalindrome(String str) {
        int length = str.length();
        int mid = length / 2;
        char[] stack = new char[mid]; // Use an array as a stack
    
        // Push the first half of characters onto the stack
        for (int i = 0; i < mid; i++) {
            stack[i] = str.charAt(i);
        }
    
        // Compare the characters in the stack with the second half of the string
        int i;
        if (length % 2 == 0) {
            i = mid;
        } else {
            i = mid + 1;
        }
        while (i < length) {
            char ch = stack[--mid];
            if (ch != str.charAt(i)) {
                System.out.println("it is not a palindrome");;
            }
            i++;
        }
    
        System.out.println("it is a palindrome");
        return true;
    }

    public static void main(String[] args) {
        stack st = new stack();
        int[] arr = new int[10];
        st.push(5, arr);
        st.push(6, arr);
        st.push(7, arr);

        System.out.println("Top element: " + st.peek(arr));
        System.out.println("Popped element: " + st.pop(arr));
        System.out.println("Top element after pop: " + st.peek(arr));
        System.out.println("Is the stack empty? " + st.isEmpty());
        System.out.println(st.isPalindrome("malayalam"));

        st.display(arr);
    }
}
