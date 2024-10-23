//Given a single linked list, calculate the sum of the last n nodes.

//Note: It is guaranteed that n <= number of nodes.

Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n){
          int count=0;
       Node temp=head;
       
       while(temp!=null){
           count++;
           temp=temp.next;
       }
       
       int diff=Math.abs(count-n);
       temp=head;
       
       for(int i=1;i<=diff;i++){
           temp=temp.next;
       }
       
       int sum=0;
       while(temp!=null){
           sum+=temp.data;
           temp=temp.next;
       }
       return sum;
    }
