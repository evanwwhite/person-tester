import java.util.Scanner;

public class PersonTesterEW
{
   public static void main(String[] args)
   {
	Scanner kb = new Scanner(System.in);

	//The following instantiates person1
	//using the "default" constructor (no parameters).
	//The accessor methods are used to print the values.
	//The code follows for the person1 object.

	PersonTxtEW person1 = new PersonTxtEW();
	
	person1.setFirstName("Buzz");
	person1.setLastName("Lightyear");
	person1.setIdNum("12345");
	person1.setAge(25);
	
	System.out.println("First name: " + person1.getFirstName());
	System.out.println("Last name:  " + person1.getLastName());
	System.out.println("ID Number:  " + person1.getIdNum());
	System.out.println("Age:        " + person1.getAge());
	System.out.println();


	//TODO1:  Prompt the user for a first name (String)
	//Enter the first name
	System.out.print("Enter First name:   ");
	String firstName = kb.next();

	//TODO2:  Prompt the user for a last name (String)
	//Enter the last name
	System.out.print("Enter Last name:   ");
	String lastName = kb.next();
	
	//TODO3:  Prompt the user for an id number (String)
	//Enter the id number
	System.out.print("Enter Id num:   ");
	String idNum = kb.next();


	//TODO4:  Prompt the user for the age (int)
	//Enter the age
	System.out.print("Enter Age:   ");
	int age = kb.nextInt();


	//TODO5:   instantiate the person2 object of the Person class using the parameterized constructor.
	//Use the variables from TODO1, TODO2, TODO3, TODO4
	//Pay attention to the number, the order, and the data types of the parameters.
	PersonTxtEW person2 = new PersonTxtEW(firstName, lastName, idNum, age);

	//TODO6:  Access and print the 4 values for person2.

	System.out.println("First name: " + person2.getFirstName());
	System.out.println("Last name:  " + person2.getLastName());
	System.out.println("ID Number:  " + person2.getIdNum());
	System.out.println("Age:        " + person2.getAge());
	System.out.println();
	
	System.out.print("Enter First name:   ");
	firstName = kb.next();
	
	System.out.print("Enter Last name:   ");
	lastName = kb.next();
	
	System.out.print("Enter Id num:   ");
	idNum = kb.next();
	
	System.out.print("Enter Age:   ");
	age = kb.nextInt();

	System.out.print("Enter Grade:   ");
	int grade = kb.nextInt();

	System.out.print("Enter Gpa:   ");
	double gpa = kb.nextDouble();
	
	PersonTxtEW person3 = new PersonTxtEW(firstName, lastName, idNum, age, grade, gpa);
	
	System.out.println("First name: " + person3.getFirstName());
	System.out.println("Last name:  " + person3.getLastName());
	System.out.println("ID Number:  " + person3.getIdNum());
	System.out.println("Age:        " + person3.getAge());
	System.out.println("Grade:      " + person3.getGrade());
	System.out.println("GPA:        " + person3.getGPA());
	System.out.println();
	
	System.out.print("Enter First name:   ");
	firstName = kb.next();
	
	System.out.print("Enter Last name:   ");
	lastName = kb.next();
	
	System.out.print("Enter Id Num:     ");
	idNum = kb.next();
	
	System.out.print("Enter Age:   ");
	age = kb.nextInt();
	
	System.out.print("Enter Wage:    ");
	double wage = kb.nextDouble();
	
	System.out.print("Enter Hours Worked:");
	double hoursWorked = kb.nextDouble();
	
	PersonTxtEW person4 = new PersonTxtEW(firstName, lastName, idNum, age, wage, hoursWorked);
	
	System.out.println("First name:     " + person4.getFirstName());
	System.out.println("Last name:      " + person4.getLastName());
	System.out.println("Id Num:         " + person4.getIdNum());
	System.out.println("Age:            " + person4.getAge());
	System.out.println("Wage:           " + person4.getWage());
	System.out.println("Hours Worked:   " + person4.getHoursWorked());
	System.out.println("Salary:         " + person4.getSalary());
	System.out.println();
   }
}
/*
First name: Buzz
Last name:  Lightyear
ID Number:  12345
Age:        25

Enter First name:   Evan
Enter Last name:   White
Enter Id num:   1234
Enter Age:   123
First name: Evan
Last name:  White
ID Number:  1234
Age:        123

Enter First name:   Bob
Enter Last name:   Joe
Enter Id num:   66666
Enter Age:   43
Enter Grade:   34
Enter Gpa:   0.0
First name: Bob
Last name:  Joe
ID Number:  66666
Age:        43
Grade:      34
GPA:        0.0

Enter First name:   Joe
Enter Last name:   Mama
Enter Id Num:     0987
Enter Age:   1
Enter Wage:    45
Enter Hours Worked:30
First name:     Joe
Last name:      Mama
Id Num:         0987
Age:            1
Wage:           45.0
Hours Worked:   30.0
Salary:         1350.0
*/