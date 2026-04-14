class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        Set<Character>[]row=new HashSet[n];
        Set<Character>[]col=new HashSet[n];
        Set<Character>[]box=new HashSet[n];
        
        for(int i=0;i<n;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }

        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                char ch=board[r][c];
                if(ch=='.'){
                    continue;
                }

                if(row[r].contains(ch)){
                    return false;
                }
                row[r].add(ch);
                if(col[c].contains(ch)){
                    return false;
                }
                col[c].add(ch);

                int bidx=3*(r/3)+(c/3);

                if(box[bidx].contains(ch)){
                    return false;
                }
                box[bidx].add(ch);
                
            }
        }

        return true;

    }
}
