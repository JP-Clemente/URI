import java.util.Scanner;
 class MatrixMultiplication{

  public static void main(String args[])
  {
    int m, n, p, q;
    int sum = 0;
    int c, d, k;
 
    Scanner in = new Scanner(System.in);
    System.out.println("Tamanho da primeira matriz:");
    m = in.nextInt();
    n = in.nextInt();
 
    int first[][] = new int[m][n];
 
    System.out.println("Elementos da primeira matriz:");
 
    for (c = 0; c < m; c++)
      for (d = 0; d < n; d++)
        first[c][d] = in.nextInt();
 
    System.out.println("Tamanho segunda matriz:");
    p = in.nextInt();
    q = in.nextInt();
 
    if (n != p)//seca se matrizes podem ser multiplicadas
      System.out.println("Matrizes não podem ser multiplicadas");
    else
    {
      int second[][] = new int[p][q];
      int multiply[][] = new int[m][q];
 
      System.out.println("Elementos da segunda matriz:");
 
      for (c = 0; c < p; c++)
        for (d = 0; d < q; d++)
          second[c][d] = in.nextInt();
 
      for (c = 0; c < m; c++) {
        for (d = 0; d < q; d++) {
          for (k = 0; k < p; k++)
            sum = sum + first[c][k]*second[k][d];
 
          multiply[c][d] = sum;
          sum = 0;
        }
      }
 
      System.out.println("Matriz produto:");
 
      for (c = 0; c < m; c++) {
        for (d = 0; d < q; d++)
          System.out.print(multiply[c][d]+"\t");
 
        System.out.print("\n");
      }
    }
  }
}