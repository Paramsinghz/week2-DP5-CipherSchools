class Solution {
    public String reverseWords(String s) {

        int start = 0;
        String rev = reverseit(s, 0, s.length());
        String ans = "";

        for (int i = 0; i < rev.length(); i++) {

            if (rev.charAt(i) == ' ') {
                ans += reverseit(rev, start, i + 1);
                ans = ans.trim();
                start = i + 1;
            }

        }
        ans += " " + reverseit(rev, start, rev.length());
        ans = ans.trim();

        return ans;
    }

    public static String reverseit(String rev, int start, int end) {

        String op = "";
        char a;
        for (int i = start; i < end; i++) {
            a = rev.charAt(i);
            op = a + op;
        }

        return op;
    }

}