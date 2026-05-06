package method_calling;

public class Calculator {
	int addition(int a,int b,int c) {
		int sum = a+b+c;
		return sum;
	}
void average(int n1,int n2,int n3) {
	Calculator c1 = new Calculator();
	int res = c1.addition(n1,n2,n3);
	int avg = res/3;
	System.out.println("the average of three number is =" + avg );
}
}
