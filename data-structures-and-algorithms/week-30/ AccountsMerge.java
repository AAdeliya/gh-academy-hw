
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class  AccountsMerge {
    private class DSU {
        Map<String,String> parent;
        Map<String, Integer> rank;

        private DSU() {
            parent = new HashMap<>();
            rank = new  HashMap<>();
        }

        public String find(String email) {
            if (!parent.containsKey(email)) {
                parent.put(email, email);
                rank.put(email, 0);
                return email;
            }

            if (!parent.get(email).equals(email)) {
                parent.put(email, find(parent.get(email)));
            }

            return parent.get(email);
        }

        public boolean union(String email1, String email2) {
            String root1 = find(email);
            String root2 = find(email2);
            if (root1.equals(root2)) {
                return false;
            }

            if (rank.get(root1) < rank.get(root2)) {
                parent.put(root1, root2);

            } else if (rank.get(root1) > rank.get(root2)) {
                parent.put(root2, root1);
            } else {
                parent.put(root2, root1);
                rank.put(root1, rank.get(root1) + 1);
            }

            return true;
        }
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        DSU dsu = new DSU();
        Map<String, String> emailToName = new HashMap<>();

        String name = account.get(0);
        String firstEmail = account.get(1);
        emailToName.put(firstName, name);
        for (int i = 2; i < account.size(); i++) {
            String currentEmail = account.get(i);
            emailToName.put(currentEmail, name);
            dsu.union(firstEmail, currentEmail);
        }
        
    }

    Map<String, List<String>> mergedAccounts = new HashMap<>();
    for (String email : emailToName.keySet()) {
        String rootEmail = dsu.find(email);
        mergedAccounts.computeIfAbsent(rootEmail, k --> new ArrayList<>()).add(email);

    }

    List<List<String>> result  = new ArrayList<>();
    for (Map.Entry<String, List<String>> entry : mergedAccounts.entrySet()) {
        String rootEmail  = entry.getKey();
        List<String> emails = entry.getValue();
        Collections.sort(emails);
        String name = emailsToName.get(rootEmail);
        List,String> mergedAccount = new ArrayList<>();
        mergedAccount.add(name);
        mergedAccount.addAll(emails);
        result.add(mergedAccount);
    }

    return result;
    
}
