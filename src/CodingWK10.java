
public class CodingWK10 {
	
	/*
	 * 	Write 5 stored procedures for the employees database.
	 *	Write a description of what each stored procedure does and how to use it.
	 *
	 *	Procedures should use constructs you learned about from your research assignment and be more than just queries.
	 *
	 */

	/*
	 *
	 *	[1] = Single Parameter -	 
	 *	
	 *	DELIMITER // 
	 *	CREATE PROCEDURE employee_info_id(IN empID INT)
	 *	BEGIN
	 *	SELECT * FROM employees WHERE emp_no = empID;
	 *	END // 
	 *
	 *	This will take in an emp_no and return the entire entry for the employee. 
	 *
	 *	CALL employee_info_id(10058) // 
	 *
	 *	[2] = Multiple Parameters -
	 *
	 *	DELIMITER //
	 *	CREATE PROCEDURE employee_info_fullname(IN fName nvarchar(30), lName nvarchar(30))
	 *	BEGIN
	 *	SELECT * FROM employees WHERE first_name = fName AND last_name = lName;
	 *	END //
	 *	
	 *	This, like the above single parameter - takes in TWO parameters (fName, lName) and returns the entry for the named employee
	 *
	 *	CALL employee_info_fullname('Parto','Bamford') //
	 *
	 *	[3] = LOOP -
	 *
	 *	DELIMITER //
	 *	CREATE PROCEDURE create_five_entries()  
	 *	I tried to make a loop - but ended up spending so much time on this that I am now 2 days late turning this in and stressing over
	 *	a loop for the employees database - I can't think of doing anything with the loop other than adding entries or changing them
	 *	and I haven't figured out how to do that with a loop yet or why I would. 
	 *
	 *	[4] = Conditionals - 
	 *	
	 *	DELIMITER //
	 *	CREATE PROCEDURE top_50_salaries_by_debt(IN dpt nvarchar(3))
	 *	BEGIN
	 *	SELECT e.first_name, e.last_name, s.salary FROM employees e
	 *	JOIN dept_emp de ON e.emp_no = de.emp_no
	 *	JOIN departments d ON de.dept_no = dept_no
	 *	JOIN salaries s ON e.emp_no = s.emp_no
	 *	WHERE d.dept_name = dpt
	 *	ORDER BY s.salary DESC limit 50;
	 *	END //
	 *
	 * 	This procedure will take the department name as an input and return the 50 employees with the highest salary in that department.
	 * 	
	 * 	CALL top_50_salaries_by_debt('Marketing') //
	 * 
	 * 	[5] = More parameters = 
	 * 
	 * 	DELIMITER //
	 * 	CREATE PROCEDURE edit_salary_gg(IN who INT(11),rich INT(11))
	 * 	BEGIN
	 * 	SELECT * FROM employees e 
	 * 	JOIN salaries s ON e.emp_no = s.emp_no
	 * 	WHERE e.emp_no = who;
	 * 	UPDATE salaries s SET salary = rich
	 * 	WHERE s.emp_no = who;
	 * 	SELECT * FROM employees e JOIN salaries s ON e.emp_no = s.emp_no
	 * 	WHERE e.emp_no = who;
	 * 	END //
	 * 
	 * 	So I had fun on this one and created a salary editing stored procedure that takes in an INT for the emp_no and the amount that you
	 * 	would like to change your salary too.  I ran the select query twice so you see what the salary was before and then after the change. 
	 * 	I thought it was cool, I had a weird problem where I changed one person's salary and then it duplicated the same person 10 times or
	 * 	maybe I'm thinking it inserted-over some other entries. I don't know, but worked fine after. 
	 *
	 * 
	 */
}
