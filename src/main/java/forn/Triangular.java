package forn;

public class Triangular {

	public static int triangular(int n){
		return (n <= 0) ? 0 : n * (n + 1) / 2;
	}
	
	public static int triangular2(int n){
		return (n <= 0) ? 0 : n + triangular2(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(triangular(10));
		System.out.println(triangular2(9));

	}

}
