package lt.string;

/**
 * @author: Justin Huang
 * @description:
 * @date: 2024/10/28 17:39
 */
public class LT459 {
    /*
    * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。

        示例 1:

        输入: s = "abab"
        输出: true
        解释: 可由子串 "ab" 重复两次构成。
        示例 2:

        输入: s = "aba"
        输出: false
        示例 3:

        输入: s = "abcabcabcabc"
        输出: true
        解释: 可由子串 "abc" 重复四次构成。 (或子串 "abcabc" 重复两次构成。)


        提示：


        1 <= s.length <= 104
        s 由小写英文字母组成
    *
    *
    * */
    public boolean repeatedSubstringPattern(String s) {
        /*暴力直接求解*/
        for (int length = 1; length <= s.length() / 2; length++) {
            String element = s.substring(0, length);
            //判断s是否可以被element重复多次构成
            if (isRepeated(s, element)) {
                return true;
            }
        }
        return false;
    }

    private boolean isRepeated(String s, String element) {
        if (s.length() % element.length() == 0) {
            //能够整除element，说明s有可能被element重复多次构成
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length() / element.length(); i++) {
                sb.append(element);
            }
            return s.equals(sb.toString());
        } else {
            return false;
        }
    }
}
