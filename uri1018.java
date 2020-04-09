import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class uri1018{

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int grana;
		grana = sc.nextInt();

		System.out.println(grana);

		System.out.printf("%d nota(s) de R$ 100,00\n", grana/100);
		grana = grana % 100;

		System.out.printf("%d nota(s) de R$ 50,00\n", grana/50);
		grana = grana % 50;

		System.out.printf("%d nota(s) de R$ 20,00\n", grana/20);
		grana = grana % 20;

		System.out.printf("%d nota(s) de R$ 10,00\n", grana/10);
		grana = grana % 10;

		System.out.printf("%d nota(s) de R$ 5,00\n", grana/5);
		grana = grana % 5;

		System.out.printf("%d nota(s) de R$ 2,00\n", grana/2);
		grana = grana % 2;

		System.out.printf("%d nota(s) de R$ 1,00\n", grana/1);
		grana = grana % 1;

		sc.close();
	}
}