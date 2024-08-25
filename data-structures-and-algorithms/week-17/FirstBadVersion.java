
public class FirstBadVersion extends VersionControl{
    public int FirstBadVersion(int n){
        int left= 0;
        int right = n;
        int answer = -1;

        while( left<=right) {
            int middle = left + (right+left)/2;
            if (!isBadVersion(middle)) {
                left = middle+1;

            } else {
                answer = middle;
                right = middle-1;

            }
        }
        return answer;
    }
}
