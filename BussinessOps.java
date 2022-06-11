package virtual_key_repositary;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;  

public class BussinessOps
{
	  
	
	public void createFile(String dirName,String fname)
	{
				
		File file = new File(dirName+"/"+fname);
		if(file.exists())
		{
			System.out.println("File "+fname+"  already exists");
			return;
		}
		else
		{
			System.out.println("Creating file "+fname);
		boolean result;  
		try   
		{  
			result = file.createNewFile();  //creates a new file  
			if(result)      // test if successfully created a new file  
			{  
				System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
			}  
			else  
			{  
				System.out.println("File already exist at location: "+file.getCanonicalPath());  
			}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();    //prints exception if any  
		}         
		}  
	}

	public void deleteFile(String dirName, String fname) 
	{
		File file = new File(dirName+"/",fname);
		
		if(!file.exists())
		{
			System.out.printf("File %s does not exist", fname);
			return;
		}
		
		System.out.println("Deleting file "+fname);

        if (file.delete()) {
            System.out.printf("File %s deleted successfully", fname);
        }
        else {
            System.out.printf("Failed to delete file %s", fname);
        }
		
	}
	public void searchFile(String dirName, String fname) {
		
		File file = new File(dirName+"/",fname);
		if(!file.exists())
		{
			System.out.printf("File %s does not exist", fname);
			return;
		}
		else {
			System.out.printf("File %s  exists", fname);
		}
		return;
		
	}
	public void businessMenu(String dirName)
	{
		Scanner s=new Scanner(System.in);
		Boolean flag = true;
	
		do
		{
			System.out.println("\n\t---------------------------------\n");
			System.out.println("\tBusiness Ops Menu\n");
			System.out.println("\t1:  To create new a file in "+dirName);
			System.out.println("\t2:  To delete a file from directory "+dirName);
			System.out.println("\t3:  To search a file in the dircetory "+dirName);
			System.out.println("\t4:  Return to Main Menu\n");
			System.out.println("\t---------------------------------\n");
			System.out.printf("Enter the choice: ");
			int choice=0;
			try {
				choice = Integer.parseInt(s.next());
			}
			catch (NumberFormatException e) {
                System.out.println(
                    "Please input choice from the menu only"
                    + "");
                continue;
            }
			switch(choice)
			{
			case 1:
				System.out.println("Enter file name to create");
				String fname = s.next();
				
				createFile(dirName, fname);
				
				break;
			case 2:
				System.out.println("Enter file name to delete");
				String delfname = s.next();
				deleteFile(dirName, delfname);
				//continue;
				break;
			case 3:
				System.out.println("Enter file name to search");
				String searchfname = s.next();
				System.out.println("Searching file "+searchfname);
				searchFile(dirName, searchfname);
				break;
			case 4:
				//Main menu
				flag = false;
				break;
			default:
				System.out.println("!! Wrong choice. Please enter correct choice from menu!!\n");
				break;
			}

		}while (flag == true);
		//s.close();
		
	}

}
