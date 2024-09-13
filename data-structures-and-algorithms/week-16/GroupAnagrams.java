import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<List, String>> groupAnogromy(String [] str){
        Map<String, List<String>> map = new HashMap<>();  //String is a key, List<Strng > value
        for (String : str) { //iterate thru each words in the collection string because String[] str
            char[] chars = word.toCharArray(); //convert word into charArray ['c'. 'a', 't']
            Arrays.sort(chars); //sort array ['a', 'c', 't']
            String sortedArray = new String(chars); //convert into string ["act"]

            if (!map.containsKey(sortedWord)) { //check if ["act"] exists into map
                map.put(sortedArray, new ArrayList<>()); //if not then add to the map

            }
            map.get(sortedWord).add(word); //original word is added to the map

        }
        return new ArrayList<>(map.values()); // map.values returns a collection of all lists in the map 

    
    
}
}
