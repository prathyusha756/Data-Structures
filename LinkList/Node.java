package DataStructures.LinkList;
//creating a linkedlist//
public class Node {
    //data fields in the linked list//
    public String bookName;
    public int copiesSold;

    //next pointer //
    public Node next;

    //constructor//
    public Node(String bookName, int copiesSold){
        this.bookName= bookName;
        this.copiesSold=copiesSold;
    }

    public static void main(String[] args){

    }

}

 class LinkList{
    //Declaring head and initialising to null//
     public Node head;
     public LinkList(){
         head= null;
     }
     //Creating a new link and insering //
     public void insertion(String bookName, int copiesSold){
          Node link1=new Node(bookName,copiesSold);
          head.next=link1;
          head=link1;
         //insert link2
          Node link2=new Node(bookName,copiesSold);
     }


}
