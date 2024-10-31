//Given a sorted doubly linked list and an element x, you need to insert the element x into the correct position in the sorted Doubly linked list(DLL).

//Note: The DLL is sorted in ascending order

//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Ignore the newline character after t

        while (t-- > 0) {
            String input = sc.nextLine(); // Read the entire line for the array elements
            String[] values = input.split(" ");

            Node head = null, tail = null;
            for (String value : values) {
                int x = Integer.parseInt(value);
                if (head == null) {
                    head = new Node(x);
                    tail = head;
                } else {
                    tail.next = new Node(x);
                    tail.next.prev = tail;
                    tail = tail.next;
                }
            }

            int valueToInsert = sc.nextInt();
            if (sc.hasNextLine()) {
                sc.nextLine(); // Ignore the newline character after the value
            }

            Solution obj = new Solution();
            head = obj.sortedInsert(head, valueToInsert);
            printList(head);
        
System.out.println("~");
}

        sc.close();
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        Node newNode=new Node(x);
        Node prev=null;
        Node curr=head;
        if(curr==null)return newNode;
        if(curr.next==null)
        {
            if(curr.data<x)
            {
                curr.next=newNode;
                newNode.next=null;
                newNode.prev=curr;
                return curr;
            }
            else if(curr.data>x)
            {
                newNode.next=curr;
                newNode.prev=null;
                curr.next=null;
                return newNode;
            }
            
        }
        if(curr.data>x)
        {
            newNode.next=curr;
            newNode.prev=null;
            curr.prev=newNode;
            return newNode;
        }
        boolean isFit=false;
        while(curr.next!=null)
        {
            if(curr.next.data>x)
            {
                newNode.next=curr.next;
                newNode.prev=curr;
                curr.next=newNode;
                isFit=true;
            }
            if(isFit)break;
            curr=curr.next;
        }
        if(!isFit)
        {
            curr.next=newNode;
            newNode.prev=curr;
            newNode.next=null;
        }
        return head;
    }
}
