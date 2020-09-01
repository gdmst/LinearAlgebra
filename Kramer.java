import java.util.Scanner;

public class Kramer{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        n = sc.nextInt();
        double[][] A = new double[n][n];
        double[][] B = new double[n][1];
        System.out.println("Enter A " + n + "*" + n + " ");
        Metrix.setMet(A);
        System.out.println("Enter B " + n + "*1 ");
        Metrix.setMet(B); 
        //set A1double 
        // to replace B in each column of A
        double [][]A1 = Metrix.replace(A, B, 0); 
        double [][]A2 = Metrix.replace(A, B, 1);
        double [][]A3 = Metrix.replace(A, B, 2);
        double [][]A4 = Metrix.replace(A, B, 3);

        double detA = Metrix.det(A);
        double ans1, ans2, ans3, ans4, detA1, detA2, detA3, detA4;
        System.out.println("Mat A is ");
        Metrix.printMet(A);
        //System.out.println("Mat B is ");
        //Metrix.printMet(B);
        System.out.println("determinant A is " + detA);
        if(detA != 0){
            detA1 = Metrix.det(A1);
            detA2 = Metrix.det(A2);
            detA3 = Metrix.det(A3);
            detA4 = Metrix.det(A4);
            ans1 = detA1/detA;
            ans2 = detA2 / detA;
            ans3 = detA3 / detA;
            ans4 = detA4 / detA;
            System.out.println("det A1 is " + detA1+" x1 is "+ans1);
            System.out.println("det A2 is " + detA2 + " x2 is " + ans2);
            System.out.println("det A3 is " + detA3 + " x3 is " + ans3);
            System.out.println("det A4 is " + detA4 + " x4 is " + ans4);
        }
        else {
            System.out.println("There is no answer for this equation");
        }
    }
}