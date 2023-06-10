public static void findExitPoint(int[][] arr) {

        // make a direction variable
        // when dir == 0 go right
        // when dir == 1 go down
        // when dir == 2 go left
        // when dir == 3 go up
        // again make the direction back to 1

        int dir = 0;
        int i=0;
        int j=0;
        while(true)
        {
            dir = (dir+arr[i][j])%4;
            if(dir == 0)
            {
                j++;
            }
            else if(dir == 1)
            {
                i++;
            }
            else if(dir == 2)
            {
                j--;
            }
            else if(dir == 3)
            {
                i--;
            }

            if(i<0)
            {
                i++;
                break;
            }
            else if(j<0)
            {
                j++;
                break;
            }
            else if(i>arr.length)
            {
                i--;
                break;
            }
            else if(j>arr[0].length)
            {
                j--;
                break;
            }
        }
        System.out.println("Exit point is: "+i+" , "+j);
    }
