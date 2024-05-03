    public class array {
        static int[][] transpose(int arr[][]){
            int[][] matrix = new int[arr[0].length][arr.length];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    
                    matrix[j][i]=arr[i][j];
                    
                }
            }
            return matrix;
            
        }
        static void display(int array[][]){
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
          System.out.println("enter the lenght of array");
            int [][] my={{1,2,3,4},{5,6,7,8},{9,0,10,11},{12,13,14,15},{16,17,18,19}};
            System.out.println("simple matrix");
            display(my);
            System.out.println("transpose matrix");
            my =transpose(my);
            display(my);
            
        }}
    