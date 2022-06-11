package virtual_key_repositary;

import java.io.File;
import java.util.Arrays;

public class ListDir 
{
	public void listFiles(String dirName)
	{
		checkDirExists(dirName);
		
		File dir = new File(dirName);
        
		//TODO: Need to check if directory  is empty or not
		/*System.out.print("len " +dir.length());
        if (dir.length()==1)
        {
        	System.out.println("Directory"+dirName+"is empty\n");
        	return;
        }*/
        
        File[] files = dir.listFiles();
        
        Arrays.sort(files);
        
        System.out.println("\nListing files in Directory "+dirName);
        
        if (files != null && files.length > 0) {
        	System.out.println("\n############ FILE LIST START ####################");
            for (File file : files) {
                // Check if the file is a directory
                if (!file.isDirectory()) {
                	System.out.println(file.getName());
                }
            }
            System.out.println("############ FILE LIST END ####################\n");
            }
      
	}
	
	public void checkDirExists(String dirName)
	{
		File theDir = new File(dirName);
		if (!theDir.exists()){
		    theDir.mkdirs();
		}
		return;
	}

}

