public class PartTwoTester {
    // Task 1
    public static int diamondCount(Stack stack, String str) {
        // To Do
        // As the stack is storing int type data in the stack and you are checking a String. Consider '>' = 1, '<' = 2 and '.' = 3 for mapping String with integer.
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                stack.push(str.charAt(i));
            }
            else if (str.charAt(i) == '>') {
                if (stack.isEmpty()) {
                }
                else {
                    stack.pop();
                    count++;
                }

            }
        }
        return count;

    }

    // Task 2
    public static void removeBlock(Stack stack, int n) {
        Stack temp = new Stack();
        int count = 1 ;
        while (count < n) {
            temp.push(stack.pop());
            count++;
        }
        stack.pop();
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    // Task 3
    public static Stack conditionalReverse(Stack stack) {
        // To Do
        Stack reversed = new Stack();
        while(!stack.isEmpty()) {
            if (!stack.peek().equals(reversed.peek())) {
                reversed.push(stack.peek());
            }
            stack.pop();
        }
        return reversed;
    }


    // This method is for printing the element of the stack. No need to modify anything.
    public static void printStack(Stack stack) {
        if (stack.isEmpty()) {
            return;
        }
        int elem = stack.pop();
        System.out.println("| " + elem + " |");
        printStack(stack);
        stack.push(elem);
    }

    public static void assertTest(int actual, int expected) {
        if (actual == expected) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed! Expected: " + expected + ", but got: " + actual);
        }
    }


    public static void main(String[] args) {
        // This part is for checking how the Stack class and printing working
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(5);
        s.push(1);
        s.push(9);

        printStack(s);
        System.out.println("------");
        s.pop();
        printStack(s);
        System.out.println("------");
        // Checking End Here

        System.out.println("======Task 1 Test Starts Here=======");

        System.out.println("Test 01");
        Stack stack1 = new Stack();
        String string1 = "<..><.<..>> ";
        int result1 = diamondCount(stack1, string1);
        System.out.println("Number of Diamonds: " + result1); // This should print 3
        assertTest(result1, 3);
        System.out.println("-----------------------------------------");

        System.out.println("Test 02");
        Stack stack2 = new Stack();
        String string2 = "<<<..<......<<<<....>";
        int result2 = diamondCount(stack2, string2);
        System.out.println("Number of Diamonds: " + result2); // This should print 1
        assertTest(result2, 1);
        System.out.println("-----------------------------------------");

        System.out.println("Test 03");
        Stack stack3 = new Stack();
        String string3 = ">>><...<<..>>...>...>>>";
        int result3 = diamondCount(stack3, string3);
        System.out.println("Number of Diamonds: " + result3); // This should print 3
        assertTest(result3, 3);
        System.out.println("-----------------------------------------");

        System.out.println("======Task 1 Test Ends Here=======");

        System.out.println("======Task 2 Test Starts Here=======");

        System.out.println("Test 01");
        Stack st1 = new Stack();
        st1.push(4);
        st1.push(19);
        st1.push(23);
        st1.push(17);
        st1.push(5);

        System.out.println("Stack:");
        printStack(st1);
        System.out.println("------");

        removeBlock(st1, 2);
        System.out.println("After Removal");
        printStack(st1);
        System.out.println("------");

        System.out.println("======================================");
        System.out.println();

        System.out.println("Test 02");
        Stack st2 = new Stack();
        st2.push(73);
        st2.push(85);
        st2.push(15);
        st2.push(41);

        System.out.println("Stack:");
        printStack(st2);
        System.out.println("------");

        removeBlock(st2, 3);
        System.out.println("After Removal");
        printStack(st2);
        System.out.println("------");

        System.out.println("======Task 2 Test Ends Here=======");

        System.out.println("======Task 3 Test Starts Here=======");
        System.out.println("Test 01");
        Stack st = new Stack();
        st.push(10);
        st.push(10);
        st.push(20);
        st.push(20);
        st.push(30);
        st.push(10);
        st.push(50);

        System.out.println("Stack:");
        printStack(st);
        System.out.println("------");

        Stack reversedStack = conditionalReverse(st);

        System.out.println("Conditional Reversed Stack:");
        printStack(reversedStack); // Expected: 50, 10, 30, 20, 10
        System.out.println("------");

        System.out.println("======Task 3 Test Ends Here=======");


    }
}
