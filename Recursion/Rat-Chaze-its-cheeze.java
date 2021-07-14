import java.util.*;
public class Main 
{
    static boolean hasPath;
    public static void sol(char [][] maze,int cr,int cc,int er,int ec,int [][] vis)
    {
        if(cr<0 ||cc<0 || cc>ec ||cr>er||vis[cr][cc]==1||maze[cr][cc]=='X')
        {            
            return;        
        }
        if(cr==er && cc==ec)
        {
             vis[cr][cc]=1;
             hasPath=true;
           for (int i=0;i<vis.length;i++ )
            {
                for (int j=0;j<vis[0].length ;j++ )
                {
                    System.out.print(vis[i][j]+" ");
                }
                System.out.println();
            }
            return ;
        }
        vis[cr][cc]=1;
            sol(maze,cr-1,cc,er,ec,vis);
            sol(maze,cr+1,cc,er,ec,vis);
            sol(maze,cr,cc-1,er,ec,vis);
            sol(maze,cr,cc+1,er,ec,vis);
        vis[cr][cc]=0;
    }
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        char [][] maze =new char[row][column];
        int [][] vis=new int[row][column];
        int ci=0;
        int cc=0;
        int ei=row-1;
        int ec=column-1;
        hasPath=false;
        for(int i=0;i<row;i++)
        {
            String row1=sc.next();
            for(int j=0;j<column;j++)
            {
                maze[i][j]=row1.charAt(j);
            }
        }
        sol(maze,ci,cc,ei,ec,vis);     
        if(!hasPath){
            System.out.println("NO PATH FOUND");
        }
    }
}
