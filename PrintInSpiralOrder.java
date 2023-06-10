public static void printInSpiralOrder(int[][] arr) {

        int counter = 1;
        for(int col=0;col<arr[0].length;col++)
        {
            if(counter%2 ==0)
            {
                for(int row = arr.length-1;row>=0;row--)
                {
                    System.out.println(arr[row][col]);
                }
            }
            else{
                for(int row = 0;row<arr.length;row++)
                {
                    System.out.println(arr[row][col]);
                }
            }
            counter++;
        }
        
    }
