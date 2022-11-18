/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 09 - PatienceSort
 */

import java.util.Arrays;

public class PatienceSort {

    // the patience sort algorithm
    public static void patienceSort(int data[]) throws Exception {

        // this is the list of stacks (each a stack of integers)
        LinkedList<Stack<Integer>> stacks = new LinkedList<>();
        Stack<Integer> intStack = new Stack<>();

        // TODO #1: loop through the data array and get the array's current element
        for (int i = 0; i < data.length; i++){
            Stack<Integer> newStack = new Stack<>();
            newStack.push(data[i]);
            if (stacks.isEmpty()){
                stacks.append(newStack);
            }else{
                for (int y = 0; y < stacks.size();){
                    // add dont append value added
                    if (stacks.get(y).peek() > newStack.peek()){
                        stacks.get(y).push(newStack.pop());
                        break;

                    }else{
                        y++;
                        if (y == stacks.size()){
                            Stack<Integer> newInt = new Stack<>();
                            newInt.push(newStack.pop());
                            stacks.append(newInt);
                            break;
                        }
                    }
                }
            }
        }

        // TODO #2: at each iteration, find a stack available and push the array's current element onto it
//        while (!intStack.isEmpty()){
//            if (stacks.isEmpty()){
//                Stack<Integer> newI = new Stack<>();
//                newI.push(intStack.pop());
//                stacks.add(newI);
//            }
//            if (!stacks.isEmpty()){
//                for (int i = 0; i < stacks.size();){
//                    if (stacks.get(i).peek() > intStack.peek()){
//                        stacks.get(i).append(intStack.pop());
//                        break;
//                    }else{
//                        if (stacks.get(i).peek() < intStack.peek()){
//                            i++;
//                        }
//                    }
//                }
//                Stack<Integer> newInt = new Stack<>();
//                newInt.push(intStack.pop());
//                stacks.append(newInt);
//            }
//
//        }
        // TODO #3: if there isn't a stack available, create a new one, push the data array's current element onto it, and then append the newly created stack to the list of stacks.

        // merge of stacks
        if (stacks.isEmpty())
            return;
        System.out.println(stacks);
        for (int i = 0; i < data.length; i++) {
            Stack<Integer> stackMin = stacks.get(0);
            int j = 0;
            for (int k = 1; k < stacks.size(); k++) {
                Stack<Integer> stackCurrent = stacks.get(k);
                if (stackCurrent.peek() < stackMin.peek()) {
                    stackMin = stackCurrent;
                    j = k;
                }
            }
            data[i] = stackMin.pop();
            if (stackMin.isEmpty())
                stacks.remove(j);
        }
    }

    public static void main(String[] args) throws Exception {
        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        patienceSort(data);
        System.out.println(Arrays.toString(data));
    }
}
