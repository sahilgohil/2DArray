public static void diagonalTraversal(int[][] arr) {

        for(int gap = 0;gap<arr.length;gap++)
        {
            for(int row=0,col=gap;col<arr[0].length;row++,col++)
            {
                System.out.println(arr[row][col]);
            }
        }
        
    }
