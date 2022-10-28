//Package Declaration
package linkedlist_package;

public class linkedlist<T>      //Generic class declaration
{
    // Node Class
    public class Node
    {
        public T data;
        Node next;

        // Node Constructor with data as argument
        Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Add element in the end of the LinkedList
    public void add(T data)
    {
        Node newNode = new Node(data);
        
        //If head is null, then add the element to the head and set next to null
        if(head == null)
        {
            head = newNode;
            head.next = null;
            return;
        }
        Node currNode = head;
        
        //while the next of current node is not null move forward
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        //set the next of current node with the newNode;
        currNode.next = newNode;
    }

    //Add element at a particular index
    public void add(int index, T data)
    {
        Node newNode = new Node(data);
        Node temp1 = head, temp2 = head;
        
        //Traverse to the particular index
        for(int i = 0; i < index; i++)
        {
            if(temp1 == null)
            {
                break;
            }
            temp2 = temp1;
            temp1 = temp1.next;
        }

        //If the element is to be added in the start
        if(temp1 == head)
        {
            newNode.next = temp1;
            head = newNode;
            return;
        }

        //Add the element at the index by changing the next of previous node to the new node and next of new node to next of previous node
        temp2.next = newNode;
        newNode.next = temp1;
    }

    //Print the LinkedList
    public void print()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("Linkedlist is Empty");
            return;
        }
        // Printing the LinkedList
        while(temp.next != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    //Delete the node at the particular index
    public void delete(int index)
    {
        Node temp1 = head, temp2 = head;
        if(head == null)
        {
            System.out.println("Linkedlist is Empty");
            return;
        }

        //Traverse till the index
        for(int i = 0; i < index; i++)
        {
            //if index is larger than the size of linkedlist
            if(temp1 == null)
            {
                System.out.println("Index out of range");;
            }
            temp2 = temp1;
            temp1 = temp1.next;
        }
        //Delete the node by changing the next of previous node with the next of next node
        temp2.next = temp1.next;
    }

    //Delete the last node
    public void delete()
    {
        Node temp1 = head, temp2 = head;
        if(head == null)
        {
            System.out.println("Linkedlist is Empty");
            return;
        }
        if(head.next == null)
        {
            head = null;
        }

        //Traverse till the last node and then change the next of second last node with null
        while(temp1.next != null)
        {
            temp2 = temp1;
            temp1 = temp1.next;
        }
        temp2.next = null;
    }

    // Return the size of the LinkedList
    public int size()
    {
        Node temp = head;
        int count = 0;
        if(head == null)
        {
            return count;
        }

        //Traverse till the end of list and return the size
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //Check if the list is empty or not by checking if head = null or not
    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Checking if a particular element is present in the list or not
    public boolean contains(T data)
    {
        Node temp = head;

        //If list is empty then return false
        if(head == null)
        {
            return false;
        }

        //If element is present in the list then return true else false
        while(temp != null)
        {
            if(temp.data == data)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //Return the element at the particular index
    public T get(int index)
    {
        Node temp = head;
        if(head == null)
        {
            return head.data;
        }

        //Traverse till the index and return the element
        for(int i = 0; i < index; i++)
        {
            //If index is greater than the size of list then return null
            if(temp == null)
            {
                return null;
            }
            temp = temp.next;
        }
        return temp.data;
    }

    //Return the index of the particular element
    public int indexOf(T data)
    {
        Node temp = head;
        if(head == null)
        {
            return -1;
        }
        int count = 0;
        //Traverse till the end of the list
        while(temp != null)
        {
            //If element is found return the count else return -1
            if(temp.data == data)
            {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;  
    }

    //Reverse the list
    public void reverse()
    {
        //Take 2 nodes: prev = null to store previous node and curr = head to store current node
        Node prev = null, curr = head;
        
        //Reverse till curr node is not null
        while(curr != null)
        {
            head = curr;                    //change head to curr
            Node next = curr.next;          //store the next node of curr in next
            curr.next = prev;               //change the next of current node to previous
            prev = curr;                    //change previous to current
            curr = next;                    //change current to next
        }
    }

    //Function to create a cycle
    public void cycle()
    {
        Node temp = head;
        for(int i = 0; i < 3; i++)
        {
            temp = temp.next;
        }
        Node curr = head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next = temp;
    }

    // Floyd cycle detection Algorithm: This will return a Node
    public Node floyd()
    {
        //Declare two pointers: slow and fast. The slow will move one node at a time and fast will move two at a time
        Node slow = head, fast = head;
        //If head is null or linkedlist is empty, then return null
        if(head == null)
        {
            return null;
        }
        // if there is a cycle then the slow and fast pointer will meet at a point. Return the slow node else null
        while(fast.next!=null && fast != null)
        {
            slow = slow.next;
            if(fast.next.next != null)
            {
                fast=fast.next.next;
            }
            else
            {
                return null;
            }
            if(slow == fast)        //when slow and fast pointer meet return the slow node
            {
                return slow;
            }
        }
        return null;
    }

    //Function to find the starting node
    public Node startNode()
    {
        Node meet = floyd();        //find the node where the slow and fast pointers will meet
        Node temp = head;
        if(meet == null)            //if meet is null this means there is no cycle so return null
        {
            return null;
        }
        while(temp != meet)         //the temp and meet pointers will meet at the point where the cycle starts
        {
            temp = temp.next;
            meet = meet.next;
        }
        return meet;
    }

    //Function to remove cycle from the linkedlist
    public void removeCycle()
    {
        Node meet = startNode();        //find the starting node of the cycle
        if(meet == null)
        {
            return;
        }
        Node temp = meet.next;          //start from the next node of cycle starting point
        while(temp.next != meet)        //move till the next node is the start of cycle
        {
            temp = temp.next;
        }
        temp.next = null;               //change the next of the node to null
    }
}
