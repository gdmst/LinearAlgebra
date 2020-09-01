class RowReduced {
    
    static double data[][] = { {4, 2, 1, -2, 22},
{1, 3, -1, 1, 15},
{2, 1, 3, 1, 22},
{1, 1, 1,5, 25}};
    public static void main(String[] args) {
        for(int i = 0; i < data.length; i++){ 
            for(int j = 0; j <= i; j++){
                if(i==j){ // diagonal
                    makeAsone(i, data[i][j]);
                } else { // lower triangle
                    makeAsZero(i, j, data[i][j]);
                }
                printArray();
                System.out.println("-------------------------");
            }
        }
        for(int i = data.length-2; i >= 0; i--){ //backward
            for(int j = data.length-1; j >i; j--) { // upper triangle
                makeAsZero(i, j, data[i][j]);
                printArray();
                System.out.println("-------------------------");
            }
        }

        for(int i = 0; i< data.length;i++){ // print B
        System.out.printf("X%d is %.3f%n",(i+1),data[i][data.length]);
        }
    }
    static void makeAsone(int row,double temp){
        //System.out.println("R'"+(row+1)+" = R" + (row+1) +"/"+temp);    
        for(int i = 0; i < data[row].length; i++){
            data[row][i] /= temp;
        }
    }

    static void makeAsZero(int row1, int row2, double value){
        //System.out.println("R'" + (row1+1) + " = R" + (row1+1) + " - " + value+"*R"+(row2+1));
        for(int i = 0; i < data[0].length; i++ ){
            data[row1][i] -= data[row2][i]*value;
        }
    }
    static void printArray(){
        for(int i= 0; i < data.length; i++){
            for(int j = 0; j < data[0].length; j++){
                System.out.printf("%5.1f",data[i][j]);
            }
            System.out.println();
        }
    }
}