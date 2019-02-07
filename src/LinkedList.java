class LinkedList {

    /*
    Given a singly linked list and an integer k, remove the kth last element from the list.
    k is guaranteed to be smaller than the length of the list.
     */
    Node head; // head of the list

    /* Linked List node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to get the kth node from the last of a
       linked list */
    void printNthFromLast(int k)
    {
       Node temp = head;
       int counter = 0;

       while(temp != null){
           temp = temp.next;
           counter++;
       }

       if(counter < k) {
           System.out.println("k larger than list");
           return;
       }

       temp = head;

       for(int i = 1; i <counter-k+1; i++) temp = temp.next;

        System.out.println(temp.data);
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static void main(String [] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
        llist.push(10);

        llist.printNthFromLast(6);
    }
}