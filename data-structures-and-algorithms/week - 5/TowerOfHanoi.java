package data-structures-and-algorithms.week - 5;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char from_rod, char aux_rod, char to_rod) {
        if (n == 1) {
            System.out.println("Take disk 1 from rod " + from_rod + " to rod" + to_rod);
            return;

        }

        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Take disk " + n + " fom rod" + from_rod + " to rod " + to_rod) ;
        towerOfHanoi( n -1, aux_rod, to_rod, from_rod);
    }
    
    public static void main(String[] args) {
        int n = 5;
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
