/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Activity 10 - QueueDriver
 */

public class QueueDriver {

    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new Queue<>();
        System.out.println(queue);
        queue.push(5);
        queue.push(8);
        queue.push(3);
        System.out.println(queue);
//        while (!queue.isEmpty())
//            System.out.println(queue.pop());
        for (int el: queue)
            System.out.println(el);
    }
}
