package forn;

public class MinService {

	public static int findMin(int[] args){
		return java.util.stream.IntStream.of(args).min().getAsInt();
	}
	
	public static int findMin2(int[] args){
		return java.util.Arrays.stream(args).min().getAsInt();
	}
	
	public static void main(String[] args) {
		int[] is=new int[]{1,2,3};
		System.out.println(findMin(is));
		System.out.println(findMin2(is));
	}

}
