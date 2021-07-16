package 回文;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.util.Stack;

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class StringTest {

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        StringTest st=new StringTest();
        System.out.println(st.isPalindrome(s));


    }

    //先进行数据过滤，然后使用双指针进行判断回文
    public boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder();
        int s_length=s.length();
        for (int i = 0; i < s_length; i++) {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        int n=sb.length();
        int left=0,right=n-1;
        while(left<right){
            if(Character.toLowerCase(sb.charAt(left))!=Character.toLowerCase(sb.charAt(right))){
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }

    //先进行数据过滤，然后使用栈进行回文判断
    public boolean isPalindrome1(String s){
        int s_length=s.length();
        Stack stack1=new StringStack();
        Stack stack2=new StringStack();
        for (int i = 0; i < s_length-1; i++) {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack1.push(ch);
            }
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        while(!stack1.isEmpty()){
            if(stack1.pop()!=stack2.pop()){
                return false;
            }
        }
        return true;
    }

    //先进行数据过滤，然后使用栈进行回文判断

}
