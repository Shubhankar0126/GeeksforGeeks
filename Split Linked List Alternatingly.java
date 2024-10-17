//Given a singly linked list's head. Your task is to complete the function alternatingSplitList() that splits the given linked list into two smaller lists. The sublists should be made from alternating elements from the original list.
//Note: 

//The sublist should be in the order with respect to the original list.
//Your have to return an array containing the both sub-linked lists.

/*
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/

class Solution {
    Node[] alternatingSplitList(Node head) {
        Node list1Head = null, list1Tail = null;
        Node list2Head = null, list2Tail = null;

        Node current = head;
        int index = 0;

        while (current != null) {
            if (index % 2 == 0) {
                if (list1Head == null) {
                    list1Head = new Node(current.data);
                    list1Tail = list1Head;
                } else {
                    list1Tail.next = new Node(current.data);
                    list1Tail = list1Tail.next;
                }
            } else {
                if (list2Head == null) {
                    list2Head = new Node(current.data);
                    list2Tail = list2Head;
                } else {
                    list2Tail.next = new Node(current.data);
                    list2Tail = list2Tail.next;
                }
            }
            current = current.next;
            index++;
        }

        return new Node[]{list1Head, list2Head};
    }
}
