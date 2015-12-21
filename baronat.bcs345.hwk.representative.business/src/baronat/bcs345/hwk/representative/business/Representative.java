package baronat.bcs345.hwk.representative.business;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * 
 * @author Jennifer Baronat
 * @version 1.0
 * @since 2/25/2015
 * 
 * Contains the Representative class
 *
 */
public class Representative
{
	private String Name;
	private String Party;
	private String State;
	private String District;
	private String Phone;
	private String Office;
	private String Link;
	
	/**
	 * This is the constructor for the class. It initializes the
	 * member variables.
	 */
	public Representative()
	{
		Name = "James";
		Party = "Indie";
		State = "California";
		District = "San Fran";
		Phone = "(510)435-0394";
		Office = "OfficeBuilding";
		Link = "www.example.com";	
	}
	
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable Name.
	 */
	public String GetName()
	{return Name;}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable Party.
	 */
	public String GetParty()
	{return Party;}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable State.
	 */	
	public String GetState()
	{return State;}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable District.
	 */
	public String GetDistrict()
	{return District;}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable Phone.
	 */
	public String GetPhone()
	{return Phone;}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable Office.
	 */
	public String GetOffice()
	{return Office;}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable Link.
	 */
	public String GetLink()
	{return Link;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param n Name variable
	 */
	public void SetName(String n)
	{Name = n;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param p Party variable
	 */
	public void SetParty(String p)
	{Party = p;} 
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param s State variable
	 */
	public void SetState(String s)
	{State = s;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param d District variable
	 */
	public void SetDistrict(String d)
	{District = d;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param p Phone variable
	 */
	public void SetPhone(String p)
	{Phone = p;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param o Office variable
	 */
	public void SetOffice(String o)
	{Office = o;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param l Link variable
	 */
	public void SetLink(String l)
	{Link = l;}
	/**
	 * This method uses printstream input as a parameter to output data
	 * @param ps
	 */
	public void Write(PrintStream ps)
	{
		ps.printf("%s\n", Name);
		ps.printf("%s\n", Party);
		ps.printf("%s\n", State);
		ps.printf("%s\n", District);
		ps.printf("%s\n", Phone);
		ps.printf("%s\n", Office);
		ps.printf("%s\n", Link);
	}
	/**
	 * This method uses the Scanner method as a parameter to output read in data
	 * @param s
	 */
	public void Read(Scanner s)
	{
		Name = s.nextLine();
		Party = s.nextLine();
		State = s.nextLine();
		District = s.nextLine();
		Phone = s.nextLine();
		Office = s.nextLine();
		Link = s.nextLine();
	}
	/**
	 * This method is to change the default function of the toString()
	 * @return The member variables in a formatted string (JSON)
	 */
	@Override
	public String toString()
	{		
		return "{ \"name\": \"" + Name 
				+ "\", \"party\": \"" + Party
	               + "\", \"state\": \"" + State
	               + "\", \"district\": \"" + District
	               + "\", \"phone\": \"" + Phone
	               + "\", \"office\": \"" + Office
	               + "\", \"link\": \"" + Link + "\"}";
	}	
}
