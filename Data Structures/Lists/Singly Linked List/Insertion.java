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

void insert_at_front(int data)
{
Node n = new Node(data);    // Creating node to be inserted.

n.next = head;         // Linking new node to previous head node.

head = n;             //Updating new head node as new node.



}

//Method for Insertion at lists's end

void insert_at_back(int data)
{
Node tail = new Node(data);
tail.next = null;

if (head==null)      //If list is empty, head will be the last node i.e tail.
{
head = tail;
return;
}


Node temp = head;

while (temp.next!=null)     //Starting from head to last node
temp = temp.next;

temp.next = tail;          //Adding created node in next variable of list.

}


//Method for Insertion after a given position i.e after pos node in code.

void insert_at_position(Node pos, int data)
{
Node n = new Node(data);

n.next = pos.next;   //pos.next will point to node after pos, so we have to set created node next variable to point to it.

pos.next = n;        //Now, creating link btw previous node and created node.


}
}



public class Insertion
{

public static void main(String args[])
{

linkedlist ll = new linkedlist();

ll.head = new linkedlist.Node(2);           //This will be the first node i.e head node.

//Consecutive Nodes....
linkedlist.Node second = new linkedlist.Node(4);  
linkedlist.Node third = new linkedlist.Node(5);


ll.head.next = second;           //Now, next variable in head node will point to second node object and so on..;

second.next = third;


System.out.println("List Before Insertion:-");

ll.printlist();


ll.insert_at_front(1);

ll.insert_at_back(6);

ll.insert_at_position(ll.head.next, 3);


ll.printlist();

}




}