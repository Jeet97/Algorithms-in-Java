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


void swap_nodes(int n1, int n2)
{
if (n1 == n2) return;      // No need of swapping if both keys are equal.

Node prex = null, currx = head;

// We will use currx node to get a node holding data = n1 and prex to get node prior to it.

while (currx!=null && currx.data!=n1)
{
prex = currx;
currx = currx.next;
}

Node prey = null, curry = head;

// We will use curry node to get a node holding data = n2 and prey to get node prior to it.

while (curry!=null && curry.data!=n2)
{
prey = curry;
curry = curry.next;
}

if (currx == null || curry ==null)
return;                             // If any of the node not found, then return. 


if (prex!=null)
prex.next = curry;              // If currx is not the head node of list.
else
head = curry;

if (prey!=null)
prey.next = currx;              // If curry is not the head node of list.
else
head = currx;


//Finally swap the two node's next variables.

Node temp = currx.next;
currx.next = curry.next;
curry.next = temp;

}
}


public class Swapping
{

public static void main(String args[])
{

linkedlist ll = new linkedlist();

for (int i=1;i<11;i++)         //For Inserting data linearly one after another.
{
ll.insert_at_back(i);
}

System.out.println("List before swapping:-");

ll.printlist();

ll.swap_nodes(3,7);


System.out.println("List after swapping :-");

ll.printlist();

}
}
