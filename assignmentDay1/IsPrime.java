package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 22;
boolean Result = false;

for (int i = 2; i <= n-1; i++) {
	if (n % i == 0) {
		Result = true;
		break;
	}
}
		if (!Result)
		{System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	
}

	}


