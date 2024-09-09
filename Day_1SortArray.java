import java.util.Scanner;

public class Day_1SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count0 = 0, count1 = 0, count2 =0;
		for(int num:arr) {
			if(num==0) {
				count0++;
			}
			else if(num==1){
				count1++;
			}
			else if(num==2) {
				count2++;
			}
		}
		int index = 0;
		while(count0 > 0) {
			arr[index++]=0;
			count0--;
		}
		while(count1 > 0) {
			arr[index++]=1;
			count1--;
		}
		while(count2 > 0) {
			arr[index++]=2;
			count2--;
		}
		for(int num:arr) {
			System.out.println(num+"");
		}
	}

}
