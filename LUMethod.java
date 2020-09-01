import java.util.Scanner;

class LUMethod {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n"); n = sc.nextInt();
        double [][]L = new double[n][n];
        double [][]U = new double[n][n];
        double A[][] = new double[n][n];
        double B[] = new double[n];
        double X[][] = new double[n][1];
        double D[][] = new double[n][1];
        System.out.println("Enter A "+n+"*"+n+" ");
        Metrix.setMet(A);
        System.out.println("Enter B "+n+"*1 ");
        Metrix.setMet(B);
        // put default val of L , U into metrices
        for (int i = 0; i < L.length; i++) {
            L[i][i] = 1;
        }
        Metrix.findLU(L, U, A);
        Metrix.findD(L, D, B);
        Metrix.findX(U, X, D);

        System.out.println("Metrix L");
        Metrix.printMet(L);
        System.out.println("Metrix U");
        Metrix.printMet(U);
        System.out.println("Metrix D");
        Metrix.printMet(D);
        System.out.println("Metrix X");
        Metrix.printMet(X);
    }
}
/*
 * Test case input 
 4 2 1 -2 
1 3 -1 1 
2 1 3 1 
1 1 1 5 
22 15 22 25 
output X1 = 4.9999984749 X2 = 3.0000010371 X3 = 2.0000007013 X4 = 2.9999999573 
5 3 2 3
 */