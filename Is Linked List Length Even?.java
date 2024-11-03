//Given a linked list, your task is to complete the function isLengthEven() which contains the head of the linked list, and
//check whether the length of the linked list is even or not. Return true if it is even, otherwise false.

class Solution {
    public boolean isLengthEven(Node head) {
        if(head == null){
            return true;
        }
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
