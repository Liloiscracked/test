package LabSinglyLinkedListImplementation;
//import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        try {
            SLL<Integer> intlist = new SLL<Integer>();
            intlist.addToTail(7);
            intlist.addToTail(5);
            intlist.addToTail(3);
            intlist.addToTail(50);
            intlist.addToTail(7);
            intlist.addToTail(9);
            System.out.println(intlist);
            System.out.println("After inserting 20 before index 4 : ");
            intlist.insertBefore(4, 20);
            System.out.println(intlist);
            int deletedElement = intlist.delete(4);
            System.out.println("Element deleted from index 4:" + deletedElement);
            System.out.println("After deleting element from index 4: ");
            System.out.println(intlist);
            System.out.println("After inserting 30 after the second occurence of 7: ");
            intlist.insertAfterSecondOccurrence(30,7);
            System.out.println(intlist);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

