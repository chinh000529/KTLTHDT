package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DinhThat {
    static java.util.ArrayList<Integer> ke[] = new java.util.ArrayList[1005];
    static boolean chuaxet[] = new boolean[1005];
    static int start, end, n,m;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            n = in.nextInt();
            m =in.nextInt();
             start = in.nextInt();
             end =in.nextInt();
            for(int i=0;i<=n;i++){
                ke[i] = new ArrayList<>();
                chuaxet[i] =true;
            }
            for(int i=1;i<=m;i++){
                int a=in.nextInt();
                int b=in.nextInt();
                ke[a].add(b);
                //ke[b].add(a);
            }
            int total=0;
            for(int i=1;i<=n;i++){
                if(i!=start && i!=end){
                    reset();
                    chuaxet[i] =false;
                    if(!bfs()) {
                        total +=1;
                        //System.out.println(i);
                    }
                }
            }
            System.out.println(total);
            
        }
    }
    
    public static boolean bfs(){
        Queue<Integer> q =new LinkedList<>();
        q.add(start);chuaxet[start] = false;
        while(!q.isEmpty()){
            int v=q.poll();
            for(Integer i: ke[v]){
                if(i == end) {
                    //System.out.println(v);
                    return true;
                }
                if(chuaxet[i]){
                    chuaxet[i] = false;
                    q.add(i);
                }
            }
        }
        return false;
    }
    
    public static void reset(){
        for(int i=0;i<=n;i++){
            chuaxet[i] =true;
        }
    }
}
