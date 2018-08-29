
public class ResearchWK10 {
	/*
	 *	Research MySQL Stored Procedures and write about at least 5 constructs that can be utilized in stored procedures and give 
	 *											examples of how you would use them.
	 *									  (i.e. loops, conditionals, parameters, etc...)
	 * 
	 */

	/*
	 *	1) One Parameter IN: this type of stored procedure can take a single datatype input from the user to perform a specific function
	 *		or search. The defining syntax would look like - CREATE PROCEDURE employee_info (IN empID INT) ... and then on to the procedure. 
	 *	
	 *	2) Multiple parameters IN: in this procedure you will insert two or more inputs to the function to retrieve a specific result. 
	 *		The immediate example I thought of is entering in a full name, so 2 separate strings - the first_name and the last_name to 
	 *		return the information regarding that specific employee. The CALL syntax would be: 
	 *		CALL this_multiple_parameters('Stanley','Kubrick');
	 *
	 *	3) Loops: in a looping stored procedure you can nestle a loop within your stored function - this could be really useful to fill 
	 *		tables with data or to alter specific parts of tables. Three types of loops that nestle in stored procedures are While Loops,
	 *		For Loops, and Repeat Loops - all of which use slightly different syntax but an overall similar structure. 
	 *
	 *	4) Conditionals: In these types of constructs within a stored procedure specific conditions can be added to narrow and refine a 
	 *		command or function with as much precision as is needed. In our employees DB, this could be manifested in a stored procedure
	 *		that returns only a specific set of individuals, like say - only those who are in the marketing department could be singled
	 *		out in a stored procedure to run some function (max salary, average salary, upcoming birthdays). 
	 *
	 *	5) Functions: I also found in my research that you can run functions through stored procedures. Used for something like if you 
	 *		wanted to find the area of a rectangle or some other math equation that requires input = although I couldn't actually get it to 
	 *		work myself on my system. 
					//This is what I ended up with. I will continue to check this out and study.
					CREATE PROCEDURE uspCalcArea(
					height float,
					width float)
					area float = 0.0;
					BEGIN TRY
					SELECT area = height * width;
					OUTPUT area;
					END //
	 *
	 * 	Bonus: I learned that an NVARCHAR is different from a VARCHAR in that the n-version can hold a column of any type of Unicode data
	 * 			whereas VARCHAR can only store 8-bit codepage. Once again an issue of space and efficiency I believe. Good to know though.
	 */

}
