public class CapacityToShipPackagesWithinDdays {
    public int shipWithinDays(int[] weights, int D) {
        int left = 0;
        int right = 0;
        int asnwer = -1;

        for (int w: weights) {
            left = Math.max(left, w);
            right +=w;

        }

        while (left<=right) {
            int mid = left+right/2;
            int need = 1;
            int cur = 0;
            for (int w: weights) {
                if (cur + w > mid) {
                    need +=1;
                    cur = w;
                } else {
                    cur+=w;
                }
            }

            if (need > D) {
                left = mid+1;
            } else {
                answer = mid;
                right = mid+1;
            }


        }

        return asnwer;

















       int left = 0;
       int right = 0;
       int answer = -1;

        while (left<= right) {
            int middle = (left + right) / 2;
            int need = 1;
            int cur = 0;
            for (int w : weights) {
                if (cur + w > middle) {
                    need += 1;
                    cur = w;

                } else {
                    cur += w;

                } 
                

                for (int i = 0; i<=n; i++) {

                }
            }
            if (need > D) {
                left = middle + 1;

            } else {
                answer = middle;
                right = middle - 1;
                
            }



        }
        return answer;
    }
    
}
