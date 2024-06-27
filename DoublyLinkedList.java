import java.util.LinkedList;
import java.util.ListIterator;

public class DoublyLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> doublyLinkedList = new LinkedList<>();

        doublyLinkedList.add(1);
        doublyLinkedList.add(2);
        doublyLinkedList.add(3);
        doublyLinkedList.add(4);
        doublyLinkedList.add(5);

        System.out.println("Doubly Linked List before deletion:");
        displayList(doublyLinkedList);

        int elementToDelete = 3;
        deleteElement(doublyLinkedList, elementToDelete);

        System.out.println("Doubly Linked List after deleting element " + elementToDelete + ":");
        displayList(doublyLinkedList);
    }

    private static void deleteElement(LinkedList<Integer> list, int elementToDelete) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() == elementToDelete) {
                iterator.remove();
                break;
            }
        }
    }

    private static void displayList(LinkedList<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
