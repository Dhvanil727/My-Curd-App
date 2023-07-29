package in.ac.adit;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Student student=new Student();
			String USERNAME="";
			String EMAIL="";
			String FIRSTNAME="";
			String LASTNAME="";
			int operation = 1;
			Scanner sc=new Scanner(System.in);
			while(operation!=5) {
				System.out.println("Select from below list :");
				System.out.println("1 : Insert");
				System.out.println("2 : Update");
				System.out.println("3 : Delete");
				System.out.println("4 : Search");
				System.out.println("5 : EXIT");
				operation = sc.nextInt();
				switch (operation) {
			  	case 1:
			      	System.out.println("Enter following details");
			      	System.out.println("Username");
			      	USERNAME = sc.next();
			      	System.out.println("Email");
			      	EMAIL = sc.next();
			      	System.out.println("First name");
			      	FIRSTNAME = sc.next();
			      	System.out.println("Last name");
			      	LASTNAME = sc.next();
			      
			      	student.createStudent(USERNAME, FIRSTNAME,LASTNAME, EMAIL);
			      	break;
			  	case 2:

					  	System.out.println("firstname");
					  	FIRSTNAME = sc.next();

					  	student.updateStudent(USERNAME, FIRSTNAME);

			      	break;
			  	case 3:
				  	System.out.println("Enter Username");
			      	USERNAME = sc.next();
			      	student.deleteStudent(USERNAME,EMAIL);
				  	break;
			  	case 4:

					  	student.getAllStudents();
					  	break;
			  	case 5:
			  		break;
			  	default:
			  		System.out.println("Wrong entry");
				  	
				}
				
			}
			sc.close();
		}

	}


