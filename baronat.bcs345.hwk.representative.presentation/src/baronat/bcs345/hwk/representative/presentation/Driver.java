package baronat.bcs345.hwk.representative.presentation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

import baronat.bcs345.hwk.representative.business.*;

/**
 * 
 * @author Jennifer Baronat
 * @version 1.0
 * @since 2/25/2015
 * 
 * Contains main program code. This class generates a report for state representatives.
 */
public class Driver {
	
	/**
	 * 
	 * @param args
	 * @throws Exception
	 * 
	 * Contains the main for this class
	 * Included throws Exception to avoid Eclipse stopping compile
	 */

	public static void main(String[] args) throws Exception
	
	{	// TODO Auto-generated method stub
		
		RepresentativeCollectionConsoleUI console = new RepresentativeCollectionConsoleUI();
		
		console.ShowUI();
	}
}
