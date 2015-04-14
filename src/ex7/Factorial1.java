package ex7;

public class Factorial1 {
	public static int factorial(int x){
		int sum = x;
		if(x == 0){
			return 0;
		}else{
			for(int i = x-1; i > 1; i--){
				sum *= i;
			}
			return sum;
		}
	}
	public static void main(String[] args){
		System.out.println("繰り返しを使って階乗を求めます。");
		for(int i = 0; i < 6; i++){
			System.out.println(i + "の階乗は" + factorial(i));
		}
	}
}
