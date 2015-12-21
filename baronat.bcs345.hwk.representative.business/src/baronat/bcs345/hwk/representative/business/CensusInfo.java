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
public class CensusInfo {
	
	private String Zip;
	private int Population;
	private double AverageHouseValue;
	private double IncomePerHousehold;
	
	/**
	 * This is the constructor for the class. It initializes the
	 * member variables.
	 */
	public CensusInfo()
	{
		Zip = "11023";
		Population = 00001;
		AverageHouseValue = 1000001.0;
		IncomePerHousehold = 10000.0;	
	}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable Zip.
	 */
	public String GetZip()
	{return Zip;}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable Population.
	 */
	public int GetPopulation()
	{return Population;}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable AverageHouseValue.
	 */
	public double GetAverageHouseValue()
	{return AverageHouseValue;}
	/**
	 * This method retrieves the value in the member variable
	 * @return The variable IncomePerHousehold.
	 */
	public double GetIncomePerHousehold()
	{return IncomePerHousehold;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param z Zip variable
	 */
	public void SetZip(String z)
	{Zip = z;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param p Population variable
	 */
	public void SetPopulation(int p)
	{Population = p;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param ahv
	 */
	public void SetAverageHouseValue(double ahv)
	{AverageHouseValue = ahv;}
	/**
	 * This method places the parameter passed through into the member variable.
	 * @param iph
	 */
	public void SetIncomePerHousehold(double iph)
	{IncomePerHousehold = iph;}
	/**
	 * This method uses printstream input as a parameter to output data
	 * @param ps
	 */
	public void Write(PrintStream ps)
	{
		ps.printf("%s", Zip);
		ps.printf("%12d", Population);
		ps.printf("%15.1f", AverageHouseValue);
		ps.printf("%12.1f", IncomePerHousehold);
	}
	/**
	 * This method uses the Scanner method as a parameter to output read in data
	 * @param s
	 */
	public void Read(Scanner s)
	{
		//toString();
		Zip = s.next();
		//Integer.toString(Population).next();
		Population = s.nextInt();
		AverageHouseValue = s.nextDouble();
		IncomePerHousehold = s.nextDouble();
	}
	/**
	 * This method is to change the default function of the toString()
	 * @return The member variables in a formatted string (JSON)
	 */
	@Override
	public String toString()
	{			
		return "{ \"zip\": \"" + Zip 
				+ "\", \"population\": " + Population
	               + ", \"AverageHouseValue\": " + AverageHouseValue
	               + ", \"IncomePerHousehold\": " + IncomePerHousehold
	               + "}";
	}
}
