package virtual_key_repositary;
import java.util.Scanner;


public class MainVIrtualKeyRepositary {
	
		
	public static void main(String[] args)
	{
		String currDir = System.getProperty("user.home");

		ListDir l=new ListDir();

		BussinessOps ops=new BussinessOps();
		String dirName = currDir + "/myFiles";
		Scanner s=new Scanner(System.in);
		
		System.out.println("*******************************************************");
		System.out.println("*        Welcome to the VIRTUAL KEY REPOSITORY        *");
		System.out.println("*******************************************************\n");

		System.out.println("Developed By  : Pooja Singh\n");
		
		Boolean flag = true;
		do
		{
			System.out.println("\n\t---------------------------------\n");
			System.out.println("\tMain Menu\n");
			System.out.println("\t1:  Get Filenames from the directory in sorted manner");
			System.out.println("\t2:  Business level operations");
			System.out.println("\t3:  Close the application");
			System.out.println("\n\t---------------------------------\n");
			System.out.println("Enter the choice:\n");
			int choice = 0;
			try {
				choice = Integer.parseInt(s.next());
			}
			catch (NumberFormatException e) {
                System.out.println(
                    "Please input choice from the menu only");
                continue;
            }
			switch(choice)
			{
			case 1:
				
				//1. Check if dirName is not created, then create it
				//2. get list of files and print
				l.listFiles(dirName);
				break;
			case 2:
				System.out.println("\nShowing Business level operations\n");
				//Class call for business ops
				ops.businessMenu(dirName);
				
				break;
			case 3:
				System.out.println("Thank you for using Virtual Key Repository. Come Again\n");
				flag = false;
				break;
			default:
				System.out.println("Wrong choice. Please enter correct choice from the menu\n");
				
				break;
			}
		}while (flag == true);
		s.close();
	}

}


