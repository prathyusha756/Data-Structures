package DataStructures.LinkList;

import java.util.Stack;

public class LinkedList {

    Node head;//head of the linked list//
    //Linked list node//
    static class Node{
        int data;
        //declaring next pointer//
        Node next;
        //Constructor to initialise data. next by default is initialised as null//
        public Node(int data){
            this.data=data;
        }
    }
    //traversing a linked list//
    public void traversing(){
        Node n=head;
        while(n!= null){
            System.out.print(n.data+"  ");
            n=n.next;
        }

    }

    //add node at front//
    public void addAtFront(){
        Node node4=new Node(4);
        node4.next=head;
        head=node4;
        System.out.println();
        traversing();
    }

    //Add a node at front of a given node//
    public void addAtGiven(Node node, int data){
        Node node5=new Node(data);
        node5.next=node.next;
        node.next=node5;
        System.out.println();
        traversing();

    }
    //Add node at the end//
    public void atEnd(int data){
        Node node6=new Node(data);
        head.next.next.next.next.next=node6;
        node6=null;
        System.out.println();
        traversing();
    }
    public static void main(String[] args){
        //Creating a simple linked list with three nodes//

        //creates three independent nodes node1,node2,node3//
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        LinkedList obj=new LinkedList();

        //Head points to the node1//
        obj.head=node1;
        //node1 links to the node2//
        obj.head.next=node2;
        //node2 links to the node3//
        node2.next=node3;
        //calling a traversing method//
        obj.traversing();
        obj.addAtFront();
        obj.addAtGiven(obj.head.next.next,5);
        obj.atEnd(6);

//        Stack<Integer> stack=new Stack<Integer>();
//        stack.empty()

    }


}
