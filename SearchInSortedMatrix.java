public static void searchInSortedMatrix(int[][] arr, int data) {        
        int row = 0;
        int col = arr[0].length-1;

        while(row < arr.length && col>=0 )2
        {
            if(arr[row][col] == data)
            {
                System.out.println("Fount at: "+row+" , "+col);
                break;
            }
            else if(arr[row][col] > data)
            {
                col--;
            }
            else{
                row++;
            }
        }
    }
