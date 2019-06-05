/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 * 要点1:答案中不包含重复的三元组
 */
class LeetCode_242_038 {
    
    /**
     * WA 
     * 原因：ac 和 bb 的情况下 num == 0，需要判断所有字符出现次数相同
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int num = 0;
        for(int i = 0; i< s.length(); ++i) {
            num += s.charAt(i) - 'a';
            num -= t.charAt(i) - 'a';
        }
        
        return num == 0 ? true : false;
    }

    public static void main(String[] args) {
        LeetCode_242_038 testCode_242_038 = new LeetCode_242_038();
        System.out.println(testCode_242_038.isAnagram("aaab", "baaa"));
    }
}
