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


//Method to delete an item with a given key.

void deleteNode(int key)
{
Node temp = head,prev = null;



while(temp!=null && temp.data == key)       // If head node is to be deleted. 
{
head = temp.next;     //Head node changed.
return;
}


while (temp!=null && temp.data!=key)        //Iterate to get node to be deleted.
{
prev = temp;
temp = temp.next;
}


if (temp==null)  return;                   //If no such node found which is to be deleted.

prev.next = temp.next;                     //Unlink the node from linked list.  



}

//Method to delete an item at a given position.

void delete_at_position(int pos)
{

Node temp = head, prev = null;


if (pos==0)           //If head node is the position to delete.
{
head = temp.next;     //Head node changed.
return;
}



for (int i=0;temp!=null && i<pos;i++)       //Iterate to get node to be deleted.
{
prev = temp;
temp = temp.next;
}

if (prev==null || prev.next == null)        //If position is greater than no of elements in list.
{
return;
}



prev.next = temp.next;                  // Unlink the node at that position.

}

}



public class Deletion
{

public static void main(String args[])
{

linkedlist ll = new linkedlist();

for (int i=1;i<11;i++)         //For Inserting data linearly one after another.
{
ll.insert_at_back(i);

if (i==6)
ll.insert_at_back(7);       //Inserting wrong item to delete it afterwards. 
}

System.out.println("List before Deletion via key:-");

ll.printlist();

ll.deleteNode(7);         //delete the node containing key 7.

System.out.println("List after Deletion via key :-");

ll.printlist();

ll.delete_at_position(5);

System.out.println("List after Deletion via position :-");

ll.printlist();

}
}
