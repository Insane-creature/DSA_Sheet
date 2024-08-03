import java.util.Vector;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

class middleofLinkedList {

    static int getMiddle(Node head){
        Vector<Integer> list_values= new Vector<>();
        while (head != null) {
            list_values.add(head.data);
            head = head.next;
        }
      
        // Find the middle index
        int mid_index = list_values.size() / 2;
        
        return list_values.get(mid_index);
         
    }
    public static void main(String[] args){
        // System.out.println("hello");
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(
            "Middle Value Of Linked List is: "
            + getMiddle(head));
    }
}