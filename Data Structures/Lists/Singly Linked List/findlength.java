class linkedlist
{
Node head;

static class Node
{
Node next;
int data;


Node (int data)
{
this.data = data;
}
}


void insert_at_back(int data)

{
Node n = new Node(data);


if (head==null)
{
head = n;
return;
}

Node temp = head;

while (temp.next!=null)
{
temp = temp.next;
}

temp.next = n;

}


void printList()
{
Node temp = head;



while (temp!=null)
{
System.out.println(temp.data);
temp = temp.next;
}
}

// Iterative approach to count nodes in linkedlist.

int count_iterative()
{
int count = 0;       //Initialize count variable to zero.

Node temp = head;   //Start counting the nodes from head node.

for (count = 0;temp!=null;count++)
temp = temp.next;                      //Iterating through every node and incrementing temp variable.



return count;
}


// Recursive approach to count nodes in linkedlist

int count_recursive(Node n)   // Pass the head node and successive nodes via recursion.
{
if (n == null)   //Break out of recursion when node is null;
{
return 0;
}


return 1 + count_recursive(n.next);   // Increment the return of method and iterate through list.
}


}


class findlength
{
public static void main(String args[])
{
linkedlist ll = new linkedlist();


for (int i=1;i<11;i++)
ll.insert_at_back(i);

System.out.println("List before counting elements:-");

ll.printList();

System.out.println("Iterative approach:- "+ll.count_iterative());

System.out.println("Recursive approach:- "+ll.count_recursive(ll.head));
}

}