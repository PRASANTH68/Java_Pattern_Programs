public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();            //First Method
 
        ArrayList<String> list2 = new ArrayList<String>(20);         //Second Method
 
        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);      //Third Method
    }
}


public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list.ensureCapacity(20);
 
        //Now 'list' can hold 20 elements.
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list.ensureCapacity(20);
 
        //Now 'list' can hold 20 elements.
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        //reducing the current capacity to current size of an ArrayList.
 
        list.trimToSize();
    }
}


public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<Double>();
 
        list.add(1.1);
 
        list.add(2.2);
 
        list.add(3.3);
 
        list.add(4.4);
 
        list.add(5.5);
 
        System.out.println(list);     //Output : [1.1, 2.2, 3.3, 4.4, 5.5]
 
        System.out.println("Size Of ArrayList = "+list.size());   //Output : Size Of ArrayList = 5
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<Double>();
 
        System.out.println(list.isEmpty());    //Output : true
    }
}




public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<Double>();
 
        list.add(1.1);
 
        list.add(11.11);
 
        list.add(111.111);
 
        list.add(1111.1111);
 
        //Checking whether list conatins '111.1111'
 
        System.out.println(list.contains(111.1111));    //Output : false
    }
}


public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("JAVA");
 
        list.add("SERVLETS");
 
        list.add("JAVA");
 
        list.add("STRUTS");
 
        System.out.println(list);     //Output : [JAVA, J2EE, JSP, JAVA, SERVLETS, JAVA, STRUTS]
 
        //Getting the index of first occurrence of "JAVA"
 
        System.out.println(list.indexOf("JAVA"));     //Output : 0
 
        //Getting the index of last occurrence of "JAVA"
 
        System.out.println(list.lastIndexOf("JAVA"));    //Output : 5
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("STRUTS");
 
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, STRUTS]
 
        //getting an array containing all elements of the list.
 
        Object[] array = list.toArray();
 
        //Printing the elements of the returned array.
 
        for (Object object : array)
        {
            System.out.println(object);
        }
 
//      Output :
 
//      JAVA
//      J2EE
//      JSP
//      SERVLETS
//      STRUTS
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        list.add(111);
 
        list.add(222);
 
        list.add(333);
 
        list.add(444);
 
        System.out.println(list);     //Output : [111, 222, 333, 444]
 
        //Getting element at index 3
 
        System.out.println(list.get(3));    //Output : 444
 
        //Getting element at index 1
 
        System.out.println(list.get(1));    //Output : 222
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        list.add(111);
 
        list.add(222);
 
        list.add(333);
 
        list.add(444);
 
        System.out.println(list);     //Output : [111, 222, 333, 444]
 
        //Replacing the element at index 1 with '000'
 
        list.set(1, 000);
 
        //Replacing the element at index 3 with '000'
 
        list.set(3, 000);
 
        System.out.println(list);   //Output : [111, 0, 333, 0]
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        System.out.println(list);     //Output : [ONE, TWO, THREE, FOUR]
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        System.out.println(list);     //Output : [ONE, TWO, THREE, FOUR]
 
        //Inserting "AAA" at index 1
 
        list.add(1, "AAA");
 
        //Inserting "BBB" at index 3
 
        list.add(3, "BBB");
 
        System.out.println(list);    //Output : [ONE, AAA, TWO, BBB, THREE, FOUR]
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("AAA");
 
        list.add("BBB");
 
        list.add("ccc");
 
        list.add("DDD");
 
        list.add("e");
 
        System.out.println(list);     //Output : [AAA, BBB, ccc, DDD, e]
 
        //Removing an element from position 2
 
        list.remove(2);
 
        System.out.println(list);    //Output : [AAA, BBB, DDD, e]
 
        //Removing an element from position 3
 
        list.remove(3);
 
        System.out.println(list);   //Output : [AAA, BBB, DDD]
    }
}


public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("AAA");
 
        list.add("BBB");
 
        list.add("AAA");
 
        list.add("CCC");
 
        list.add("BBB");
 
        System.out.println(list);     //Output : [AAA, BBB, AAA, CCC, BBB]
 
        //Removing first occurrence of "AAA"
 
        list.remove("AAA");
 
        System.out.println(list);    //Output : [BBB, AAA, CCC, BBB]
 
        //Removing first occurrence of "BBB"
 
        list.remove("BBB");
 
        System.out.println(list);   //Output : [AAA, CCC, BBB]
    }
}




public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
 
        list.add("AAA");
 
        list.add("BBB");
 
        list.add("AAA");
 
        list.add("CCC");
 
        list.add("BBB");
 
        System.out.println(list);     //Output : [AAA, BBB, AAA, CCC, BBB]
 
        //Removing all elements of the list
 
        list.clear();
 
        System.out.println(list);    //Output : []
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        list.add(111);
 
        list.add(222);
 
        list.add(333);
 
        list.add(444);
 
        list.add(555);
 
        list.add(666);
 
        System.out.println(list);     //Output : [111, 222, 333, 444, 555, 666]
 
        //Retrieving a SubList
 
        List<Integer> subList = list.subList(1, 4);
 
        System.out.println(subList);    //Output : [222, 333, 444]
 
        //Modifying the list
 
        list.set(2, 000);
 
        //Changes will be reflected in subList
 
        System.out.println(subList);    //Output : [222, 0, 444]
 
        //Modifying the subList
 
        subList.set(2, 000);
 
        //Changes will be reflected in list
 
        System.out.println(list);    //Output : [111, 222, 0, 0, 555, 666]
    }
}



public class MainClass
{
    public static void main(String[] args)
    {   
        ArrayList<Integer> list1 = new ArrayList<Integer>();
         
        list1.add(111);
         
        list1.add(222);
         
        list1.add(333);
         
        list1.add(444);
         
        System.out.println(list1);     //Output : [111, 222, 333, 444]
         
        ArrayList<Integer> list2 = new ArrayList<Integer>();
         
        list2.add(555);
         
        list2.add(666);
         
        list2.add(777);
         
        list2.add(888);
 
        System.out.println(list2);    //Output : [555, 666, 777, 888]
         
        //Joining list1 and list2
         
        list1.addAll(list2);
         
        System.out.println(list1);    //Output : [111, 222, 333, 444, 555, 666, 777, 888]
    }
}



public class MainClass
{
    public static void main(String[] args)
    {   
        ArrayList<Integer> list1 = new ArrayList<Integer>();
         
        list1.add(111);
         
        list1.add(222);
         
        list1.add(333);
         
        list1.add(444);
         
        System.out.println(list1);     //Output : [111, 222, 333, 444]
         
        ArrayList<Integer> list2 = new ArrayList<Integer>();
         
        list2.add(555);
         
        list2.add(666);
         
        list2.add(777);
         
        list2.add(888);
 
        System.out.println(list2);    //Output : [555, 666, 777, 888]
         
        //Inserting all elements of list2 at index 2 of list1
         
        list1.addAll(2, list2);
         
        System.out.println(list1);    //Output : [111, 222, 555, 666, 777, 888, 333, 444]
    }
}
