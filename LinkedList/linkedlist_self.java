import linkedlist_package.linkedlist;

public class linkedlist_self 
{
    public static void main(String[] args) 
    {
        linkedlist<Integer> ll = new linkedlist<>();
        System.out.println("Is linkedlist empty: " + ll.isEmpty());
        for(int i = 0; i < 5; i++)
        {
            ll.add(i);
        }
        System.out.println("Linkedlist after adding: ");
        ll.print();
        ll.add(0,5);
        System.out.println("Linkedlist after adding at a index: ");
        ll.print();
        ll.delete();
        System.out.println("Linkedlist after deleting last node: ");
        ll.print();
        ll.delete(2);
        System.out.println("Linkedlist after deleting a particular node: ");
        ll.print();
        System.out.println("No of elements in linkedlist: " + ll.size());
        System.out.println("Is linkedlist empty: " + ll.isEmpty());
        System.out.println("Linkedlist contains element 1:" + ll.contains(1));
        System.out.println("Linkedlist contains element 4:" + ll.contains(4));
        System.out.println("Linkedlist contains element 1:" + ll.indexOf(2));
        System.out.println("Linkedlist contains element 1:" + ll.get(1));
        ll.reverse();
        System.out.println("Reversed Linkedlist: ");
        ll.print();
        boolean bool = (ll.floyd()!=null) ? true : false;
        System.out.println("Is cycle present: " + bool);
        System.out.println("The cycle is starting from node: " + ll.startNode());
        System.out.println("Linkedlist after removing cycle: ");
        ll.removeCycle();
        ll.print();
    }    
}
