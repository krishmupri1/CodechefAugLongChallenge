import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

    public class WallsAndGate {
    static int[][]  rooms;
    static Queue<int[]> q;
    final static int inf=Integer.MAX_VALUE-1;



    public static void main(String [] args){
        q=new LinkedList<>();
        rooms=new int[][]{

                {inf,-1,0,inf},
                {inf,inf,inf,-1},
                {inf,-1,inf,-1},
                {0,-1,inf,inf}
        };

        int row=rooms.length;
        int col=rooms[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rooms[i][j]==0){
                    q.offer(new int[]{i,j});
                    bfs();
                }
            }
        }
        for(int[] i:rooms)
            System.out.println(i[0]+" "+i[1]+" "+i[2]+" "+i[3]);
    }
    public static void bfs(){
        int [][]dir=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        int curr[]=q.poll();
        int count=0;
        while(!q.isEmpty()){
            for(int[] s:dir){
                int row=curr[0]+s[0];
                int col=curr[1]+s[1];

                if(row<0 || row==rooms.length || col<0 || col==rooms[0].length || rooms[row][col]==-1)continue;

                if(rooms[row][col]==inf){
                    rooms[row][col]=count;
                }
                else{
                    q.offer(new int[]{row,col});
                }
            }
            count++;

        }
    }

}
