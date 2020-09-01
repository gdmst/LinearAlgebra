import java.util.Scanner;

public class LinearEquation{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter n");
        n = sc.nextInt();
        double[][] A = new double[n][n];
        double[][] adj = new double[n][n];
        double[][] B = new double[n][1];
        double [][]X = new double[n][1];
        System.out.println("Enter A " + n + "*" + n + " ");
        Metrix.setMet(A);
        System.out.println("Enter B " + n + "*1 ");
        Metrix.setMet(B);
        System.out.println();
        double detA = Metrix.det(A);
        System.out.println("det A is "+detA);
        if(detA == 0){
            System.out.println("There's no answer for this equation.");
        } else {
            adj = Metrix.adj(A);
            System.out.println("adj A is ");
            Metrix.printMet(adj); 
            // in case you need co-factor matrix just transpost the adj
            System.out.println();
            Metrix.devide(adj, detA);
            System.out.println("inverse A is ");
            Metrix.printMet(adj);
            System.out.println();
            System.out.println("X = Ainverse*B: ");
            Metrix.Multiple(adj, B, X);
            Metrix.printMet(X);
        }
    }
}