import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String N = br.readLine();

		long n = Long.parseLong(N);
		long sum = 1;
		long count = 1;
		long startPoint = 1;
		long endPoint = 1;

		while (endPoint != n) {
			if(sum == n) {
				count++;
				endPoint++;
				sum = sum + endPoint;
			} else if(sum > n) {
				sum = sum-startPoint;
				startPoint++;
			} else if(sum < n) {
				endPoint++;
				sum = sum + endPoint;
			}
		}
		
		System.out.println(count);

	}

}