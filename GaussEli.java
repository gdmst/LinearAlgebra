class GaussEli {
    
    static double data[][] = { { 4, 2, 1, -2, 22 }, { 1, 3, -1, 1, 15 }, { 2, 1, 3, 1, 22 }, { 1, 1, 1, 5, 25 } };
    static double X[][] = new double[4][1];
    public static void main(String[] args) {
        System.out.println();
        for(int i = 1; i<data.length;i++){
            for(int j = 0; j < i ; j++){
                makeAsZero(i, j, data[i][j]);
                printArray(data);
                System.out.println("--------------------");
            }
        }
        for(int i = data.length-1; i>=0; i--){ // backward
                X[i][0] = data[i][data.length];
            for(int j = data.length-1; j>i; j--){
                X[i][0] -= data[i][j]*X[j][0];
            }
            X[i][0] /= data[i][i];
        }
        printArray(X);
    }

    static void makeAsZero(int row1, int row2, double value){
        for(int i = 0; i < data[0].length; i++ ){
            data[row1][i] -= (data[row2][i] / data[row2][row2])*value;
        }
    }
    static void printArray(double data[][]){
        for(int i= 0; i < data.length; i++){
            for(int j = 0; j < data[0].length; j++){
                System.out.printf("%5.1f",data[i][j]);
            }
            System.out.println();
        }
    }
}