package com.leetcode.topic.array.simple;

/**
 * @author 李昭
 * @Date 8:09 2020/4/29
 * @Description:
 * @Modified By:
 */
public class RookCaptures {

    /**
     * 999. 可以被一步捕获的棋子数
     *      在一个 8 x 8 的棋盘上,有一个白色的车(Rook),用字符'R'表示.
     *      棋盘上还可能存在空方块,白色的象(Bishop)以及黑色的卒(pawn),
     *      分别用字符'.','B'和'p'表示.不难看出,大写字符表示的是白棋,小写字符表示的是黑棋.
     *      车按国际象棋中的规则移动.
     *      东,西,南,北四个基本方向任选其一,然后一直向选定的方向移动,直到满足下列四个条件之一:
     *          棋手选择主动停下来.
     *          棋子因到达棋盘的边缘而停下.
     *          棋子移动到某一方格来捕获位于该方格上敌方(黑色)的卒,停在该方格内.
     *          车不能进入/越过已经放有其他友方棋子(白色的象)的方格,停在友方棋子前.
     *          你现在可以控制车移动一次,请你统计有多少敌方的卒处于你的捕获范围内(即,可以被一步捕获的棋子数).
     *      实例:
     *          {
     *              {'.','.','.','.','.','.','.','.'},
     *              {'.','.','.','p','.','.','.','.'},
     *              {'.','.','.','R','.','.','.','p'},
     *              {'.','.','.','.','.','.','.','.'},
     *              {'.','.','.','.','.','.','.','.'},
     *              {'.','.','.','p','.','.','.','.'},
     *              {'.','.','.','.','.','.','.','.'},
     *              {'.','.','.','.','.','.','.','.'},
     *          }
     *          从R开始,上下左右均有三个卒可以被直接捕获
     *       解法:
     *          1, 找到车所在的位置
     *          2, 向上下左右四个方法遍历
     *
     * @param board
     * @return
     */
    public int numRookCaptures(char[][] board) {
        int rx = 0,ry = 0;
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == 'R') {
                    rx = i;
                    ry = j;
                }
            }
        }
        int count = 0;
        //1, 向上遍历查找
        for (int i = rx;i >= 0; --i) {
            if (board[i][ry] == 'B') {
                break;
            } else if (board[i][ry] == 'p') {
                count++;
                break;
            }
        }
        //2, 向下遍历
        for (int i = rx; i < board.length; ++i) {
            if (board[i][ry] == 'B') {
                break;
            } else if (board[i][ry] == 'p') {
                count++;
                break;
            }
        }
        //3, 向左遍历
        for (int i = ry; i >= 0; --i) {
            if (board[rx][i] == 'B') {
                break;
            } else if (board[rx][i] == 'p') {
                count++;
                break;
            }
        }
        //4, 向右遍历
        for (int i = ry;i < board[0].length; ++i) {
            if (board[rx][i] == 'B') {
                break;
            } else if (board[rx][i] == 'p') {
                count++;
                break;
            }
        }
        return count;
    }
}
