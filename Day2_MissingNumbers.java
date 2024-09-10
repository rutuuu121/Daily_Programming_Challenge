import java.util.Scanner;
public class Day2_MissingNumbers {
	public static int findMissingNumber(int[] arr, int n) {
		int totalSum = n*(n+1)/2;
		int arraySum = 0;
		for(int num: arr) {
			arraySum +=num;
		}
		
		return totalSum - arraySum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt()+1;
		int[] arr = new int[n-1];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(findMissingNumber(arr, n));
		sc.close();
	}
	

}
