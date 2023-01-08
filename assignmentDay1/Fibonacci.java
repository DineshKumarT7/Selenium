package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstNum = 0;
int secondNum = 1;
int sum = 0;
	for (int i = 0; i < 11; i++) {
	System.out.println(firstNum);
	sum = firstNum + secondNum;
	firstNum = secondNum;
	secondNum = sum;
	
}
	}

}
