import java.util.Scanner;

class GaussSeidal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*double A[][] = {
            {4,0.2,-0.3,0.1},
            {0.2,2,0.5,0.3},
            {0.1,0.2,9,-0.4},
            {0.2,-0.3,0.1,3}
        };*/
        System.out.print("Enter N=> ");
        int N = sc.nextInt();
        double A[][] = new double[N][N];
        Metrix.setMet(A);
        double X[] = {0,0,0,0};
        double X2[] = new double[4];
        //double B[] = {20.3,8.9,17.9,9.3};
        double []B = new double[N];
        Metrix.setMet(B);
        boolean isLess = false;
        //while(!isLess){
        for(int i = 0; i<20;i++){
            backUp(X,X2);
            cal(X,A,B);
            isLess = check(X2,X);
            print(X2);
        }
    }
    public static void backUp(double X[], double []X2){
        for(int i =0; i<X.length; i++){
            X2[i] = X[i];
        }
    }
    public static void cal(double X[], double[][] A, double []B){
        for(int i = 0 ; i< A.length; i++){
            X[i] = B[i];
            for(int j = 0; j<A[i].length;j++){
                if(i!=j){
                    X[i] -= A[i][j] * X[j];
                }
            }
            X[i] /= A[i][i];
        }
    }

    public static boolean check(double []X2, double []X) {
        for(int i = 0; i < X2.length; i++){
            if(X2[i]!=0&& Math.abs(X[i]-X2[i])/X2[i] >0.00000000000000000000001){
                return false;
            } if(X2[i] == 0){
                return false;
            }
        }
        return true;
    }
    public static void print(double []B){
        String text = "";
        for(int i = 0; i < B.length ; i++ ){
        System.out.printf(" X"+(i+1)+" = %.10f", B[i]);
        }
        System.out.println();
    }
}

/*
 * Test case 
 * input 
 4 2 1 -2 
 1 3 -1 1 
 2 1 3 1 
 1 1 1 5 
 22 15 22 25 
 * output X1 = 4.9999984749 X2 = 3.0000010371 X3 = 2.0000007013 X4 = 2.9999999573
 * 5 3 2 3
 */