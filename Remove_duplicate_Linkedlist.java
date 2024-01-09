import java.util.ArrayList;
import java.util.HashSet;
 
public class MainClass
{
    public static void main(String[] args)
    {
        //Constructing An ArrayList
 
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
 
        //Printing listWithDuplicateElements
 
        System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        //Constructing HashSet using listWithDuplicateElements
 
        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
 
        //Constructing listWithoutDuplicateElements using set
 
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
 
        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(listWithoutDuplicateElements);
    }
}



import java.util.ArrayList;
import java.util.LinkedHashSet;
 
public class MainClass
{
    public static void main(String[] args)
    {
        //Constructing An ArrayList
 
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
 
        //Printing listWithDuplicateElements
 
        System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        //Constructing LinkedHashSet using listWithDuplicateElements
 
        LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
 
        //Constructing listWithoutDuplicateElements using set
 
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
 
        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(listWithoutDuplicateElements);
    }
}



public class MainClass
{
    static void isBinaryOrNot(int number)
    {
        boolean isBinary = true;
 
        int copyOfNumber = number;
 
        while (copyOfNumber != 0)
        {
            int temp = copyOfNumber%10;   //Gives last digit of the number
 
            if(temp > 1)
            {
                isBinary = false;
                break;
            }
            else
            {
                copyOfNumber = copyOfNumber/10;    //Removes last digit from the number
            }
        }
 
        if (isBinary)
        {
            System.out.println(number+" is a binary number");
        }
        else
        {
            System.out.println(number+" is not a binary number");
        }
    }
 
    public static void main(String[] args)
    {
        isBinaryOrNot(128956);
 
        isBinaryOrNot((101110));
 
        isBinaryOrNot((42578));
 
        isBinaryOrNot((10110101));
    }
}