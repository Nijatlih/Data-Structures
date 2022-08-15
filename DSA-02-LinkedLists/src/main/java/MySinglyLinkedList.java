import java.util.NoSuchElementException;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // methods here!
    boolean isEmpty(){

        return head==null;
    }
    // Adds element into last position in the linked list
    void add(int data){
        // create a new node with data value
        Node node=new Node(data);
        // check if empty

        if(isEmpty()){head=tail=node;
        }
        else { // add element to last position
            tail.next=node;
            tail=node;
        }
        size++;
    }

    void printNodes() {
        Node current=head;
        while(current!=null){
            if(current.next==null)
                System.out.print(current.value + "=> null");
            else System.out.print(current.value +"=>");
            current=current.next;
        }
        System.out.println();
    };
    // deletes all items with the value
    void deleteNode(int value) {
        if (isEmpty())
            System.out.println("No values with the value send!!!");
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.value == value) {// if you find a match
                if (current == head) { // if the item tobe deleted is the head
                    head = current.next;
                    current.next = null;// will be available for garbage collection
                } else if (current == tail) {// if the item tobe deleted is the tail
                    tail = prev;
                    prev.next = null;
                } else {// if the item tobe deleted is in the middle
                    prev.next = current.next;
                    current.next = null;
                }
                size--;// decrease the size once you
            }
            prev = current;
            current = current.next;
        }

    }

    int indexOf(int value){
        int pos=0;
        Node current=head;
        if (isEmpty()) return-1;
        while(current!=null) {
            if (current.value==value)
                return pos;
            pos++;
            current=current.next;
        }
        return -1;
    }

}
