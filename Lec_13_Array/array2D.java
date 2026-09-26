package REPO.DSA.JAVA.Lec_13_Array;

public class array2D {
    public static void main(String[] args) {
        int[][] arr = {
                    {9,8,7,6,2},
                    {1,24,57,68},
                    {4,2,75,62,34},
                    {789,25,1,57,98,75},
                    {75,35,46,4,7,7}
                };

        // int n = arr.length;              This will give number of row
        // For number of column in a row             arr[i].length
                
        
        int[][] brr;
        brr = new int[5][5];
        
        System.out.println("Elements of 2d array arr : ");
        for(int i = 0 ; i < arr.length ; i++ ){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n\nElements of 2d array brr : ");
        for(int[] row : brr){           
            for(int val : row){         
                System.out.print(val + " ");
            }
            System.out.println();
        }

        
    }
    
}



                                                       //Each element of 2D array is  a 1D array
// for(int[] row : brr){                               //So to store first element which is 1D array we need a array   (row is used)
//             for(int val : row){                     //Now we need to iterate the array stored in row 
//                 System.out.print(val + " ");        //with normal for each loop
//             }                                       //
//             System.out.println();                   //
//         }