import linkedlist_package.linkedlist;
public class floyd_cycle_detection 
{
    public static void main(String[] args) 
    {
        linkedlist<Integer> ll = new linkedlist<>();
        for(int i = 10; i < 100; i+=10)
        {
            ll.add(i);
        }
        ll.cycle();
        boolean bool = (ll.floyd()!=null) ? true : false;
        System.out.println("Is cycle present: " + bool);
        System.out.println("The cycle is starting from node: " + ll.startNode().data);
        System.out.println("Linkedlist after removing cycle: ");
        ll.removeCycle();
        ll.print();
    }
}
