//Given a singly linked list and a key, count the number of occurrences of the given key in the linked list.


class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        int count = 0;
        Node current = head;
        
        while (current != null) {
            if (current.data == key) {
                count++;
            }
            current = current.next;
        }
        
        return count;
    }
}
