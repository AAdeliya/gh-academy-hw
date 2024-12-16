public class rangeAddQueries {
    //creating a bigger array, so that I don't have to care
    //about going out of bound in any computations
    public int[][] rangeAddQueries(int n, int[][] queries) {
          int[] a = new int[n+2][n+2];

    for (int[] query : queries) {
        //intentionally adding 1 to all indices to make the aaray and queries 1-indexed
        int r1 = query[0] +1, c1 = query[1] +1;
        int r2 = query[2] +1, c2 = query[3] +1;
        
    }
    }

  
    
}
