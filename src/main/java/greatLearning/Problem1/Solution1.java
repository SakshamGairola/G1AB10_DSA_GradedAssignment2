package greatLearning.Problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution1 {

    /*stack.add(4);
        stack.add(3);
        stack.add(1);
        stack.add(2);
        stack.add(5);

        Scanner sc = new Scanner(System.in);

        for (int i : stack){
            System.out.print(i + " ");
        }
        System.out.println();
//        int arg = sc.nextInt();
//        System.out.println(stack.indexOf(arg));
//
//        arg = sc.nextInt();
//        System.out.println(stack.get(stack.indexOf(arg)));
//
//        arg = sc.nextInt();
//        System.out.println(stack.contains(arg));

        int arg = sc.nextInt();
        System.out.println(stack.remove(stack.indexOf(arg)));

        for (int i : stack){
            System.out.print(i + " ");
        }



        //methods to use
        /*
        * linkLast
        * contains
        * remove(@index)
        * size
        * get(@index)
        * indexOf  >
        * */
    //Deque<Integer> stack = new LinkedList<Integer>();
    LinkedList<Integer> stack = new LinkedList<Integer>();
    ArrayList<Integer> deliveredFloors = new ArrayList<Integer>();

    int floors = 10;

    public Solution1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total no of floors in the building: ");
        floors = sc.nextInt();

        for (int i = 0; i < floors; i++) {
            System.out.print("Enter the floor size given on day " + (i + 1) + ": ");
            deliveredFloors.add(sc.nextInt());
            //System.out.println();
        }
        System.out.println("The order of construction is as follows");

        assemble();
    }

    void assemble() {
        int day = floors;
        for (int i = 0; i < day; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            if (deliveredFloors.get(i) == floors) {
                System.out.print(deliveredFloors.get(i) + " ");
                floors -= 1;
                while (stack.contains(floors)) {
                    System.out.print(stack.get(stack.indexOf(floors)) + " ");
                    stack.remove(stack.indexOf(floors));
                    floors -= 1;
                }
            } else {
                stack.add(deliveredFloors.get(i));
            }
            System.out.println();
        }
    }
}
