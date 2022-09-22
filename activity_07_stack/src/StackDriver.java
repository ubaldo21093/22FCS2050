public class StackDriver {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        try {
            System.out.println(stack.pop());
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
        stack.push(5);
        stack.push(3);
        stack.push(8);
        System.out.println(stack);
//        while (!stack.isEmpty()) {
//            try {
//                System.out.println(stack.pop());
//            } catch (Exception ex) {
//                System.out.println(ex);
//            }
//        }
        // use the iterator to show all of the elements of the stack!
        for (int el: stack)
            System.out.print(el + " ");
    }
}
