import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class uri1013{

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int a,b,c,maiorAB, maiorABC;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		maiorAB = (a+b + Math.abs(a-b))/2;
		maiorABC = (maiorAB+c + Math.abs(maiorAB-c))/2;

		System.out.printf("%d e o maior\n",maiorABC);

		sc.close();
	}
}