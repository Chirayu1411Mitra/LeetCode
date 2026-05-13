//public class lc79 {
//    public static void main(String[] args) {
//
//    }
//    static boolean exist(char[][] board, String word){
//            for(int i =0;i<board.length;i++){
//                for(int j =0;j<board[0].length;j++){
//                 //   if(board[i][j]==word.charAt(p1)){
//                    return dfs(board,word,0,0,0);
//                    }
//                }
//            }
//            return false;
//
//    }
//    static boolean dfs(char[][] board,String word,int r,int c, int index){
//          if(index==word.length()){
//              return true;
//          }
//          if(r<0 || r>board.length||c<0 || c>board[0].length){
//              return false;
//          }
//          char temp = board[r][c];
//            board[r][c]='*';
//          boolean found= dfs(board,word,r+1,c,index+1)||(dfs(board,word,r-1,c,index+1)||(dfs(board,word,r,c+1,index+1)||(dfs(board,word,r,c-1,index+1);
//
//          board[r][c]=temp;
//        return found;
//        }
//    }
//}
