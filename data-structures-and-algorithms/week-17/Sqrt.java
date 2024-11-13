

public class Sqrt {
    public int mySqrt(int x) {
int left = 0;
int right  = x;
int answer = -1;

while (left<=right) {
    int mid = left + (right-left) {
        if ((long) mid*mid > (long)x) {
            right  = mid-1;

        }   else {
            answer = mid;
            left = mid+1;
        }

    }

    return answer;
}





    //     if(x == 0 || x == 1) return x;

    //     int left = 1;
    //     int right = x;
    //     int answer = -1;

    // while(left<=right){
    //     int middle = left + (right-left)/2;
    //     if((long) middle*middle> (long)x){
    //         right = middle -1;

    //     }else if(middle*middle  == x){
    //         return middle;

        
    //     }else{
    //         left = middle+1;

    //     }
    // }
    //     return Math.round(right);
    // }
    // }
    

