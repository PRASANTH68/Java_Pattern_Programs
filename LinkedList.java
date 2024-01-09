public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("JDBC");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]
 
        String s = "JSP";
 
        //Checking whether list contains "JSP"
 
        boolean contains = list.contains(s);
 
        if(contains)
        {
            //If list contains "JSP", printing it's index
 
            System.out.println(list.indexOf(s));      //Output : 2
        }
 
        s = "STRUTS";
 
        //Checking whether list contains "STRUTS"
 
        contains = list.contains("STRUTS");
 
        if(contains)
        {
            //If list contains "STRUTS", printing it's index
 
            System.out.println(list.indexOf(s));
        }
    }
}



public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("JDBC");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]
 
        //Getting the Iterator object using descendingIterator() method
 
        Iterator<String> it = list.descendingIterator();
 
        //printing the elements of list in reverse order
 
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}


public class LinkedListExample
{
    public static void main(String[] args)
    {
        //Creating a LinkedList
 
        LinkedList<String> linkedList = new LinkedList<String>();
 
        //Adding elements at the end of the linkedList
 
        linkedList.add("ONE");
 
        linkedList.add("TWO");
 
        linkedList.add("THREE");
 
        linkedList.add("FOUR");
 
        linkedList.add("FIVE");
 
        //Printing the elements of linkedList
 
        System.out.println(linkedList);      //Output : [ONE, TWO, THREE, FOUR, FIVE]
 
        //Creating an ArrayList
 
        ArrayList<String> arrayList = new ArrayList<String>();
 
        arrayList.add("SIX");
 
        arrayList.add("SEVEN");
 
        arrayList.add("EIGHT");
 
        arrayList.add("NINE");
 
        //Printing the elements of ArrayList
 
        System.out.println(arrayList);      //Output : [SIX, SEVEN, EIGHT, NINE]
 
        //Appending arrayList at the end of linkedList
 
        linkedList.addAll(arrayList);
 
        //Printing the elements of linkedList
 
        System.out.println(linkedList);     //Output : [ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE]
    }
}




public class LinkedListExamples
{
    public static void main(String[] args)
    {
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        //adding the elements into the queue
 
        queue.offer(10);
 
        queue.offer(20);
 
        queue.offer(30);
 
        queue.offer(40);
 
        //Printing the elements of queue
 
        System.out.println(queue);      //Output : [10, 20, 30, 40]
 
        //Removing the elements from the queue
 
        System.out.println(queue.poll());    //Output : 10
 
        System.out.println(queue.poll());    //Output : 20
    }
}



public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
 
        //Adding elements at the end of the list
 
        list.add(10);
 
        list.addLast(20);
 
        list.offer(30);
 
        list.offerLast(40);
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [10, 20, 30, 40]
 
        //Adding elements at the beginning of the list
 
        list.offerFirst(1);
 
        list.addFirst(2);
 
        //Printing the elements of list
 
        System.out.println(list);     //Output : [2, 1, 10, 20, 30, 40]
    }
}


public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
 
        //Adding elements at the end of the list
 
        list.add(10);
 
        list.add(20);
 
        list.add(30);
 
        list.add(40);
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [10, 20, 30, 40]
 
        //Adding an element at index 2
 
        list.add(2, 9999);
 
        //Printing the elements of list
 
        System.out.println(list);     //Output : [10, 20, 9999, 30, 40]
 
        //Creating another LinkedList with elements to add
 
        LinkedList<Integer> list1 = new LinkedList<Integer>();
 
        //Adding elements at the beginning of the list1
 
        list1.addFirst(111);
 
        list1.addFirst(222);
 
        list1.addFirst(333);
 
        //Printing the elements of list1
 
        System.out.println(list1);     //Output : [333, 222, 111]
 
        //Adding all elements of list1 at index 3 of list
 
        list.addAll(3, list1);
 
        //Printing the elements of list
 
        System.out.println(list);    //Output : [10, 20, 9999, 333, 222, 111, 30, 40]
    }
}



public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        list.add("FIVE");
 
        list.add("SIX");
 
        list.add("SEVEN");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN]
 
        //Removing the elements from the head of the LinkedList
 
        list.poll();
 
        list.pollFirst();
 
        list.remove();
 
        list.removeFirst();
 
        //Printing the elements of list
 
        System.out.println(list);     //Output : [FIVE, SIX, SEVEN]
 
        //Removing elements from the end of the LinkedList
 
        list.pollLast();
 
        list.removeLast();
 
        //Printing the elements of list
 
        System.out.println(list);     //Output : [FIVE]
    }
}


