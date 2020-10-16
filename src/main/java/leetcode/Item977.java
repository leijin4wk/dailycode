package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 *
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Item977 {


    public int[] sortedSquares(int[] A) {
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        for (int i=0;i<A.length;i++){
            queue.add(A[i]*A[i]);
        }
        int[] result=new int[A.length];
        for (int i=0;i<result.length;i++){
            result[i]=queue.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a={-7,-3,2,3,11};
        Item977 item977=new Item977();
        System.out.println(Arrays.toString(item977.sortedSquares(a)));
    }
    //
    // TODO 其他思路，栈  把小于0的入栈
    //
}
