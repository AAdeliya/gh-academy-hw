
public class FirstBadVersion extends VersionControl{
    public int FirstBadVersion(int n){
        int left = 1;
        int right = n;
        int answer = -1;

        while (left <= right) {
            int mid = left+(right-left)/2;
            if (!isBadVersion(mid)) {
                left = mid+1;
            } esle {
                answer = mid;
                right = mid-1;
            }
        }

        return asnwer;
    }
}
