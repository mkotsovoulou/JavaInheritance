package pkg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestStackesAndQueues {
    public static void main(String[] args) {
        //LIFO
        System.out.println("This is a stack of papers");
        Stack<String> examsPapers = new Stack<>();
        examsPapers.push("Orestis");
        examsPapers.push("Manolis");
        examsPapers.push("Themistoklis");

        System.out.println("Removing:" + examsPapers.pop());
        System.out.println("Removing:" +  examsPapers.pop());

        System.out.println("----- FINAL TODO LIST ---- ");

        for (String s : examsPapers) {
           System.out.println(s);
       }
        System.out.println("next in line is " + examsPapers.peek());

        //FIFO
        System.out.println("This is a line of people waiting");
        Queue<String> line = new LinkedList<>();
        line.add("Orestis");
        line.add("Manolis");
        line.add("Themistoklis");
        System.out.println("Removing:" + line.poll());
        System.out.println("----- Still Waiting ---- ");
        for (String s : line) {
            System.out.println(s);
        }
        System.out.println("next in line is " + line.peek());

    }
}
