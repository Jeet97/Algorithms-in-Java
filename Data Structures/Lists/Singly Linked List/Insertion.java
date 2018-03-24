class linkedlist
{
Node head;          //This will point to the head node of the list.Initially, it is NULL.



//Structure of a particular node will be defined in Node inner class. 

static class Node
{

int data;           //Data to be stored at a particular node.
Node next;          //'next' will point to the next node in the list. 

Node(int data)
{
this.data = data;   //Filling the data to that particular node.
}
}


//Method to print whole list 

void printlist()
{
Node n = head;


System.out.println("List Items:- ");
while(n!=null)
{
System.out.println(n.data);
n = n.next;          //Updating the n everytime to point to next node.
}
}


//Method for Insertion in front of list

void insert_at_front()
{
Node n = new Node(0);    // Creating node to be inserted.

n.next = head;         // Linking new node to previous head node.

head = n;             //Updating new head node as new node.



}
}



public class Insertion
{

public static void main(String args[])
{

linkedlist ll = new linkedlist();

ll.head = new linkedlist.Node(1);           //This will be the first node i.e head node.

//Consecutive Nodes....
linkedlist.Node second = new linkedlist.Node(2);  
linkedlist.Node third = new linkedlist.Node(3);


ll.head.next = second;           //Now, next variable in head node will point to second node object and so on..;

second.next = third;

ll.insert_at_front();


ll.printlist();

}




}