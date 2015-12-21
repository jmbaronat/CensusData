package baronat.bcs345.hwk.representative.presentation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

import baronat.bcs345.hwk.representative.business.*;

import baronat.bcs345.hwk.representative.business.RepresentativeCollection;

/**
 * 
 * @author Jennifer Baronat
 * @version 1.0
 * @since 3/25/2015
 *
 */
public class RepresentativeCollectionConsoleUI {
	
	/**
	 * This is the UI method that is called in main.
	 * @throws Exception
	 */
	public void ShowUI() throws Exception
	{		
		RepresentativeCollection rc1 = new RepresentativeCollection();
		
		boolean quit = false;
		int menuItem = 0;
		int hasRun = 0; //allows to check if the Read method was called, otherwise other menu options have problems because no file was read
		
		do {
			System.out.printf("Representative Collection UI\n----------------------------\n");
			System.out.printf("1 – Read representative from file\n2 – Write representative to file\n3 – Show representative by index\n4 – Show representative by name\n5 – Show representative collection as string\n6 - Show representative collection report on screen\n7 - Exit\n");
			System.out.printf("Enter Choice: ");
			String InputFileName;
			String OutputFileName;
			Scanner input = new Scanner(System.in);
			FileReader fr;
			PrintStream ps;
			menuItem = input.nextInt(); //this is to track the switch options
			input.nextLine(); // fixes an issue with inputing data
			
			switch(menuItem) {
			case 1:
				System.out.println("You've chosen option 1");
				System.out.printf("Please enter the name of the input file (RepData.txt): ");
				InputFileName = input.next();
				fr = new FileReader(InputFileName);
				Scanner file = new Scanner(fr);
				rc1.Read(file);
				hasRun = 1;
				break;
			case 2:
				if (hasRun == 1){
				System.out.println("You've chosen option 2");
				System.out.printf("Please enter the name of the output file (OutputFile.txt): \n");
				OutputFileName = input.next();
				ps = new PrintStream(OutputFileName);
				rc1.Write(ps);
				}
				else
				System.out.printf("Please run the Read option first!");
				break;
			case 3:
				if (hasRun == 1){
				System.out.println("Enter the number of the index you want to look up:");
				int index = 0;
				index = input.nextInt();
				if (rc1.GetByIndex(index) == null)
				{
					System.out.println("Error with Index!");
				}
				else
					rc1.GetByIndex(index).Write(System.out);
				}
				else
				System.out.printf("Please run the Read option first!");
				break;
			case 4:
				if (hasRun == 1){
				System.out.println("Enter the name of the person you want to look up:");
				String name = input.nextLine();
				if (rc1.GetByName(name) == null)
				{
					System.out.println("Error with Name!");
				}
				else
					rc1.GetByName(name).Write(System.out);
				}
				else
					System.out.printf("Please run the Read option first!");
				break;
				
			case 5:
				if (hasRun == 1){
				System.out.println("You've chosen option 5");
				System.out.println(rc1.toString());
				}
				else
					System.out.printf("Please run the Read option first!");
				break;
			case 6:
				if (hasRun == 1){
				System.out.println("You've chosen option 6");
				rc1.Report();
				}
				else
					System.out.printf("Please run the Read option first!");
				break;
			case 7:
				System.out.println("You've chosen option 7");
				quit = true;
                break;
			default:
				System.out.println("Invalid choice.");
			} //end of switch statement
			
		} while (!quit);
		System.out.println("Bye!");
	}
}
