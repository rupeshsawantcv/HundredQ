// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class OddEvenCountInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            
            {1,2,3},{4,5,6},{7,8,9}
        };
        
        int even =0;
        int odd=0;
        
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] % 2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        
        System.out.println("Total Eeven Numbers in Matrix is: "+even);
         System.out.println("Total Odd Numbers in Matrix is: "+odd);
    }
}