public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [ONE, TWO, THREE, FOUR]
 
        //Replacing an element at index 2 with "ZERO"
 
        list.set(2, "ZERO");
 
        System.out.println(list);     //Output : [ONE, TWO, ZERO, FOUR]
    }
}



public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        list.add("FOURTH");
 
        list.add("FIFTH");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [FIRST, SECOND, THIRD, FOURTH, FIFTH]
 
        //Retrieving the elements from the head
 
        System.out.println(list.element());      //Output : FIRST
 
        System.out.println(list.getFirst());     //Output : FIRST
 
        System.out.println(list.peek());        //Output : FIRST
 
        System.out.println(list.peekFirst());     //Output : FIRST
 
        //Retrieving the elements from the tail
 
        System.out.println(list.peekLast());     //Output : FIFTH
 
        System.out.println(list.getLast());      //Output : FIFTH
    }
}



public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("JDBC");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]
 
        //Retrieving and removing an element at index 2 of the list
 
        System.out.println(list.remove(2));     //Output : JSP
 
        //Printing the elements of list
 
        System.out.println(list);     //Output : [JAVA, J2EE, SERVLETS, JDBC]
 
        //Only retrieving an element at index 2 of the list
 
        System.out.println(list.get(2));     //Output : SERVLETS
    }
}



public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("JDBC");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]
 
        //Getting the number of elements in list
 
        System.out.println(list.size());     //Output : 5
    }
}



public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
 
        //Adding elements at the end of the list
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("J2EE");
 
        list.add("JDBC");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, J2EE, JDBC]
 
        //Removing the first occurrence of "J2EE"
 
        list.removeFirstOccurrence("J2EE");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, JSP, J2EE, JDBC]
 
        //Removing the last occurrence of "J2EE"
 
        list.removeLastOccurrence("J2EE");
 
        //Printing the elements of list
 
        System.out.println(list);      //Output : [JAVA, JSP, JDBC]
    }
}



public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<Integer> stack = new LinkedList<Integer>();
 
        //pushing the elements into the stack
 
        stack.push(10);
 
        stack.push(20);
 
        stack.push(30);
 
        stack.push(40);
 
        //Printing the elements of stack
 
        System.out.println(stack);      //Output : [40, 30, 20, 10]
 
        //Poping out the elements from the stack
 
        System.out.println(stack.pop());    //Output : 40
 
        System.out.println(stack.pop());    //Output : 30
    }
}


public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
 
        //adding the elements to LinkedList
 
        linkedList.add(10);
 
        linkedList.add(20);
 
        linkedList.add(30);
 
        linkedList.add(40);
 
        linkedList.add(50);
 
        //Printing the elements of LinkedList
 
        System.out.println(linkedList);       //Output : [10, 20, 30, 40, 50]
 
        //Removing all elements of linkedList
 
        linkedList.clear();
 
        //Printing the elements of LinkedList
 
        System.out.println(linkedList);      //Output : []
    }
}


public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
 
        //adding the elements to LinkedList
 
        linkedList.add(10);
 
        linkedList.add(20);
 
        linkedList.add(30);
 
        linkedList.add(40);
 
        linkedList.add(50);
 
        //Printing the elements of LinkedList
 
        System.out.println(linkedList);       //Output : [10, 20, 30, 40, 50]
 
        //Removing all elements of linkedList
 
        linkedList.clear();
 
        //Printing the elements of LinkedList
 
        System.out.println(linkedList);      //Output : []
    }
}



public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
 
        //adding the elements to linkedList1
 
        linkedList1.add(10);
 
        linkedList1.add(20);
 
        linkedList1.add(30);
 
        linkedList1.add(40);
 
        linkedList1.add(50);
 
        //Printing the elements of linkedList1
 
        System.out.println(linkedList1);       //Output : [10, 20, 30, 40, 50]
 
        //Creating another LinkedList
 
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
 
        //Cloning the linkedList1 into linkedList2
 
        linkedList2 = (LinkedList<Integer>) linkedList1.clone();
 
        //Printing the elements of linkedList2
 
        System.out.println(linkedList2);     //Output : [10, 20, 30, 40, 50]
    }
}


public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<String>();
 
        //adding the elements to linkedList
 
        linkedList.add("AAA");
 
        linkedList.add("BBB");
 
        linkedList.add("CCC");
 
        linkedList.add("BBB");
 
        linkedList.add("FFF");
 
        linkedList.add("BBB");
 
        //Printing the elements of linkedList
 
        System.out.println(linkedList);       //Output : [AAA, BBB, CCC, BBB, FFF, BBB]
 
        //Getting the position of last occurrence of "BBB"
 
        System.out.println(linkedList.lastIndexOf("BBB"));    //Output : 5
    }
}