public class EqualityOfTwoArrays
{
    public static void main(String[] args)
    {   
        int[] arrayOne = {2, 5, 1, 7, 4};
         
        int[] arrayTwo = {2, 5, 1, 7, 4};
         
        boolean equalOrNot = true;
         
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
         
        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}



class EqualityOfTwoArrays
{
    public static void main(String[] args)
    {
        String[] s1 = {"java", "j2ee", "struts", "hibernate"};
 
        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
 
        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
 
        System.out.println(Arrays.equals(s1, s2));        //Output : false
 
        System.out.println(Arrays.equals(s1, s3));      //Output : true
    }
}



class EqualityOfTwoArrays
{
    public static void main(String[] args)
    {
        String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
 
        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
 
        Arrays.sort(s1);
 
        Arrays.sort(s2);
 
        System.out.println(Arrays.equals(s1, s2));       //Output : true
    }
}



public class EqualityOfTwoArrays
{
    public static void main(String[] args)
    {   
        String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
 
        String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
 
        System.out.println(Arrays.deepEquals(s1, s2));     //Output : true
         
        //Calling equals() method on same arrays will return false
         
        System.out.println(Arrays.equals(s1, s2));        //Output : false
         
        //That's why use deepEquals() method to compare multidimensional arrays
    }
}



public class AnagramProgram
{
    static void isAnagram(String s1, String s2)
    {
        //Removing white spaces from s1 and s2 and changing case to lower
 
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
 
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Converting copyOfs1 to char array
 
            char[] s1ToArray = copyOfs1.toCharArray();
 
            //Checking whether each character of s1ToArray is present in copyOfs2
 
            for (char c : s1ToArray)
            {
                int index = copyOfs2.indexOf(c);
 
                if(index != -1)
                {
                    //If character is present in copyOfs2, removing that char from copyOfs2
 
                    copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
                }
                else
                {
                    //If character is not present in copyOfs2, setting status as false and breaking the loop
 
                    status = false;
 
                    break;
                }
            }
        }
 
        //Output
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
 
    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");
 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");
    }
}



public class AnagramProgram
{
    static void isAnagram(String s1, String s2)
    {
        //Removing white spaces from s1 and s2 and converting case to lower
 
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
 
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Converting copyOfs1 to char array
 
            char[] s1Array = copyOfs1.toCharArray();
 
            //Constructing StringBuilder from copyOfs2
 
            StringBuilder sb = new StringBuilder(copyOfs2);
 
            //Checking whether each character of s1Array is present in sb
 
            for (char c : s1Array)
            {
                int index = sb.indexOf(""+c);
 
                if (index != -1)
                {
                    //If present, removing that character from sb
 
                    sb = sb.deleteCharAt(index);
                }
                else
                {
                    //If not present, setting status as false and breaking the loop
 
                    status = false;
 
                    break;
                }
            }
        }
 
        //Output
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
 
    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");
 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");
    }
}





public class AnagramProgram
{
    static void isAnagram(String s1, String s2)
    {
        //Removing white spaces from s1 and s2 and converting case to lower case
 
        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
 
        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
 
        //Initially setting status as true
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            status = false;
        }
        else
        {
            //Constructing a map containing character as a key and character occurrences as a value
 
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
            for (int i = 0; i < copyOfs1.length(); i++)
            {
                //Getting char from copyOfs1
 
                char charAsKey = copyOfs1.charAt(i);
 
                //Initializing char count to 0
 
                int charCountAsValue = 0;
 
                //Checking whether map contains this char
 
                if(map.containsKey(charAsKey))
                {
                    //If contains, retrieving it's count
 
                    charCountAsValue = map.get(charAsKey);
                }
 
                //Putting char and it's count to map with pre-incrementing char count
 
                map.put(charAsKey, ++charCountAsValue);
 
                //Getting char from copyOfs2
 
                charAsKey = copyOfs2.charAt(i);
 
                //Initializing char count to 0
 
                charCountAsValue = 0;
 
                //Checking whether map contains this char
 
                if(map.containsKey(charAsKey))
                {
                    //If contains, retrieving it's count
 
                    charCountAsValue = map.get(charAsKey);
                }
 
                //Putting char and it's count to map with pre-decrementing char count
 
                map.put(charAsKey, --charCountAsValue);
            }
 
            //Checking each character and it's count
 
            for (int value : map.values())
            {
                if(value != 0)
                {
                    //If character count is not equal to 0, then setting status as false
 
                    status = false;
                }
            }
 
        }
 
        //Output
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
 
    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");
 
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");
    }
}