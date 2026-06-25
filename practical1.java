class node{
	int data;
	Node next;
}
public static Node create( Node start){
	Node P = new Node();
	System.out.println("Enter data");
	P.data = sc.nextInt();
	P.next = null;
	if(start == null)
	start = P;
	else{
	Node temp = start;
   while(temp.next = P){
   temp = temp.next;
   }
   temp.nexxt = P;
}
return start ;
}
public static void display(Node start){
	Node temp = start;
	while(temp != null ){
	System.out.print(temp.data + " ");
	temp = temp.next;
	} 
}
public static Node insBeg(Node start){
	Node P = new Node();
	System.out.println("enter daat: ");
	P.data = sc.nextInt();
	P.next = start;
	start = P;
	return start;
	}
	public static Node insEnd(Node start){
	Node P = new Node();
	System.out.println("enter daat: ");
	P.data = sc.nextInt();
	P.next = null;
	if(start == null){
	start = P;
	return start;
	}
	Node temp = start;
	while(temp.next!= null){
	temp = temp.next;
	}
	temp.next = P;
	return start;
	}
Public static void sum(Node start){
	int sum = 0;
	Node temp = start;
	while(P!= null){
	sum = sum + temp.data;
	temp = temp.next;
	}
	System.out.println("Sum= "+sum);
} 
public class practical{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    Node start = null;

    System.out.println("How many nodes?");
    int n = sc.nextInt();

    // Create List
    for(int i = 1; i <= n; i++)
    {
        start = create(start);
    }

    System.out.println("\nOriginal List:");
    display(start);

    // Insert at Beginning
    System.out.println("\nEnter data to insert at beginning:");
    start = insBeg(start);

    System.out.println("\nList after insertion at beginning:");
    display(start);

    // Insert at End
    System.out.println("\nEnter data to insert at end:");
    start = insEnd(start);

    System.out.println("\nList after insertion at end:");
    display(start);

    // Sum of Nodes
    System.out.println();
    sum(start);
}
}