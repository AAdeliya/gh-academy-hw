public class VeryEasyProblem {
    int left = 0;
    int right = 0;
    int answer = -1;

    while (left<=right) {
        int mid = left+(right-left)/2;

        if (mid/x + mid/y >= n) {
            answer = mid;
            right = mid-1;



        } else {
            left = mid+1;
        }
    }

    return answer;
    
}
