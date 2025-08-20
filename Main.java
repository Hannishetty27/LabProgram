package lab2;

public class Main {
public static void main(String[]args)
{
Employee e1=new Employee("Hanni",101,70000)	;
Employee e2=new Employee("shetty",106,90000);
System.out.println("First Employee Details:");
e1.displayDetails();
e2.displayDetails();
e1.increaseSalary(20);
e2.increaseSalary(30);
System.out.println("Updated Employee Details");
e1.displayDetails();
e2.displayDetails();
}
}
