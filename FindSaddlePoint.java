public static void findSaddlePoint(int[][] arr)
    {   
        for(int row=0;row<arr.length;row++)
        {
            int leastValColIndex = 0;

            for(int col=1;col<arr[0].length;col++)
            {
                if(arr[row][col] < arr[row][leastValColIndex])
                {
                    leastValColIndex = col;
                }
            }
            boolean found = true;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i][leastValColIndex] > arr[row][leastValColIndex])
                {
                    found = false;
                    break;
                }
            }
            if(found)
            {
                System.out.println("Saddle Point is: "+row+" , "+leastValColIndex);
                break;
            }
        }
    }
