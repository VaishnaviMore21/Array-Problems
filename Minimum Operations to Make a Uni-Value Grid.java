class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        int []arr=new int[m*n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[k++]=grid[i][j];
            }

        }
        int mod=arr[0]%x;
        for(int num:arr)
        {
            if(num%x!=mod)return -1;
        }
        Arrays.sort(arr);
        int target=arr[arr.length/2];
        int  moves=0;
        for(int num:arr)
        {
            moves+=Math.abs(num-target)/x;
        }
        return moves;
    }
}
