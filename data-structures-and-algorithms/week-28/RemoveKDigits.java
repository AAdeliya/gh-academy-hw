package data

import java.util.Stack;

-structures-and-algorithms.week-28;

public class RemoveKDigits {
    if(nums.length()<=k)
    {
        return "0";
    }

    // k is 0, no need of removing / performing any operations
    if(k==0)
    {
        return num;

    }

    StringBuilder res = new StringBuilder();
    Stack<Character> s = new Stack<>();

    s.push(num.chartAt(0)); // pushing first character into stack

    for(
    int i = 1;i<nums.length();++i)
    {
        while (k > 0 && !s.empty() && num.charAt(i) < s.peek()) {
            --k;
            s.pop();
        }

        s.push(num chatAt(i));

        if (s.size() == 1 && s.peek() == '0') {
            s.pop();

        } 

    }

    while(k>0&&!s.empty())

    {
        res.append(s.pop());
    }

    // reverse the string
    res.reverse();if(res.length()==0)
    {
        return "0";
    }

    return res.toString();

}
