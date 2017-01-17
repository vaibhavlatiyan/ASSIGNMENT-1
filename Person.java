import java.util.Scanner;

public class Person {
	private int age;
	
	public Person(int initialAge){
	if (initialAge>0){
		age = initialAge;
		}
	else {
		age = 0;
		System.out.println("Age is not valid, setting age to 0");
	}
	}
	
	public void yearPasses() {
	age = age + 1;
	}
	
	public void amIOld(){
	if(age<13){
		System.out.println("You are young");
		}
	else {
		if (age>=13 && age<18){
			System.out.println("You are teenager");
			}
		else {
			System.out.println("You are old");
		}
		}
	}
	
	public static void main (String []args) {
		int age1;
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter age: ");
	    age1 = scanner.nextInt();
	    
	    //creating object of the Person class 
	    Person person1 = new Person(age1);
	    
	    person1.amIOld();
	    
	    for(int count=1; count<=13; count++){
	    	person1.yearPasses();
	    }
	    
	    person1.amIOld();
	    }
}
