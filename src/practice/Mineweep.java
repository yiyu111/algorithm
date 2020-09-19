package practice;

public class Mineweep {








    public char[][] updateBoard(char[][] board, int[] click) {
        char clicked=board[click[0]][click[1]];
        if(clicked=='M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }

        if(clicked=='E'){
            int mcount=0;
            int ecount=0;
            for(int i=Math.max(click[0]-1,0);i<click[0]+3;i++){
                for(int j=Math.max(click[1]-1,0);j<click[1]+3;j++){
                    char surr=board[i][j];
                    if(surr=='E')
                        ecount++;
                    if(surr=='M')
                        mcount++;
                }
            }
            if(mcount>0){
                board[click[0]][click[1]]=(char)(mcount+'0');
                return board;
            }else if(ecount>0){
                board[click[0]][click[1]]='B';
                for(int i=Math.max(click[0]-1,0);i<3;i++){
                    for(int j=Math.max(click[1]-1,0);j<3;j++){
                        char surr=board[i][j];
                        if(surr=='E')
                          return   updateBoard(board,new int[]{i,j});
                    }
                }
            }else
                return board;
        }
        return board;

    }



}
