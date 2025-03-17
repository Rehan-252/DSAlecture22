class Printspirlmatrix{

    static void printmatrix(int arry[][]){
        for(int i = 0; i < arry.length; i++){
            for(int j = 0; j < arry[i].length; j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void spiral(int arry[][], int num){
        int totalelement = 0;
        int top = 0, botm = num-1, left = 0, right = num-1;

        while(totalelement < num*num){
            // left to right;
            for(int i = left; i <= right && totalelement < num*num; i++){
                System.out.print(arry[top][i] + " ");
                totalelement++;
            }
            top++;
            // top to botum
            for(int i = top; i <= botm && totalelement < num*num; i++){
                System.out.print(arry[i][right] + " ");
                totalelement++;
            }
            right--;
            
            // right to left
            for(int i = right; i >= left && totalelement < num*num; i--){
                System.out.print(arry[botm][i] + " ");
                totalelement++;
            }
            botm--;
            // botum to top
            for(int i = botm; i >= top && totalelement < num*num; i--){
                System.out.print(arry[i][left] + " ");
                totalelement++;
            }
            left++;
        }

    }
    
    public static void main(String[] args) {
        int arry[][] = {{1,2,3,4,5}, 
                        {6,7,8,9,10}, 
                        {11,12,13,14,15}, 
                        {16,17,18,19,20}, 
                        {21,22,23,24,25}};
        printmatrix(arry);
        int num = arry.length; 
        spiral(arry,num);

    }
}