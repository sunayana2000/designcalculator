import java.util.Scanner;
public class Calculator {
 public static void main(String[] args) {
double n1,n2;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter first number : ");
n1 = scanner.nextDouble();
System.out.println("Enter second number : ");
n2 = scanner.nextDouble();
System.out.println("Enter an operator ( +, -, *, /) : ");
char operator = scanner.next().charAt(0);
scanner.close();
double output;
switch(operator)
{
case '+' : output = n1 + n2;
	   break;
case '-' : output = n1 - n2;
	   break;
case '*' : output = n1 * n2;
	   break;
case '/' : output = n1 / n2;
	   break;
default : System.out.println("You have entered wrong operator");
		return;
}
System.out.println(n1+" "+operator+" "+n2+" : "+output);
}
}