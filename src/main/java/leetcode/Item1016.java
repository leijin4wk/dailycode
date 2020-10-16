package leetcode;

/**
 * 给定一个二进制字符串 S（一个仅由若干 '0' 和 '1' 构成的字符串）和一个正整数 N，如果对于从 1 到 N 的每个整数 X，
 * 其二进制表示都是 S 的子串，就返回 true，否则返回 false。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：S = "0110", N = 3
 * 输出：true
 * 示例 2：
 *
 * 输入：S = "0110", N = 4
 * 输出：false
 *  
 *
 * 提示：
 *
 * 1 <= S.length <= 1000
 * 1 <= N <= 10^9
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-string-with-substrings-representing-1-to-n
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Item1016 {
    public boolean queryString(String S, int N) {
        boolean flag=true;
        for (int i=1;i<=N;i++) {
            String subString=Integer.toBinaryString(i);
            if (!S.contains(subString)){
                return false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Item1016 item1016=new Item1016();
        System.out.println(item1016.queryString("110101011011000011011111000000",15));
    }
}
