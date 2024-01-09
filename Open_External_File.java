public class LaunchingExternalApps
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        try
        {
            runtime.exec("notepad.exe");        //opens new notepad instance
 
            //OR runtime.exec("notepad");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


public class LaunchingExternalApps
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        try
        {
            runtime.exec("notepad I:\\sample.txt");        //opens "sample.txt" in notepad
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


public class LaunchingExternalApps
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "https://javaconceptoftheday.com/"};
 
        try
        {
            runtime.exec(s);        //opens "https://javaconceptoftheday.com/" in chrome browser
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


public class LaunchingExternalApps
{
    public static void main(String[] args) throws Exception
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        String[] s = new String[] {"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe", "F:\\sample.mp3"};
 
        Process process = runtime.exec(s);        //opens "sample.mp3" in VLC Media Player
    }
}


public class LaunchingExternalApps
{
    public static void main(String[] args) throws Exception
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        Process process = runtime.exec("notepad I:\\sample.txt");        //opens "sample.txt" in notepad
 
        Thread.sleep(5000);
 
        process.destroy();
    }
}