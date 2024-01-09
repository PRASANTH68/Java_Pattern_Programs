public class MainClass
{
    public static void main(String[] args)
    {
        Random random = new Random();
 
        //Generating random integers using Random class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Integers : "+random.nextInt());
        }
 
        System.out.println("-----------------------------");
 
        //Generating random doubles using Random class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Doubles : "+random.nextDouble());
        }
 
        System.out.println("-----------------------------");
 
        //Generating random booleans using Random class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random booleans : "+random.nextBoolean());
        }
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        //Generating random doubles using Math.random()
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Doubles : "+Math.random());
        }
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        //Generating random integers using ThreadLocalRandom class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Integers : "+ThreadLocalRandom.current().nextInt());
        }
 
        System.out.println("-----------------------------");
 
        //Generating random doubles using ThreadLocalRandom class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Doubles : "+ThreadLocalRandom.current().nextDouble());
        }
 
        System.out.println("-----------------------------");
 
        //Generating random booleans using ThreadLocalRandom class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random booleans : "+ThreadLocalRandom.current().nextBoolean());
        }
    }
}



public class MainClass
{
    public static void main(String[] args)
    {
        //Generating random integers between 0 and 50 using Random class
 
        System.out.println("Random integers between 0 and 50 using Random class :");
 
        Random random = new Random();
 
        for (int i = 0; i < 5; i++)
        {
            System.out.println(random.nextInt(50));
        }
 
        //Generating random integers between 0 and 50 range using Math.random()
 
        System.out.println("Random integers between 0 and 50 using Math.random() :");
 
        for (int i = 0; i < 5; i++)
        {
            System.out.println((int)(Math.random() * 50));
        }
 
        //Generating random integers between 0 and 50 using ThreadLoclaRandom
 
        System.out.println("Random integers between 0 and 50 using ThreadLocalRandom :");
 
        for (int i = 0; i < 5; i++)
        {
            System.out.println(ThreadLocalRandom.current().nextInt(0, 50));
        }
    }
}