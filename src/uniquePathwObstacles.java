
public class uniquePathwObstacles {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int[][] sol=new int[n][m];
        for (int i=0;i<n;i++){
            if (obstacleGrid[i][0]==0){
                sol[i][0]=1; 
            }else{
                sol[i][0]=0;
                break;
            }
                
        }
        for (int j=0;j<m;j++){
            if (obstacleGrid[0][j]==0){
                sol[0][j]=1; 
            }else{
                sol[0][j]=0;
                break;
            }
        }
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if (obstacleGrid[i][j]==1){
                    sol[i][j]=0;
                }
                else{
                    sol[i][j]=sol[i][j-1]+sol[i-1][j];
                }  
            }
        }
        return sol[n-1][m-1];
    }
	public static void main(String[] args) {
		uniquePathwObstacles UPwO=new uniquePathwObstacles();
		int[][] obstacleGrid={{0,0,0},{0,1,0},{0,0,0}};
		//int[][] obstacleGrid={{1,0}};
		System.out.println(UPwO.uniquePathsWithObstacles(obstacleGrid));

	}

}
