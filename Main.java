class Main {

public static void main(String[] args) {

  int d = 4;

    for (int i = 1; i<=d; i++)
    {
      for (int j = d; j>=i; j--)System.out.print(" ");
      for (int j = i; j>0; j--)System.out.print("*");
      System.out.println(" ");
    }

    for (int i = 1; i<=d; i++)
    {
    System.out.print("    ");
    for (int j = 1; j<=i; j++)System.out.print("*");
    System.out.println(" ");
    }

    for (int i = 1; i<=d; i++)
    {
      for (int j = d; j>=i; j--)System.out.print(" ");
      for (int j = i; j>0; j--)System.out.print("*");
      System.out.println(" ");
    }
    for (int i = 1; i<=d; i++)
    {
    System.out.print("    ");
    for (int j = 1; j<=i; j++)System.out.print("*");
    System.out.println(" ");
    }
  }
}