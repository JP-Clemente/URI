import java.util.Scanner;
public class InverteArray
{
   public static void main(String args[])
   {
	int counter, i=0, j=0, temp;
	int number[] = new int[100];
	Scanner scanner = new Scanner(System.in);
	System.out.print("Número de elementos de entrada: ");
	counter = scanner.nextInt();

	for(i=0; i<counter; i++)
	{
	    System.out.print("Entre com o elemento numero "+(i+1)+": ");
	    number[i] = scanner.nextInt();
	}

	j = i - 1;     
	i = 0;         
	scanner.close();
	while(i<j)
	{
  	   temp = number[i];
	   number[i] = number[j];
	   number[j] = temp;
	   i++;
	   j--;
	}

	System.out.print("Array inverso: ");
	for(i=0; i<counter; i++)
	{
	   System.out.print(number[i]+ "  ");
	}       
   }
}