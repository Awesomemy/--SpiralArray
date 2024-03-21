package test2;

import java.util.Arrays;

public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr1 = generateMatrix(3);
        int[][] arr2 = generateMatrix(4);
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
    }

    //给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
    public static int[][] generateMatrix(int n) {
        int loop = 0;//循环次数
        int[][] res = new int[n][n];
        int start = 0;//每一次循环的起始下标
        int count = 1;//定义填充数字
        int i, j;
        while (loop++ < n / 2) { //n就循环了n次,注意loop=n/2是进入了循环的
            i = start;     //建议在这里对i,j初始化,这样每一轮都能保证是在正确的位置开始的
            j = start;
            for (; j < n - loop; j++) {
                res[i][j] = count++;
            }
            for (; i < n - loop; i++) {
                res[i][j] = count++;
            }
            for (; j > start; j--) {
                res[i][j] = count++;
            }
            for (; i > start; i--) {
                res[i][j] = count++;
            }
            start++;
        }
        if (n % 2 == 1) {   //奇数还要填充中心元素
            res[start][start] = count;
        }
        return res;
    }
}
