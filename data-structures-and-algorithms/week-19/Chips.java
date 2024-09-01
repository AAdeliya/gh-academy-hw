public class Chips {
    public static List<Integer> solveChipsProblem(int n) {
        List<Ineger> actions = new ArrayList<>();

        for(int = 1; i <=N; i++) {
            actions.add(i);
        }
        for (int i= N; i>= 1; i--) {
            actions.add(-i);

        }
        return actions;
    }
    public static void main(String[] args) {
        int N =3;
        List<Integer> result = solveChipsProblem(N);
        
        for (int action : result) {
            System.out.println(action + " ");

        }
        
    }
    
}
