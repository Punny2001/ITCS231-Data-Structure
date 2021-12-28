class Link1
   {
   public long dData;                 // data item
   public Link1 next;                  // next link in list
// -------------------------------------------------------------
   public Link1(long d)                // constructor
      { dData = d; }
// -------------------------------------------------------------
   public void displayLink()          // display this link
      { System.out.print(dData + " "); }
// -------------------------------------------------------------
   }  // end class Link1
////////////////////////////////////////////////////////////////
class FirstLastList
   {
   private Link1 first;               // ref to first link
   private Link1 last;                // ref to last link
// -------------------------------------------------------------
   public FirstLastList()            // constructor
      {
      first = null;                  // no links on list yet
      last = null;
      }
// -------------------------------------------------------------
   public boolean isEmpty()          // true if no links
      { return first==null; }
// -------------------------------------------------------------
   public void insertFirst(long dd)  // insert at front of list
      {
      Link1 newLink = new Link1(dd);   // make new link

      if( isEmpty() )                // if empty list,
         last = newLink;             // newLink <-- last
      newLink.next = first;          // newLink --> old first
      first = newLink;               // first --> newLink
      }
// -------------------------------------------------------------
   public void insertLast(long dd)   // insert at end of list
      {
      Link1 newLink = new Link1(dd);   // make new link
      if( isEmpty() )                // if empty list,
         first = newLink;            // first --> newLink
      else
         last.next = newLink;        // old last --> newLink
      last = newLink;                // newLink <-- last
      }
// -------------------------------------------------------------
   public long deleteFirst()         // delete first link
      {                              // (assumes non-empty list)
      long temp = first.dData;
      if(first.next == null)         // if only one item
         last = null;                // null <-- last
      first = first.next;            // first --> old next
      return temp;
      }
// -------------------------------------------------------------
   public void displayList()
      {
      System.out.print("List (first-->last): ");
      Link1 current = first;          // start at beginning
      while(current != null)         // until end of list,
         {
         current.displayLink();      // print data
         current = current.next;     // move to next link
         }
      System.out.println("");
      }
// -------------------------------------------------------------
   }  // end class FirstLastList
////////////////////////////////////////////////////////////////
class lab03Task1
   {
   public static void main(String[] args)
      {                              
      FirstLastList theList = new FirstLastList();

      theList.insertFirst(5);       
      theList.insertFirst(15);
      theList.insertFirst(25);
      theList.insertFirst(30);

      theList.insertLast(3);       
      theList.insertLast(13);
      theList.insertLast(23);
      theList.insertLast(33);

      theList.displayList();         

      while(!theList.isEmpty()) {
    	  	theList.deleteFirst();
    	  	theList.displayList(); 
      	}
      }  
   }  
////////////////////////////////////////////////////////////////

