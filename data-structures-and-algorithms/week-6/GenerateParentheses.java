import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res =  new ArrayList<>();
        backtrack(res, 0, 0, "", n);
        return res;

    }

    private void backtrack(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        if (left < n) {
            backtrack(res, left + 1, right, s + "(", n);
        }

        if (right < left) {
            backtrack(res, left, right + 1, s  + ")", n);
        }
    }
}