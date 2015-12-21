package baronat.bcs345.hwk.representative.business;

import baronat.bcs345.hwk.representative.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 
 * @author Jennifer Baronat
 * @version 1.0
 * @since 3/25/2015
 * 
 * Contains the class declaration
 */

public class RepresentativeCollection {
	
	private Representative[] Representatives;
	private int counter;
	
	//This is the constructor
	public RepresentativeCollection()
	{		
		Representatives = null;
		counter = 0;	
	}
	
	/**
	 * 
	 * @param name
	 * @return Representative member or null
	 */
	public Representative GetByName(String name)
	{
		for (int i = 0; i < Representatives.length; i++)
		{
			if (name .equals(Representatives[i].GetName()))
			{
				return Representatives[i];
			}			
		}
		return null;
	}
	
	/**
	 * 
	 * @param index
	 * @return Representative member at index or null
	 */
	public Representative GetByIndex(int index)
	{
		if (index >= 0 || index < Representatives.length)
		{
			return Representatives[index];
		}
		else
			return null;
	}
	
	/**
	 * 
	 * @throws Exception
	 * Is void so doesn't return anything and takes no parameters
	 */
	public void Report() throws Exception
	{	
		// variable names
				String Name;
				String Party;
				String State;
				String District;
				String Phone;
				String Office;
				String Link;
				
		int Democrats = 0;
		int Republicans = 0;
		int Other = 0;
	
		String OutputFileName; // = "RepresentativeReport.txt";
		
		//System.out.printf("Please enter the name of the output file (RepresentativeReport.txt): ");
		//Taking in user info for the output file
		Scanner key = new Scanner(System.in);
		//OutputFileName = key.nextLine();
		//System.out.printf("File Name: %s", OutputFileName);
		
		//Using the PrintStream to print to the output file
		PrintStream ps;
		ps = new PrintStream(System.out);
		
		//Printing out the report title
		ps.printf("Representative Report\n\n");
		
		// Header variables for formatting
		String NameH = "Name";
		String PartyH = "Party";
		String StateH = "State";
		String DistrictH = "District";
		String PhoneH = "Phone";	
		
		//Formating for the header titles
		ps.printf("%-20s", NameH);
		ps.printf("%5s ", PartyH);
		ps.printf("%-5s", StateH);
		ps.printf("%15s ", DistrictH);
		ps.printf("%12s\n", PhoneH);
		
		//Formating for the dashes
		ps.printf("%-20s", "----");
		ps.printf("%5s ", "-----");
		ps.printf("%-5s", "-----");
		ps.printf("%15s ", "--------");
		ps.printf("%12s\n", "-----");
		
		//****************************************
		// Loop to read in each record
		// Storing party counts
		// And printing out the record
		//****************************************
		
		for (int i = 0; i < Representatives.length; i++)
		{

			Name = Representatives[i].GetName();
			Party = Representatives[i].GetParty();
		
			if (Party.compareTo("D") == 0)
			{
				Democrats++;
			}
			else if (Party.compareTo("R") == 0)
			{
				Republicans++;
			}
			else {
				Other++;
			}			
		
			//Reading each line of data from the file and storing in variable
			State = Representatives[i].GetState();
			District = Representatives[i].GetDistrict();
			Phone = Representatives[i].GetPhone();
			Office = Representatives[i].GetOffice();
			Link = Representatives[i].GetLink();
			
			//Printing out data to output file
			ps.printf("%-20s", Name);
			ps.printf("%5s ", Party);
			ps.printf("%-5s", State);
			ps.printf("%15s ", District);
			ps.printf("%12s\n", Phone);
		
		} //end of while loop
		
		
		//*************************************
		// Calculating Total Party Members
		// Finding and converting to percentage
		//*************************************
		
		int Total;
		Total = Republicans + Democrats;
		int RepPercent;
		int DemPercent;
		int OtherPercent;
		DemPercent = (Democrats * 100/ Total);
		RepPercent = (Republicans * 100/ Total);
		OtherPercent = (Other * 100/ Total);		
		
		// Variables for header text
		String DemH = "Democrats";
		String RepH = "Republicans";
		String OtherH = "Other";
		
		//Formatting for spacing, includes percent symbols
		ps.printf("\nParty Summary\n\n");
		ps.printf("%-12s: %d (%d.00%%)\n", DemH, Democrats, DemPercent);
		ps.printf("%-12s: %d (%d.00%%)\n", RepH, Republicans, RepPercent);
		ps.printf("%-12s: %d (%d.00%%)\n", OtherH, Other, OtherPercent);
	}

	//Write method using the Write method from the Representative class
	/**
	 * 
	 * @param ps is used to write out to output file
	 */
	public void Write(PrintStream ps)
	{
		ps.println(counter);
		//System.out.println(counter);
		for (int i = 0; i < Representatives.length; i++)
		{
			Representatives[i].Write(ps);
		}
	}

	//Read method using the Read method from the Representative class
	/**
	 * 
	 * @param s - the string parameter is used to read in file
	 */
	public void Read(Scanner s)
	{
		counter = Integer.parseInt(s.nextLine());
		//System.out.println(counter);
		Representatives = new Representative[counter];		
		
		for (int i = 0; i < Representatives.length; i++)
		{
			Representatives[i] = new Representative();
			Representatives[i].Read(s);
		}
		
	}
	

	//Override toString() to print out in JSON
	@Override
	public String toString()
	{		
		String out;		
		out = "[";
		
		for (int i = 0; i < Representatives.length; i++)
		{	
			if (i != 0)
			{
				out += ",";
			}
			out += Representatives[i].toString();
		}
		return out + "]";
	}	

	
}
