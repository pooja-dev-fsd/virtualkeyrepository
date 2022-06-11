package virtual_key_repositary;

import java.io.File;
import java.util.Arrays;

public class ListDir 
{
	public void listFiles(String dirName)
	{
		//1. Check if dirName is not created, then create it
		//2. get list of files and print
		checkDirExists(dirName);
		
		File dir = new File(dirName);
        
		//TODO: Need to check if directory  is empty or not
        
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

