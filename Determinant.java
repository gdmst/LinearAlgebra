import java.util.Scanner;

class Determinant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N=> ");
        int N = sc.nextInt();
        double A[][] = new double[N][N];
        System.out.println("Enter Matrix"+N+"*"+N+" => ");
        Metrix.setMet(A);
        System.out.println("Determinant is "+Metrix.det(A));
    }
}