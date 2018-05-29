public class Deque<Item> implements Iterable<Item> {
   private Node first, last;
   
   private class Node {
       Item item;
       Node prev;
       Node next;
   }
   
   public Deque() {
       // construct an empty deque
       first = null;
       last = null;
       Integer length = 0;
   }
   
   public boolean isEmpty() {
       // is the deque empty?
       return first == null;
   }
   
   public int size() {
       // return the number of items on the deque
       return length;
   }
   
   public void addFirst(Item item) {
       // add the item to the front
       Node oldfirst = first;
       first = new Node();
       // Set oldfirst prev pointer to new first
       oldfirst.prev = first;
       first.item = item;
       first.next = oldfirst;
       length++;
   }
   
   public void addLast(Item item) {
       // add the item to the end
       // save a link to the last node
       Node oldlast = last;
       // create a new node for the end
       last = new Node();
       // assign the passed item to it
       last.item = item;
       // set prev pointer
       last.prev = oldlast
       // link the new node to the end of the list
       if (isEmpty()) {
           first = last;
       } else {    
           oldlast.next = last;
       }
       length++;
   }
   
   public Item removeFirst() {
       // grab the first item
       Item item = first.item;
       // set the first pointer to the second item in the list
       first = first.next;
       // set the new first prev pointer to null
       first.prev = null;
       if (isEmpty()) {
           last = null;
       } else {
           length--;
           return item;
       }
   }
   
   public Item removeLast() {
       // remove and return the item from the end
       Item item = last.item;
       // set the second to last item as the new last
       last = last.prev;
       // set the new last next pointer to null
       last.next = null;
   }
   
   public Iterator<Item> iterator() {
       // return an iterator over items in order from front to end
       return new ListIterator();
   }
   private class ListIterator() implements Iterator<item> {
       // code
   }
   public static void main(String[] args)   // unit testing (optional)
}