import java.util.Scanner;

public class FaktöriyelHesaplama {

	public static void main(String[] args) {
		// n! = 1 * 2 * 3 * 4 * 5 ...... * (n-1) * n
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Faktöriyel Sayısı : ");
		int n = sc.nextInt();
		int result = 1;
		
		for (int i = 1; i <=n; i++) {
			result *=i;
		}
		
		System.out.println("Sonuç " + result);
	}

}
